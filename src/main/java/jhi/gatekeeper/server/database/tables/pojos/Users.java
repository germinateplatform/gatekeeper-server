/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    username;
    private String    password;
    private String    fullName;
    private String    emailAddress;
    private Timestamp createdOn;
    private Timestamp lastLogin;
    private Integer   institutionId;
    private Byte      hasAccessToGatekeeper;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
        this.fullName = value.fullName;
        this.emailAddress = value.emailAddress;
        this.createdOn = value.createdOn;
        this.lastLogin = value.lastLogin;
        this.institutionId = value.institutionId;
        this.hasAccessToGatekeeper = value.hasAccessToGatekeeper;
    }

    public Users(
        Integer   id,
        String    username,
        String    password,
        String    fullName,
        String    emailAddress,
        Timestamp createdOn,
        Timestamp lastLogin,
        Integer   institutionId,
        Byte      hasAccessToGatekeeper
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
        this.institutionId = institutionId;
        this.hasAccessToGatekeeper = hasAccessToGatekeeper;
    }

    /**
     * Getter for <code>gatekeeper_db.users.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>gatekeeper_db.users.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>gatekeeper_db.users.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>gatekeeper_db.users.username</code>.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for <code>gatekeeper_db.users.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>gatekeeper_db.users.password</code>.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for <code>gatekeeper_db.users.full_name</code>.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Setter for <code>gatekeeper_db.users.full_name</code>.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter for <code>gatekeeper_db.users.email_address</code>.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Setter for <code>gatekeeper_db.users.email_address</code>.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for <code>gatekeeper_db.users.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>gatekeeper_db.users.created_on</code>.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>gatekeeper_db.users.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return this.lastLogin;
    }

    /**
     * Setter for <code>gatekeeper_db.users.last_login</code>.
     */
    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * Getter for <code>gatekeeper_db.users.institution_id</code>.
     */
    public Integer getInstitutionId() {
        return this.institutionId;
    }

    /**
     * Setter for <code>gatekeeper_db.users.institution_id</code>.
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Getter for <code>gatekeeper_db.users.has_access_to_gatekeeper</code>.
     */
    public Byte getHasAccessToGatekeeper() {
        return this.hasAccessToGatekeeper;
    }

    /**
     * Setter for <code>gatekeeper_db.users.has_access_to_gatekeeper</code>.
     */
    public void setHasAccessToGatekeeper(Byte hasAccessToGatekeeper) {
        this.hasAccessToGatekeeper = hasAccessToGatekeeper;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(fullName);
        sb.append(", ").append(emailAddress);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastLogin);
        sb.append(", ").append(institutionId);
        sb.append(", ").append(hasAccessToGatekeeper);

        sb.append(")");
        return sb.toString();
    }
}
