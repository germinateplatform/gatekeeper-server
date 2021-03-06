/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import javax.annotation.Generated;

import jhi.gatekeeper.server.database.tables.*;


/**
 * Convenience access to all tables in germinate_gatekeeper
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables
{

    /**
     * The table <code>germinate_gatekeeper.access_requests</code>.
     */
    public static final AccessRequests ACCESS_REQUESTS = AccessRequests.ACCESS_REQUESTS;

    /**
     * The table <code>germinate_gatekeeper.database_systems</code>.
     */
    public static final DatabaseSystems DATABASE_SYSTEMS = DatabaseSystems.DATABASE_SYSTEMS;

    /**
     * The table <code>germinate_gatekeeper.database_version</code>.
     */
    public static final DatabaseVersion DATABASE_VERSION = DatabaseVersion.DATABASE_VERSION;

    /**
     * The table <code>germinate_gatekeeper.institutions</code>.
     */
    public static final Institutions INSTITUTIONS = Institutions.INSTITUTIONS;

    /**
     * Log table of password reset requests.
     */
    public static final PasswordResetLog PASSWORD_RESET_LOG = PasswordResetLog.PASSWORD_RESET_LOG;

    /**
     * The table <code>germinate_gatekeeper.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>germinate_gatekeeper.unapproved_users</code>.
     */
    public static final UnapprovedUsers UNAPPROVED_USERS = UnapprovedUsers.UNAPPROVED_USERS;

    /**
     * The table <code>germinate_gatekeeper.users</code>.
     */
    public static final Users USERS = Users.USERS;

    /**
     * The table <code>germinate_gatekeeper.user_has_access_to_databases</code>.
     */
    public static final UserHasAccessToDatabases USER_HAS_ACCESS_TO_DATABASES = UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES;

    /**
     * The table <code>germinate_gatekeeper.user_types</code>.
     */
    public static final UserTypes USER_TYPES = UserTypes.USER_TYPES;

    /**
     * VIEW
     */
    public static final ViewAccessRequestUserDetails VIEW_ACCESS_REQUEST_USER_DETAILS = ViewAccessRequestUserDetails.VIEW_ACCESS_REQUEST_USER_DETAILS;

    /**
     * VIEW
     */
    public static final ViewCounts VIEW_COUNTS = ViewCounts.VIEW_COUNTS;

    /**
     * VIEW
     */
    public static final ViewUnapprovedUserDetails VIEW_UNAPPROVED_USER_DETAILS = ViewUnapprovedUserDetails.VIEW_UNAPPROVED_USER_DETAILS;

    /**
     * VIEW
     */
    public static final ViewUserDetails VIEW_USER_DETAILS = ViewUserDetails.VIEW_USER_DETAILS;

    /**
     * VIEW
     */
    public static final ViewUserPermissions VIEW_USER_PERMISSIONS = ViewUserPermissions.VIEW_USER_PERMISSIONS;
}
