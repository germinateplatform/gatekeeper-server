/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import jhi.gatekeeper.server.database.tables.ViewCounts;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCountsRecord extends TableRecordImpl<ViewCountsRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gatekeeper_db.view_counts.users</code>.
     */
    public void setUsers(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_counts.users</code>.
     */
    public Long getUsers() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>gatekeeper_db.view_counts.requests</code>.
     */
    public void setRequests(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_counts.requests</code>.
     */
    public Long getRequests() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>gatekeeper_db.view_counts.databases</code>.
     */
    public void setDatabases(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>gatekeeper_db.view_counts.databases</code>.
     */
    public Long getDatabases() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewCounts.VIEW_COUNTS.USERS;
    }

    @Override
    public Field<Long> field2() {
        return ViewCounts.VIEW_COUNTS.REQUESTS;
    }

    @Override
    public Field<Long> field3() {
        return ViewCounts.VIEW_COUNTS.DATABASES;
    }

    @Override
    public Long component1() {
        return getUsers();
    }

    @Override
    public Long component2() {
        return getRequests();
    }

    @Override
    public Long component3() {
        return getDatabases();
    }

    @Override
    public Long value1() {
        return getUsers();
    }

    @Override
    public Long value2() {
        return getRequests();
    }

    @Override
    public Long value3() {
        return getDatabases();
    }

    @Override
    public ViewCountsRecord value1(Long value) {
        setUsers(value);
        return this;
    }

    @Override
    public ViewCountsRecord value2(Long value) {
        setRequests(value);
        return this;
    }

    @Override
    public ViewCountsRecord value3(Long value) {
        setDatabases(value);
        return this;
    }

    @Override
    public ViewCountsRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewCountsRecord
     */
    public ViewCountsRecord() {
        super(ViewCounts.VIEW_COUNTS);
    }

    /**
     * Create a detached, initialised ViewCountsRecord
     */
    public ViewCountsRecord(Long users, Long requests, Long databases) {
        super(ViewCounts.VIEW_COUNTS);

        setUsers(users);
        setRequests(requests);
        setDatabases(databases);
    }

    /**
     * Create a detached, initialised ViewCountsRecord
     */
    public ViewCountsRecord(jhi.gatekeeper.server.database.tables.pojos.ViewCounts value) {
        super(ViewCounts.VIEW_COUNTS);

        if (value != null) {
            setUsers(value.getUsers());
            setRequests(value.getRequests());
            setDatabases(value.getDatabases());
        }
    }
}
