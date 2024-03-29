/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewUserDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    username;
    private String    fullName;
    private String    emailAddress;
    private Timestamp lastLogin;
    private Timestamp createdOn;
    private Byte      gatekeeperAccess;
    private String    name;
    private String    acronym;
    private String    address;

    public ViewUserDetails() {}

    public ViewUserDetails(ViewUserDetails value) {
        this.id = value.id;
        this.username = value.username;
        this.fullName = value.fullName;
        this.emailAddress = value.emailAddress;
        this.lastLogin = value.lastLogin;
        this.createdOn = value.createdOn;
        this.gatekeeperAccess = value.gatekeeperAccess;
        this.name = value.name;
        this.acronym = value.acronym;
        this.address = value.address;
    }

    public ViewUserDetails(
        Integer   id,
        String    username,
        String    fullName,
        String    emailAddress,
        Timestamp lastLogin,
        Timestamp createdOn,
        Byte      gatekeeperAccess,
        String    name,
        String    acronym,
        String    address
    ) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.lastLogin = lastLogin;
        this.createdOn = createdOn;
        this.gatekeeperAccess = gatekeeperAccess;
        this.name = name;
        this.acronym = acronym;
        this.address = address;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.username</code>.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.full_name</code>.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.full_name</code>.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.email_address</code>.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.email_address</code>.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return this.lastLogin;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.last_login</code>.
     */
    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.created_on</code>.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for
     * <code>gatekeeper_db.view_user_details.gatekeeper_access</code>.
     */
    public Byte getGatekeeperAccess() {
        return this.gatekeeperAccess;
    }

    /**
     * Setter for
     * <code>gatekeeper_db.view_user_details.gatekeeper_access</code>.
     */
    public void setGatekeeperAccess(Byte gatekeeperAccess) {
        this.gatekeeperAccess = gatekeeperAccess;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.acronym</code>.
     */
    public String getAcronym() {
        return this.acronym;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.acronym</code>.
     */
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    /**
     * Getter for <code>gatekeeper_db.view_user_details.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>gatekeeper_db.view_user_details.address</code>.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewUserDetails (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(fullName);
        sb.append(", ").append(emailAddress);
        sb.append(", ").append(lastLogin);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(gatekeeperAccess);
        sb.append(", ").append(name);
        sb.append(", ").append(acronym);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}
