/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import jhi.gatekeeper.server.database.tables.ViewUserPermissions;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewUserPermissionsRecord extends TableRecordImpl<ViewUserPermissionsRecord> implements Record9<Integer, String, String, Integer, String, String, Integer, String, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.database_id</code>.
     */
    public void setDatabaseId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.database_id</code>.
     */
    public Integer getDatabaseId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.system_name</code>.
     */
    public void setSystemName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.system_name</code>.
     */
    public String getSystemName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.server_name</code>.
     */
    public void setServerName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.server_name</code>.
     */
    public String getServerName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_type_id</code>.
     */
    public void setUserTypeId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_type_id</code>.
     */
    public Integer getUserTypeId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_permissions.user_type</code>.
     */
    public void setUserType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_permissions.user_type</code>.
     */
    public String getUserType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>gatekeeper_db.view_user_permissions.user_is_primary_contact</code>.
     */
    public void setUserIsPrimaryContact(Byte value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.view_user_permissions.user_is_primary_contact</code>.
     */
    public Byte getUserIsPrimaryContact() {
        return (Byte) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, Integer, String, String, Integer, String, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, Integer, String, String, Integer, String, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.EMAIL;
    }

    @Override
    public Field<Integer> field4() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.DATABASE_ID;
    }

    @Override
    public Field<String> field5() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.SYSTEM_NAME;
    }

    @Override
    public Field<String> field6() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.SERVER_NAME;
    }

    @Override
    public Field<Integer> field7() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.USER_TYPE_ID;
    }

    @Override
    public Field<String> field8() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.USER_TYPE;
    }

    @Override
    public Field<Byte> field9() {
        return ViewUserPermissions.VIEW_USER_PERMISSIONS.USER_IS_PRIMARY_CONTACT;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public Integer component4() {
        return getDatabaseId();
    }

    @Override
    public String component5() {
        return getSystemName();
    }

    @Override
    public String component6() {
        return getServerName();
    }

    @Override
    public Integer component7() {
        return getUserTypeId();
    }

    @Override
    public String component8() {
        return getUserType();
    }

    @Override
    public Byte component9() {
        return getUserIsPrimaryContact();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public Integer value4() {
        return getDatabaseId();
    }

    @Override
    public String value5() {
        return getSystemName();
    }

    @Override
    public String value6() {
        return getServerName();
    }

    @Override
    public Integer value7() {
        return getUserTypeId();
    }

    @Override
    public String value8() {
        return getUserType();
    }

    @Override
    public Byte value9() {
        return getUserIsPrimaryContact();
    }

    @Override
    public ViewUserPermissionsRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value4(Integer value) {
        setDatabaseId(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value5(String value) {
        setSystemName(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value6(String value) {
        setServerName(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value7(Integer value) {
        setUserTypeId(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value8(String value) {
        setUserType(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord value9(Byte value) {
        setUserIsPrimaryContact(value);
        return this;
    }

    @Override
    public ViewUserPermissionsRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, Integer value7, String value8, Byte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewUserPermissionsRecord
     */
    public ViewUserPermissionsRecord() {
        super(ViewUserPermissions.VIEW_USER_PERMISSIONS);
    }

    /**
     * Create a detached, initialised ViewUserPermissionsRecord
     */
    public ViewUserPermissionsRecord(Integer userId, String username, String email, Integer databaseId, String systemName, String serverName, Integer userTypeId, String userType, Byte userIsPrimaryContact) {
        super(ViewUserPermissions.VIEW_USER_PERMISSIONS);

        setUserId(userId);
        setUsername(username);
        setEmail(email);
        setDatabaseId(databaseId);
        setSystemName(systemName);
        setServerName(serverName);
        setUserTypeId(userTypeId);
        setUserType(userType);
        setUserIsPrimaryContact(userIsPrimaryContact);
    }

    /**
     * Create a detached, initialised ViewUserPermissionsRecord
     */
    public ViewUserPermissionsRecord(jhi.gatekeeper.server.database.tables.pojos.ViewUserPermissions value) {
        super(ViewUserPermissions.VIEW_USER_PERMISSIONS);

        if (value != null) {
            setUserId(value.getUserId());
            setUsername(value.getUsername());
            setEmail(value.getEmail());
            setDatabaseId(value.getDatabaseId());
            setSystemName(value.getSystemName());
            setServerName(value.getServerName());
            setUserTypeId(value.getUserTypeId());
            setUserType(value.getUserType());
            setUserIsPrimaryContact(value.getUserIsPrimaryContact());
        }
    }
}
