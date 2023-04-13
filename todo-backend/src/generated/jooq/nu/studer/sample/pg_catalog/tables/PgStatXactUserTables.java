/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatXactUserTablesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PgStatXactUserTables extends TableImpl<PgStatXactUserTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_xact_user_tables</code>
     */
    public static final PgStatXactUserTables PG_STAT_XACT_USER_TABLES = new PgStatXactUserTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactUserTablesRecord> getRecordType() {
        return PgStatXactUserTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.relid</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.schemaname</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.relname</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.seq_scan</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.idx_scan</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_del</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatXactUserTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    private PgStatXactUserTables(Name alias, Table<PgStatXactUserTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactUserTables(Name alias, Table<PgStatXactUserTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_xact_user_tables\" as  SELECT pg_stat_xact_all_tables.relid,\n    pg_stat_xact_all_tables.schemaname,\n    pg_stat_xact_all_tables.relname,\n    pg_stat_xact_all_tables.seq_scan,\n    pg_stat_xact_all_tables.seq_tup_read,\n    pg_stat_xact_all_tables.idx_scan,\n    pg_stat_xact_all_tables.idx_tup_fetch,\n    pg_stat_xact_all_tables.n_tup_ins,\n    pg_stat_xact_all_tables.n_tup_upd,\n    pg_stat_xact_all_tables.n_tup_del,\n    pg_stat_xact_all_tables.n_tup_hot_upd\n   FROM pg_stat_xact_all_tables\n  WHERE ((pg_stat_xact_all_tables.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_stat_xact_all_tables.schemaname !~ '^pg_toast'::text));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_tables</code> table
     * reference
     */
    public PgStatXactUserTables(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_USER_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_tables</code> table
     * reference
     */
    public PgStatXactUserTables(Name alias) {
        this(alias, PG_STAT_XACT_USER_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_tables</code> table reference
     */
    public PgStatXactUserTables() {
        this(DSL.name("pg_stat_xact_user_tables"), null);
    }

    public <O extends Record> PgStatXactUserTables(Table<O> child, ForeignKey<O, PgStatXactUserTablesRecord> key) {
        super(child, key, PG_STAT_XACT_USER_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatXactUserTables as(String alias) {
        return new PgStatXactUserTables(DSL.name(alias), this);
    }

    @Override
    public PgStatXactUserTables as(Name alias) {
        return new PgStatXactUserTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserTables rename(String name) {
        return new PgStatXactUserTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserTables rename(Name name) {
        return new PgStatXactUserTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
