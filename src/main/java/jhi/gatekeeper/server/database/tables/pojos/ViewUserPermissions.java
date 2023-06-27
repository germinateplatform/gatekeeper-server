/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewUserPermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String  username;
    private Integer databaseId;
    private String  systemName;
    private String  serverName;
    private Integer userTypeId;
    private String  userType;

    public ViewUserPermissions() {}

    public ViewUserPermissions(ViewUserPermissions value) {
        this.userId = value.userId;
        this.username = value.username;
        this.databaseId = value.databaseId;
        this.systemName = value.systemName;
        this.serverName = value.serverName;
        this.userTypeId = value.userTypeId;
        this.userType = value.userType;
    }

    public ViewUserPermissions(
        Integer userId,
        String  username,
        Integer databaseId,
        String  systemName,
        String  serverName,
        Integer userTypeId,
        String  userType
    ) {
        this.userId = userId;
        this.username = username;
        this.databaseId = databaseId;
        this.systemName = systemName;
        this.serverName = serverName;
        this.userTypeId = userTypeId;
        this.userType = userType;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_id</code>.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.username</code>.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.database_id</code>.
     */
    public Integer getDatabaseId() {
        return this.databaseId;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.database_id</code>.
     */
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.system_name</code>.
     */
    public String getSystemName() {
        return this.systemName;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.system_name</code>.
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.server_name</code>.
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.server_name</code>.
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_type_id</code>.
     */
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_type_id</code>.
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_type</code>.
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_type</code>.
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewUserPermissions (");

        sb.append(userId);
        sb.append(", ").append(username);
        sb.append(", ").append(databaseId);
        sb.append(", ").append(systemName);
        sb.append(", ").append(serverName);
        sb.append(", ").append(userTypeId);
        sb.append(", ").append(userType);

        sb.append(")");
        return sb.toString();
    }
}
