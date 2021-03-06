/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Timestamp;
import java.util.*;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.*;
import jhi.gatekeeper.server.database.tables.records.UsersRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Users extends TableImpl<UsersRecord>
{

    /**
     * The reference instance of <code>germinate_gatekeeper.users</code>
     */
    public static final  Users                              USERS                    = new Users();
    private static final long                               serialVersionUID         = 1736472017;
    /**
     * The column <code>germinate_gatekeeper.users.id</code>.
     */
    public final         TableField<UsersRecord, Integer>   ID                       = createField("id", SQLDataType.INTEGER.nullable(false).identity(true), this, "");
    /**
     * The column <code>germinate_gatekeeper.users.username</code>.
     */
    public final         TableField<UsersRecord, String>    USERNAME                 = createField("username", SQLDataType.VARCHAR(45).nullable(false), this, "");
    /**
     * The column <code>germinate_gatekeeper.users.password</code>.
     */
    public final         TableField<UsersRecord, String>    PASSWORD                 = createField("password", SQLDataType.VARCHAR(128).nullable(false), this, "");
    /**
     * The column <code>germinate_gatekeeper.users.full_name</code>.
     */
    public final         TableField<UsersRecord, String>    FULL_NAME                = createField("full_name", SQLDataType.VARCHAR(128).nullable(false), this, "");
    /**
     * The column <code>germinate_gatekeeper.users.email_address</code>.
     */
    public final         TableField<UsersRecord, String>    EMAIL_ADDRESS            = createField("email_address", SQLDataType.VARCHAR(128).nullable(false), this, "");
    /**
     * The column <code>germinate_gatekeeper.users.created_on</code>.
     */
    public final         TableField<UsersRecord, Timestamp> CREATED_ON               = createField("created_on", SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>germinate_gatekeeper.users.institution_id</code>.
     */
    public final         TableField<UsersRecord, Integer>   INSTITUTION_ID           = createField("institution_id", SQLDataType.INTEGER, this, "");
    /**
     * The column <code>germinate_gatekeeper.users.has_access_to_gatekeeper</code>.
     */
    public final         TableField<UsersRecord, Byte>      HAS_ACCESS_TO_GATEKEEPER = createField("has_access_to_gatekeeper", SQLDataType.TINYINT.defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>germinate_gatekeeper.users</code> table reference
     */
    public Users()
    {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.users</code> table reference
     */
    public Users(String alias)
    {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.users</code> table reference
     */
    public Users(Name alias)
    {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased)
    {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters)
    {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key)
    {
        super(child, key, USERS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType()
    {
        return UsersRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema()
    {
        return GerminateGatekeeper.GERMINATE_GATEKEEPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes()
    {
        return Arrays.<Index>asList(Indexes.USERS_FK_USERS_INSTITUTIONS1_IDX, Indexes.USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UsersRecord, Integer> getIdentity()
    {
        return Keys.IDENTITY_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey()
    {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys()
    {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UsersRecord, ?>> getReferences()
    {
        return Arrays.<ForeignKey<UsersRecord, ?>>asList(Keys.USERS_IBFK_1);
    }

    public Institutions institutions()
    {
        return new Institutions(this, Keys.USERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias)
    {
        return new Users(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(Name alias)
    {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name)
    {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name)
    {
        return new Users(name, null);
    }
}
