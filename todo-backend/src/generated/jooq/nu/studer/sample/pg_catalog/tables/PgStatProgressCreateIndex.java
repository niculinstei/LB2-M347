/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatProgressCreateIndexRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class PgStatProgressCreateIndex extends TableImpl<PgStatProgressCreateIndexRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_progress_create_index</code>
     */
    public static final PgStatProgressCreateIndex PG_STAT_PROGRESS_CREATE_INDEX = new PgStatProgressCreateIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatProgressCreateIndexRecord> getRecordType() {
        return PgStatProgressCreateIndexRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.pid</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.datid</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.datname</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.relid</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.index_relid</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> INDEX_RELID = createField(DSL.name("index_relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.command</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, String> COMMAND = createField(DSL.name("command"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.phase</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, String> PHASE = createField(DSL.name("phase"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_total</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> LOCKERS_TOTAL = createField(DSL.name("lockers_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_done</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> LOCKERS_DONE = createField(DSL.name("lockers_done"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.current_locker_pid</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> CURRENT_LOCKER_PID = createField(DSL.name("current_locker_pid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_total</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> BLOCKS_TOTAL = createField(DSL.name("blocks_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_done</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> BLOCKS_DONE = createField(DSL.name("blocks_done"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_total</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> TUPLES_TOTAL = createField(DSL.name("tuples_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_done</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> TUPLES_DONE = createField(DSL.name("tuples_done"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_total</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> PARTITIONS_TOTAL = createField(DSL.name("partitions_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_done</code>.
     */
    public final TableField<PgStatProgressCreateIndexRecord, Long> PARTITIONS_DONE = createField(DSL.name("partitions_done"), SQLDataType.BIGINT, this, "");

    private PgStatProgressCreateIndex(Name alias, Table<PgStatProgressCreateIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressCreateIndex(Name alias, Table<PgStatProgressCreateIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_progress_create_index\" as  SELECT s.pid,\n    s.datid,\n    d.datname,\n    s.relid,\n    (s.param7)::oid AS index_relid,\n        CASE s.param1\n            WHEN 1 THEN 'CREATE INDEX'::text\n            WHEN 2 THEN 'CREATE INDEX CONCURRENTLY'::text\n            WHEN 3 THEN 'REINDEX'::text\n            WHEN 4 THEN 'REINDEX CONCURRENTLY'::text\n            ELSE NULL::text\n        END AS command,\n        CASE s.param10\n            WHEN 0 THEN 'initializing'::text\n            WHEN 1 THEN 'waiting for writers before build'::text\n            WHEN 2 THEN ('building index'::text || COALESCE((': '::text || pg_indexam_progress_phasename((s.param9)::oid, s.param11)), ''::text))\n            WHEN 3 THEN 'waiting for writers before validation'::text\n            WHEN 4 THEN 'index validation: scanning index'::text\n            WHEN 5 THEN 'index validation: sorting tuples'::text\n            WHEN 6 THEN 'index validation: scanning table'::text\n            WHEN 7 THEN 'waiting for old snapshots'::text\n            WHEN 8 THEN 'waiting for readers before marking dead'::text\n            WHEN 9 THEN 'waiting for readers before dropping'::text\n            ELSE NULL::text\n        END AS phase,\n    s.param4 AS lockers_total,\n    s.param5 AS lockers_done,\n    s.param6 AS current_locker_pid,\n    s.param16 AS blocks_total,\n    s.param17 AS blocks_done,\n    s.param12 AS tuples_total,\n    s.param13 AS tuples_done,\n    s.param14 AS partitions_total,\n    s.param15 AS partitions_done\n   FROM (pg_stat_get_progress_info('CREATE INDEX'::text) s(pid, datid, relid, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20)\n     LEFT JOIN pg_database d ON ((s.datid = d.oid)));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_create_index</code>
     * table reference
     */
    public PgStatProgressCreateIndex(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_CREATE_INDEX);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_create_index</code>
     * table reference
     */
    public PgStatProgressCreateIndex(Name alias) {
        this(alias, PG_STAT_PROGRESS_CREATE_INDEX);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_progress_create_index</code> table
     * reference
     */
    public PgStatProgressCreateIndex() {
        this(DSL.name("pg_stat_progress_create_index"), null);
    }

    public <O extends Record> PgStatProgressCreateIndex(Table<O> child, ForeignKey<O, PgStatProgressCreateIndexRecord> key) {
        super(child, key, PG_STAT_PROGRESS_CREATE_INDEX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatProgressCreateIndex as(String alias) {
        return new PgStatProgressCreateIndex(DSL.name(alias), this);
    }

    @Override
    public PgStatProgressCreateIndex as(Name alias) {
        return new PgStatProgressCreateIndex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressCreateIndex rename(String name) {
        return new PgStatProgressCreateIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressCreateIndex rename(Name name) {
        return new PgStatProgressCreateIndex(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, Long, String, Long, Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
