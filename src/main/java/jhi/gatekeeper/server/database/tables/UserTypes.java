/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import jhi.gatekeeper.server.database.GatekeeperDb;
import jhi.gatekeeper.server.database.Keys;
import jhi.gatekeeper.server.database.tables.records.UserTypesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTypes extends TableImpl<UserTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gatekeeper_db.user_types</code>
     */
    public static final UserTypes USER_TYPES = new UserTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserTypesRecord> getRecordType() {
        return UserTypesRecord.class;
    }

    /**
     * The column <code>gatekeeper_db.user_types.id</code>.
     */
    public final TableField<UserTypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gatekeeper_db.user_types.description</code>.
     */
    public final TableField<UserTypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    private UserTypes(Name alias, Table<UserTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserTypes(Name alias, Table<UserTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gatekeeper_db.user_types</code> table reference
     */
    public UserTypes(String alias) {
        this(DSL.name(alias), USER_TYPES);
    }

    /**
     * Create an aliased <code>gatekeeper_db.user_types</code> table reference
     */
    public UserTypes(Name alias) {
        this(alias, USER_TYPES);
    }

    /**
     * Create a <code>gatekeeper_db.user_types</code> table reference
     */
    public UserTypes() {
        this(DSL.name("user_types"), null);
    }

    public <O extends Record> UserTypes(Table<O> child, ForeignKey<O, UserTypesRecord> key) {
        super(child, key, USER_TYPES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GatekeeperDb.GATEKEEPER_DB;
    }

    @Override
    public Identity<UserTypesRecord, Integer> getIdentity() {
        return (Identity<UserTypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserTypesRecord> getPrimaryKey() {
        return Keys.KEY_USER_TYPES_PRIMARY;
    }

    @Override
    public UserTypes as(String alias) {
        return new UserTypes(DSL.name(alias), this);
    }

    @Override
    public UserTypes as(Name alias) {
        return new UserTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTypes rename(String name) {
        return new UserTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTypes rename(Name name) {
        return new UserTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
