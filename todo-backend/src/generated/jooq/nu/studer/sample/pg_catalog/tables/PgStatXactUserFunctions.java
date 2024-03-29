/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatXactUserFunctionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatXactUserFunctions extends TableImpl<PgStatXactUserFunctionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_xact_user_functions</code>
     */
    public static final PgStatXactUserFunctions PG_STAT_XACT_USER_FUNCTIONS = new PgStatXactUserFunctions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactUserFunctionsRecord> getRecordType() {
        return PgStatXactUserFunctionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcid</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Long> FUNCID = createField(DSL.name("funcid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_functions.schemaname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> FUNCNAME = createField(DSL.name("funcname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.calls</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Long> CALLS = createField(DSL.name("calls"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_functions.total_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> TOTAL_TIME = createField(DSL.name("total_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.self_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> SELF_TIME = createField(DSL.name("self_time"), SQLDataType.DOUBLE, this, "");

    private PgStatXactUserFunctions(Name alias, Table<PgStatXactUserFunctionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactUserFunctions(Name alias, Table<PgStatXactUserFunctionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_xact_user_functions\" as  SELECT p.oid AS funcid,\n    n.nspname AS schemaname,\n    p.proname AS funcname,\n    pg_stat_get_xact_function_calls(p.oid) AS calls,\n    pg_stat_get_xact_function_total_time(p.oid) AS total_time,\n    pg_stat_get_xact_function_self_time(p.oid) AS self_time\n   FROM (pg_proc p\n     LEFT JOIN pg_namespace n ON ((n.oid = p.pronamespace)))\n  WHERE ((p.prolang <> (12)::oid) AND (pg_stat_get_xact_function_calls(p.oid) IS NOT NULL));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code>
     * table reference
     */
    public PgStatXactUserFunctions(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_USER_FUNCTIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code>
     * table reference
     */
    public PgStatXactUserFunctions(Name alias) {
        this(alias, PG_STAT_XACT_USER_FUNCTIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_functions</code> table
     * reference
     */
    public PgStatXactUserFunctions() {
        this(DSL.name("pg_stat_xact_user_functions"), null);
    }

    public <O extends Record> PgStatXactUserFunctions(Table<O> child, ForeignKey<O, PgStatXactUserFunctionsRecord> key) {
        super(child, key, PG_STAT_XACT_USER_FUNCTIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatXactUserFunctions as(String alias) {
        return new PgStatXactUserFunctions(DSL.name(alias), this);
    }

    @Override
    public PgStatXactUserFunctions as(Name alias) {
        return new PgStatXactUserFunctions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserFunctions rename(String name) {
        return new PgStatXactUserFunctions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserFunctions rename(Name name) {
        return new PgStatXactUserFunctions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Long, Double, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
