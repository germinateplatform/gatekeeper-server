/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import java.sql.Timestamp;

import jhi.gatekeeper.server.database.GatekeeperDb;
import jhi.gatekeeper.server.database.tables.records.ViewUnapprovedUserDetailsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class ViewUnapprovedUserDetails extends TableImpl<ViewUnapprovedUserDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>gatekeeper_db.view_unapproved_user_details</code>
     */
    public static final ViewUnapprovedUserDetails VIEW_UNAPPROVED_USER_DETAILS = new ViewUnapprovedUserDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewUnapprovedUserDetailsRecord> getRecordType() {
        return ViewUnapprovedUserDetailsRecord.class;
    }

    /**
     * The column <code>gatekeeper_db.view_unapproved_user_details.id</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.username</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.full_name</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.email_address</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> EMAIL_ADDRESS = createField(DSL.name("email_address"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.created_on</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.institution_id</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, Integer> INSTITUTION_ID = createField(DSL.name("institution_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>gatekeeper_db.view_unapproved_user_details.name</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.acronym</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> ACRONYM = createField(DSL.name("acronym"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.address</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.database_system_name</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> DATABASE_SYSTEM_NAME = createField(DSL.name("database_system_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.database_server_name</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> DATABASE_SERVER_NAME = createField(DSL.name("database_server_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.has_been_rejected</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, Byte> HAS_BEEN_REJECTED = createField(DSL.name("has_been_rejected"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.needs_approval</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, Byte> NEEDS_APPROVAL = createField(DSL.name("needs_approval"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>gatekeeper_db.view_unapproved_user_details.activation_key</code>.
     */
    public final TableField<ViewUnapprovedUserDetailsRecord, String> ACTIVATION_KEY = createField(DSL.name("activation_key"), SQLDataType.VARCHAR(36), this, "");

    private ViewUnapprovedUserDetails(Name alias, Table<ViewUnapprovedUserDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewUnapprovedUserDetails(Name alias, Table<ViewUnapprovedUserDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_unapproved_user_details` as select `germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`id` AS `id`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`user_username` AS `username`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`user_full_name` AS `full_name`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`user_email_address` AS `email_address`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`created_on` AS `created_on`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_id` AS `institution_id`,if(isnull(`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_id`),`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_name`,`germinate_gatekeeper_template_4_21_08_31`.`institutions`.`name`) AS `name`,if(isnull(`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_id`),`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_acronym`,`germinate_gatekeeper_template_4_21_08_31`.`institutions`.`acronym`) AS `acronym`,if(isnull(`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_id`),`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_address`,`germinate_gatekeeper_template_4_21_08_31`.`institutions`.`address`) AS `address`,`germinate_gatekeeper_template_4_21_08_31`.`database_systems`.`system_name` AS `database_system_name`,`germinate_gatekeeper_template_4_21_08_31`.`database_systems`.`server_name` AS `database_server_name`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`has_been_rejected` AS `has_been_rejected`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`needs_approval` AS `needs_approval`,`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`activation_key` AS `activation_key` from ((`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users` left join `germinate_gatekeeper_template_4_21_08_31`.`institutions` on((`germinate_gatekeeper_template_4_21_08_31`.`institutions`.`id` = `germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`institution_id`))) left join `germinate_gatekeeper_template_4_21_08_31`.`database_systems` on((`germinate_gatekeeper_template_4_21_08_31`.`database_systems`.`id` = `germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`database_system_id`))) where (`germinate_gatekeeper_template_4_21_08_31`.`unapproved_users`.`has_been_rejected` = 0)"));
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_unapproved_user_details</code>
     * table reference
     */
    public ViewUnapprovedUserDetails(String alias) {
        this(DSL.name(alias), VIEW_UNAPPROVED_USER_DETAILS);
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_unapproved_user_details</code>
     * table reference
     */
    public ViewUnapprovedUserDetails(Name alias) {
        this(alias, VIEW_UNAPPROVED_USER_DETAILS);
    }

    /**
     * Create a <code>gatekeeper_db.view_unapproved_user_details</code> table
     * reference
     */
    public ViewUnapprovedUserDetails() {
        this(DSL.name("view_unapproved_user_details"), null);
    }

    public <O extends Record> ViewUnapprovedUserDetails(Table<O> child, ForeignKey<O, ViewUnapprovedUserDetailsRecord> key) {
        super(child, key, VIEW_UNAPPROVED_USER_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GatekeeperDb.GATEKEEPER_DB;
    }

    @Override
    public ViewUnapprovedUserDetails as(String alias) {
        return new ViewUnapprovedUserDetails(DSL.name(alias), this);
    }

    @Override
    public ViewUnapprovedUserDetails as(Name alias) {
        return new ViewUnapprovedUserDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewUnapprovedUserDetails rename(String name) {
        return new ViewUnapprovedUserDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewUnapprovedUserDetails rename(Name name) {
        return new ViewUnapprovedUserDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, Timestamp, Integer, String, String, String, String, String, Byte, Byte, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
