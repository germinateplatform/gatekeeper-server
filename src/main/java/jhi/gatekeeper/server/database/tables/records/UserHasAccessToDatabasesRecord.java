/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserHasAccessToDatabasesRecord extends UpdatableRecordImpl<UserHasAccessToDatabasesRecord> implements Record4<Integer, Integer, Integer, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>gatekeeper_db.user_has_access_to_databases.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.user_has_access_to_databases.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>gatekeeper_db.user_has_access_to_databases.database_id</code>.
     */
    public void setDatabaseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.user_has_access_to_databases.database_id</code>.
     */
    public Integer getDatabaseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>gatekeeper_db.user_has_access_to_databases.user_type_id</code>.
     */
    public void setUserTypeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.user_has_access_to_databases.user_type_id</code>.
     */
    public Integer getUserTypeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>gatekeeper_db.user_has_access_to_databases.primary_contact</code>.
     */
    public void setPrimaryContact(Byte value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>gatekeeper_db.user_has_access_to_databases.primary_contact</code>.
     */
    public Byte getPrimaryContact() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_TYPE_ID;
    }

    @Override
    public Field<Byte> field4() {
        return UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.PRIMARY_CONTACT;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public Integer component2() {
        return getDatabaseId();
    }

    @Override
    public Integer component3() {
        return getUserTypeId();
    }

    @Override
    public Byte component4() {
        return getPrimaryContact();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public Integer value2() {
        return getDatabaseId();
    }

    @Override
    public Integer value3() {
        return getUserTypeId();
    }

    @Override
    public Byte value4() {
        return getPrimaryContact();
    }

    @Override
    public UserHasAccessToDatabasesRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserHasAccessToDatabasesRecord value2(Integer value) {
        setDatabaseId(value);
        return this;
    }

    @Override
    public UserHasAccessToDatabasesRecord value3(Integer value) {
        setUserTypeId(value);
        return this;
    }

    @Override
    public UserHasAccessToDatabasesRecord value4(Byte value) {
        setPrimaryContact(value);
        return this;
    }

    @Override
    public UserHasAccessToDatabasesRecord values(Integer value1, Integer value2, Integer value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserHasAccessToDatabasesRecord
     */
    public UserHasAccessToDatabasesRecord() {
        super(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES);
    }

    /**
     * Create a detached, initialised UserHasAccessToDatabasesRecord
     */
    public UserHasAccessToDatabasesRecord(Integer userId, Integer databaseId, Integer userTypeId, Byte primaryContact) {
        super(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES);

        setUserId(userId);
        setDatabaseId(databaseId);
        setUserTypeId(userTypeId);
        setPrimaryContact(primaryContact);
    }

    /**
     * Create a detached, initialised UserHasAccessToDatabasesRecord
     */
    public UserHasAccessToDatabasesRecord(jhi.gatekeeper.server.database.tables.pojos.UserHasAccessToDatabases value) {
        super(UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES);

        if (value != null) {
            setUserId(value.getUserId());
            setDatabaseId(value.getDatabaseId());
            setUserTypeId(value.getUserTypeId());
            setPrimaryContact(value.getPrimaryContact());
        }
    }
}
