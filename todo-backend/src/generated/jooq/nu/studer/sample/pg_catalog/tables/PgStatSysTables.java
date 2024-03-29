/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatSysTablesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class PgStatSysTables extends TableImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_sys_tables</code>
     */
    public static final PgStatSysTables PG_STAT_SYS_TABLES = new PgStatSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSysTablesRecord> getRecordType() {
        return PgStatSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_LIVE_TUP = createField(DSL.name("n_live_tup"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_DEAD_TUP = createField(DSL.name("n_dead_tup"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField(DSL.name("n_mod_since_analyze"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_ins_since_vacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_INS_SINCE_VACUUM = createField(DSL.name("n_ins_since_vacuum"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_VACUUM = createField(DSL.name("last_vacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOVACUUM = createField(DSL.name("last_autovacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_ANALYZE = createField(DSL.name("last_analyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOANALYZE = createField(DSL.name("last_autoanalyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> VACUUM_COUNT = createField(DSL.name("vacuum_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOVACUUM_COUNT = createField(DSL.name("autovacuum_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> ANALYZE_COUNT = createField(DSL.name("analyze_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOANALYZE_COUNT = createField(DSL.name("autoanalyze_count"), SQLDataType.BIGINT, this, "");

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_sys_tables\" as  SELECT pg_stat_all_tables.relid,\n    pg_stat_all_tables.schemaname,\n    pg_stat_all_tables.relname,\n    pg_stat_all_tables.seq_scan,\n    pg_stat_all_tables.seq_tup_read,\n    pg_stat_all_tables.idx_scan,\n    pg_stat_all_tables.idx_tup_fetch,\n    pg_stat_all_tables.n_tup_ins,\n    pg_stat_all_tables.n_tup_upd,\n    pg_stat_all_tables.n_tup_del,\n    pg_stat_all_tables.n_tup_hot_upd,\n    pg_stat_all_tables.n_live_tup,\n    pg_stat_all_tables.n_dead_tup,\n    pg_stat_all_tables.n_mod_since_analyze,\n    pg_stat_all_tables.n_ins_since_vacuum,\n    pg_stat_all_tables.last_vacuum,\n    pg_stat_all_tables.last_autovacuum,\n    pg_stat_all_tables.last_analyze,\n    pg_stat_all_tables.last_autoanalyze,\n    pg_stat_all_tables.vacuum_count,\n    pg_stat_all_tables.autovacuum_count,\n    pg_stat_all_tables.analyze_count,\n    pg_stat_all_tables.autoanalyze_count\n   FROM pg_stat_all_tables\n  WHERE ((pg_stat_all_tables.schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (pg_stat_all_tables.schemaname ~ '^pg_toast'::text));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table
     * reference
     */
    public PgStatSysTables(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table
     * reference
     */
    public PgStatSysTables(Name alias) {
        this(alias, PG_STAT_SYS_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables() {
        this(DSL.name("pg_stat_sys_tables"), null);
    }

    public <O extends Record> PgStatSysTables(Table<O> child, ForeignKey<O, PgStatSysTablesRecord> key) {
        super(child, key, PG_STAT_SYS_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatSysTables as(String alias) {
        return new PgStatSysTables(DSL.name(alias), this);
    }

    @Override
    public PgStatSysTables as(Name alias) {
        return new PgStatSysTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(String name) {
        return new PgStatSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(Name name) {
        return new PgStatSysTables(name, null);
    }
}
