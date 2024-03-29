/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import java.sql.Timestamp;

import jhi.gatekeeper.server.database.tables.ViewUserDetails;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewUserDetailsRecord extends TableRecordImpl<ViewUserDetailsRecord> implements Record10<Integer, String, String, String, Timestamp, Timestamp, Byte, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gatekeeper_db.view_user_details.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.full_name</code>.
     */
    public void setFullName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.full_name</code>.
     */
    public String getFullName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.email_address</code>.
     */
    public void setEmailAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.email_address</code>.
     */
    public String getEmailAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.last_login</code>.
     */
    public void setLastLogin(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for
     * <code>gatekeeper_db.view_user_details.gatekeeper_access</code>.
     */
    public void setGatekeeperAccess(Byte value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.view_user_details.gatekeeper_access</code>.
     */
    public Byte getGatekeeperAccess() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.name</code>.
     */
    public void setName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.name</code>.
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.acronym</code>.
     */
    public void setAcronym(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.acronym</code>.
     */
    public String getAcronym() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.address</code>.
     */
    public void setAddress(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.address</code>.
     */
    public String getAddress() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, Timestamp, Timestamp, Byte, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, Timestamp, Timestamp, Byte, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewUserDetails.VIEW_USER_DETAILS.ID;
    }

    @Override
    public Field<String> field2() {
        return ViewUserDetails.VIEW_USER_DETAILS.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return ViewUserDetails.VIEW_USER_DETAILS.FULL_NAME;
    }

    @Override
    public Field<String> field4() {
        return ViewUserDetails.VIEW_USER_DETAILS.EMAIL_ADDRESS;
    }

    @Override
    public Field<Timestamp> field5() {
        return ViewUserDetails.VIEW_USER_DETAILS.LAST_LOGIN;
    }

    @Override
    public Field<Timestamp> field6() {
        return ViewUserDetails.VIEW_USER_DETAILS.CREATED_ON;
    }

    @Override
    public Field<Byte> field7() {
        return ViewUserDetails.VIEW_USER_DETAILS.GATEKEEPER_ACCESS;
    }

    @Override
    public Field<String> field8() {
        return ViewUserDetails.VIEW_USER_DETAILS.NAME;
    }

    @Override
    public Field<String> field9() {
        return ViewUserDetails.VIEW_USER_DETAILS.ACRONYM;
    }

    @Override
    public Field<String> field10() {
        return ViewUserDetails.VIEW_USER_DETAILS.ADDRESS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getFullName();
    }

    @Override
    public String component4() {
        return getEmailAddress();
    }

    @Override
    public Timestamp component5() {
        return getLastLogin();
    }

    @Override
    public Timestamp component6() {
        return getCreatedOn();
    }

    @Override
    public Byte component7() {
        return getGatekeeperAccess();
    }

    @Override
    public String component8() {
        return getName();
    }

    @Override
    public String component9() {
        return getAcronym();
    }

    @Override
    public String component10() {
        return getAddress();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getFullName();
    }

    @Override
    public String value4() {
        return getEmailAddress();
    }

    @Override
    public Timestamp value5() {
        return getLastLogin();
    }

    @Override
    public Timestamp value6() {
        return getCreatedOn();
    }

    @Override
    public Byte value7() {
        return getGatekeeperAccess();
    }

    @Override
    public String value8() {
        return getName();
    }

    @Override
    public String value9() {
        return getAcronym();
    }

    @Override
    public String value10() {
        return getAddress();
    }

    @Override
    public ViewUserDetailsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value3(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value4(String value) {
        setEmailAddress(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value5(Timestamp value) {
        setLastLogin(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value7(Byte value) {
        setGatekeeperAccess(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value8(String value) {
        setName(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value9(String value) {
        setAcronym(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord value10(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ViewUserDetailsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, Byte value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewUserDetailsRecord
     */
    public ViewUserDetailsRecord() {
        super(ViewUserDetails.VIEW_USER_DETAILS);
    }

    /**
     * Create a detached, initialised ViewUserDetailsRecord
     */
    public ViewUserDetailsRecord(Integer id, String username, String fullName, String emailAddress, Timestamp lastLogin, Timestamp createdOn, Byte gatekeeperAccess, String name, String acronym, String address) {
        super(ViewUserDetails.VIEW_USER_DETAILS);

        setId(id);
        setUsername(username);
        setFullName(fullName);
        setEmailAddress(emailAddress);
        setLastLogin(lastLogin);
        setCreatedOn(createdOn);
        setGatekeeperAccess(gatekeeperAccess);
        setName(name);
        setAcronym(acronym);
        setAddress(address);
    }

    /**
     * Create a detached, initialised ViewUserDetailsRecord
     */
    public ViewUserDetailsRecord(jhi.gatekeeper.server.database.tables.pojos.ViewUserDetails value) {
        super(ViewUserDetails.VIEW_USER_DETAILS);

        if (value != null) {
            setId(value.getId());
            setUsername(value.getUsername());
            setFullName(value.getFullName());
            setEmailAddress(value.getEmailAddress());
            setLastLogin(value.getLastLogin());
            setCreatedOn(value.getCreatedOn());
            setGatekeeperAccess(value.getGatekeeperAccess());
            setName(value.getName());
            setAcronym(value.getAcronym());
            setAddress(value.getAddress());
        }
    }
}
