/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import jhi.gatekeeper.server.database.GatekeeperDb;
import jhi.gatekeeper.server.database.tables.records.ViewCountsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCounts extends TableImpl<ViewCountsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gatekeeper_db.view_counts</code>
     */
    public static final ViewCounts VIEW_COUNTS = new ViewCounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewCountsRecord> getRecordType() {
        return ViewCountsRecord.class;
    }

    /**
     * The column <code>gatekeeper_db.view_counts.users</code>.
     */
    public final TableField<ViewCountsRecord, Long> USERS = createField(DSL.name("users"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>gatekeeper_db.view_counts.requests</code>.
     */
    public final TableField<ViewCountsRecord, Long> REQUESTS = createField(DSL.name("requests"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>gatekeeper_db.view_counts.databases</code>.
     */
    public final TableField<ViewCountsRecord, Long> DATABASES = createField(DSL.name("databases"), SQLDataType.BIGINT, this, "");

    private ViewCounts(Name alias, Table<ViewCountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewCounts(Name alias, Table<ViewCountsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_counts` as select (select count(1) from `germinate_gatekeeper_template_4_21_08_31`.`users`) AS `users`,((select count(1) from `germinate_gatekeeper_template_4_21_08_31`.`unapproved_users` where (`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`has_been_rejected` = 0)) + (select count(1) from `germinate_gatekeeper_template_4_21_08_31`.`access_requests` where (`germinate_gatekeeper_template_4_21_08_31`.`access_requests`.`has_been_rejected` = 0))) AS `requests`,(select count(1) from `germinate_gatekeeper_template_4_21_08_31`.`database_systems`) AS `databases`"));
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts(String alias) {
        this(DSL.name(alias), VIEW_COUNTS);
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts(Name alias) {
        this(alias, VIEW_COUNTS);
    }

    /**
     * Create a <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts() {
        this(DSL.name("view_counts"), null);
    }

    public <O extends Record> ViewCounts(Table<O> child, ForeignKey<O, ViewCountsRecord> key) {
        super(child, key, VIEW_COUNTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GatekeeperDb.GATEKEEPER_DB;
    }

    @Override
    public ViewCounts as(String alias) {
        return new ViewCounts(DSL.name(alias), this);
    }

    @Override
    public ViewCounts as(Name alias) {
        return new ViewCounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCounts rename(String name) {
        return new ViewCounts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCounts rename(Name name) {
        return new ViewCounts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
