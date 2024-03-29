/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import jhi.gatekeeper.server.database.tables.AccessRequests;
import jhi.gatekeeper.server.database.tables.DatabaseSystems;
import jhi.gatekeeper.server.database.tables.Institutions;
import jhi.gatekeeper.server.database.tables.PasswordResetLog;
import jhi.gatekeeper.server.database.tables.SchemaVersion;
import jhi.gatekeeper.server.database.tables.UnapprovedUsers;
import jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases;
import jhi.gatekeeper.server.database.tables.UserTypes;
import jhi.gatekeeper.server.database.tables.Users;
import jhi.gatekeeper.server.database.tables.records.AccessRequestsRecord;
import jhi.gatekeeper.server.database.tables.records.DatabaseSystemsRecord;
import jhi.gatekeeper.server.database.tables.records.InstitutionsRecord;
import jhi.gatekeeper.server.database.tables.records.PasswordResetLogRecord;
import jhi.gatekeeper.server.database.tables.records.SchemaVersionRecord;
import jhi.gatekeeper.server.database.tables.records.UnapprovedUsersRecord;
import jhi.gatekeeper.server.database.tables.records.UserHasAccessToDatabasesRecord;
import jhi.gatekeeper.server.database.tables.records.UserTypesRecord;
import jhi.gatekeeper.server.database.tables.records.UsersRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * gatekeeper_db.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccessRequestsRecord> KEY_ACCESS_REQUESTS_PRIMARY = Internal.createUniqueKey(AccessRequests.ACCESS_REQUESTS, DSL.name("KEY_access_requests_PRIMARY"), new TableField[] { AccessRequests.ACCESS_REQUESTS.ID }, true);
    public static final UniqueKey<DatabaseSystemsRecord> KEY_DATABASE_SYSTEMS_PRIMARY = Internal.createUniqueKey(DatabaseSystems.DATABASE_SYSTEMS, DSL.name("KEY_database_systems_PRIMARY"), new TableField[] { DatabaseSystems.DATABASE_SYSTEMS.ID }, true);
    public static final UniqueKey<InstitutionsRecord> KEY_INSTITUTIONS_PRIMARY = Internal.createUniqueKey(Institutions.INSTITUTIONS, DSL.name("KEY_institutions_PRIMARY"), new TableField[] { Institutions.INSTITUTIONS.ID }, true);
    public static final UniqueKey<PasswordResetLogRecord> KEY_PASSWORD_RESET_LOG_PRIMARY = Internal.createUniqueKey(PasswordResetLog.PASSWORD_RESET_LOG, DSL.name("KEY_password_reset_log_PRIMARY"), new TableField[] { PasswordResetLog.PASSWORD_RESET_LOG.USER_ID, PasswordResetLog.PASSWORD_RESET_LOG.TIMESTAMP }, true);
    public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = Internal.createUniqueKey(SchemaVersion.SCHEMA_VERSION, DSL.name("KEY_schema_version_PRIMARY"), new TableField[] { SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK }, true);
    public static final UniqueKey<UnapprovedUsersRecord> KEY_UNAPPROVED_USERS_PRIMARY = Internal.createUniqueKey(UnapprovedUsers.UNAPPROVED_USERS, DSL.name("KEY_unapproved_users_PRIMARY"), new TableField[] { UnapprovedUsers.UNAPPROVED_USERS.ID }, true);
    public static final UniqueKey<UserHasAccessToDatabasesRecord> KEY_USER_HAS_ACCESS_TO_DATABASES_PRIMARY = Internal.createUniqueKey(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, DSL.name("KEY_user_has_access_to_databases_PRIMARY"), new TableField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID }, true);
    public static final UniqueKey<UserTypesRecord> KEY_USER_TYPES_PRIMARY = Internal.createUniqueKey(UserTypes.USER_TYPES, DSL.name("KEY_user_types_PRIMARY"), new TableField[] { UserTypes.USER_TYPES.ID }, true);
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_PRIMARY"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccessRequestsRecord, UsersRecord> ACCESS_REQUESTS_IBFK_1 = Internal.createForeignKey(AccessRequests.ACCESS_REQUESTS, DSL.name("access_requests_ibfk_1"), new TableField[] { AccessRequests.ACCESS_REQUESTS.USER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<AccessRequestsRecord, DatabaseSystemsRecord> ACCESS_REQUESTS_IBFK_2 = Internal.createForeignKey(AccessRequests.ACCESS_REQUESTS, DSL.name("access_requests_ibfk_2"), new TableField[] { AccessRequests.ACCESS_REQUESTS.DATABASE_SYSTEM_ID }, Keys.KEY_DATABASE_SYSTEMS_PRIMARY, new TableField[] { DatabaseSystems.DATABASE_SYSTEMS.ID }, true);
    public static final ForeignKey<PasswordResetLogRecord, UsersRecord> PASSWORD_RESET_LOG_IBFK_1 = Internal.createForeignKey(PasswordResetLog.PASSWORD_RESET_LOG, DSL.name("password_reset_log_ibfk_1"), new TableField[] { PasswordResetLog.PASSWORD_RESET_LOG.USER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<UnapprovedUsersRecord, InstitutionsRecord> UNAPPROVED_USERS_IBFK_1 = Internal.createForeignKey(UnapprovedUsers.UNAPPROVED_USERS, DSL.name("unapproved_users_ibfk_1"), new TableField[] { UnapprovedUsers.UNAPPROVED_USERS.INSTITUTION_ID }, Keys.KEY_INSTITUTIONS_PRIMARY, new TableField[] { Institutions.INSTITUTIONS.ID }, true);
    public static final ForeignKey<UnapprovedUsersRecord, DatabaseSystemsRecord> UNAPPROVED_USERS_IBFK_2 = Internal.createForeignKey(UnapprovedUsers.UNAPPROVED_USERS, DSL.name("unapproved_users_ibfk_2"), new TableField[] { UnapprovedUsers.UNAPPROVED_USERS.DATABASE_SYSTEM_ID }, Keys.KEY_DATABASE_SYSTEMS_PRIMARY, new TableField[] { DatabaseSystems.DATABASE_SYSTEMS.ID }, true);
    public static final ForeignKey<UserHasAccessToDatabasesRecord, UserTypesRecord> USER_HAS_ACCESS_TO_DATABASES_IBFK_1 = Internal.createForeignKey(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, DSL.name("user_has_access_to_databases_ibfk_1"), new TableField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_TYPE_ID }, Keys.KEY_USER_TYPES_PRIMARY, new TableField[] { UserTypes.USER_TYPES.ID }, true);
    public static final ForeignKey<UserHasAccessToDatabasesRecord, DatabaseSystemsRecord> USER_HAS_ACCESS_TO_DATABASES_IBFK_2 = Internal.createForeignKey(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, DSL.name("user_has_access_to_databases_ibfk_2"), new TableField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID }, Keys.KEY_DATABASE_SYSTEMS_PRIMARY, new TableField[] { DatabaseSystems.DATABASE_SYSTEMS.ID }, true);
    public static final ForeignKey<UserHasAccessToDatabasesRecord, UsersRecord> USER_HAS_ACCESS_TO_DATABASES_IBFK_3 = Internal.createForeignKey(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, DSL.name("user_has_access_to_databases_ibfk_3"), new TableField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<UsersRecord, InstitutionsRecord> USERS_IBFK_1 = Internal.createForeignKey(Users.USERS, DSL.name("users_ibfk_1"), new TableField[] { Users.USERS.INSTITUTION_ID }, Keys.KEY_INSTITUTIONS_PRIMARY, new TableField[] { Institutions.INSTITUTIONS.ID }, true);
}
