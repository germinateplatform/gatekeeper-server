package jhi.gatekeeper.server.resource;

import jhi.gatekeeper.server.util.*;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.restlet.data.Status;
import org.restlet.resource.Delete;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.gatekeeper.resource.*;
import jhi.gatekeeper.server.Database;
import jhi.gatekeeper.server.auth.*;
import jhi.gatekeeper.server.database.tables.pojos.*;

import static jhi.gatekeeper.server.database.tables.DatabaseSystems.*;
import static jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases.*;
import static jhi.gatekeeper.server.database.tables.Users.*;
import static jhi.gatekeeper.server.database.tables.ViewUserDetails.*;

/**
 * @author Sebastian Raubach
 */
public class UserResource extends PaginatedServerResource
{
	public static final String PARAM_USERNAME = "username";
	public static final String PARAM_DATABASE = "database";
	public static final String PARAM_SERVER   = "server";

	private Integer id       = null;
	private String  username = null;
	private String  database = null;
	private String  server   = null;

	@Override
	public void doInit()
	{
		super.doInit();

		try
		{
			this.id = Integer.parseInt(getRequestAttributes().get("userId").toString());
		}
		catch (NullPointerException | NumberFormatException e)
		{
		}

		this.username = getQueryValue(PARAM_USERNAME);
		this.database = getQueryValue(PARAM_DATABASE);
		this.server = getQueryValue(PARAM_SERVER);
	}

	@OnlyAdmin
	@Delete("json")
	public boolean deleteJson()
	{
		if (id == null)
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND, StatusMessage.NOT_FOUND_ID.name());

		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			int result = context.deleteFrom(USERS)
								.where(USERS.ID.eq(id))
								.execute();

			return result > 0;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}

	@OnlyAdmin
	@Post("json")
	public boolean postJson(Users newUser)
	{
		if (newUser == null || newUser.getId() != null || id != null)
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt(TokenResource.SALT)));
			return context.newRecord(USERS, newUser).store() > 0;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}

	@Get("json")
	public PaginatedResult<List<ViewUserDetails>> getJson()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			CustomVerifier.UserDetails sessionUser = CustomVerifier.getFromSession(getRequest(), getResponse());

			SelectWhereStep<Record> step = context.select()
												  .hint("SQL_CALC_FOUND_ROWS")
												  .from(VIEW_USER_DETAILS);

			if (id != null)
			{
				// A user must be allowed to request their own details, but nothing else
				if (!Objects.equals(id, sessionUser.getId()))
					throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_ACCESS_TO_OTHER_USER.name());
				else
					step.where(VIEW_USER_DETAILS.ID.eq(id));
			}
			else if (username != null)
			{
				if (!CustomVerifier.isAdmin(getRequest(), getResponse()))
					throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INSUFFICIENT_PERMISSIONS.name());
				else
					step.where(VIEW_USER_DETAILS.USERNAME.eq(username));
			}
			else if (database != null && server != null)
			{
				if (!CustomVerifier.isAdmin(getRequest(), getResponse()))
					throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INSUFFICIENT_PERMISSIONS.name());
				else
					step.where(DSL.exists(DSL.selectOne()
											 .from(DATABASE_SYSTEMS)
											 .leftJoin(USER_HAS_ACCESS_TO_DATABASES).on(USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID.eq(DATABASE_SYSTEMS.ID))
											 .where(USER_HAS_ACCESS_TO_DATABASES.USER_ID.eq(VIEW_USER_DETAILS.ID))
											 .and(DATABASE_SYSTEMS.SERVER_NAME.eq(server))
											 .and(DATABASE_SYSTEMS.SYSTEM_NAME.eq(database))));
			}
			else
			{
				if (!CustomVerifier.isAdmin(getRequest(), getResponse()))
					throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INSUFFICIENT_PERMISSIONS.name());

				if (query != null && !"".equals(query))
				{
					query = "%" + query + "%";
					step.where(VIEW_USER_DETAILS.USERNAME.like(query)
														 .or(VIEW_USER_DETAILS.ADDRESS.like(query))
														 .or(VIEW_USER_DETAILS.EMAIL_ADDRESS.like(query))
														 .or(VIEW_USER_DETAILS.NAME.like(query))
														 .or(VIEW_USER_DETAILS.FULL_NAME.like(query))
														 .or(VIEW_USER_DETAILS.ACRONYM.like(query)));
				}

				if (ascending != null && orderBy != null)
				{
					// Camelcase to underscore
					orderBy = orderBy.replaceAll("(.)(\\p{Upper})", "$1_$2").toLowerCase();

					if (ascending)
						step.orderBy(DSL.field(getSafeColumn(orderBy)).asc());
					else
						step.orderBy(DSL.field(getSafeColumn(orderBy)).desc());
				}
			}

			List<ViewUserDetails> result = step.limit(pageSize)
											   .offset(pageSize * currentPage)
											   .fetch()
											   .into(ViewUserDetails.class);

			Integer count = context.fetchOne("SELECT FOUND_ROWS()").into(Integer.class);

			return new PaginatedResult<>(result, count);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
