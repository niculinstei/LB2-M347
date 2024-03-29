/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatSysIndexesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class PgStatSysIndexes extends TableImpl<PgStatSysIndexesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_sys_indexes</code>
     */
    public static final PgStatSysIndexes PG_STAT_SYS_INDEXES = new PgStatSysIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSysIndexesRecord> getRecordType() {
        return PgStatSysIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.relid</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.indexrelid</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.schemaname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.relname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.indexrelname</code>.
     */
    public final TableField<PgStatSysIndexesRecord, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_scan</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_tup_read</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_TUP_READ = createField(DSL.name("idx_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_indexes.idx_tup_fetch</code>.
     */
    public final TableField<PgStatSysIndexesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    private PgStatSysIndexes(Name alias, Table<PgStatSysIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysIndexes(Name alias, Table<PgStatSysIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_sys_indexes\" as  SELECT pg_stat_all_indexes.relid,\n    pg_stat_all_indexes.indexrelid,\n    pg_stat_all_indexes.schemaname,\n    pg_stat_all_indexes.relname,\n    pg_stat_all_indexes.indexrelname,\n    pg_stat_all_indexes.idx_scan,\n    pg_stat_all_indexes.idx_tup_read,\n    pg_stat_all_indexes.idx_tup_fetch\n   FROM pg_stat_all_indexes\n  WHERE ((pg_stat_all_indexes.schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (pg_stat_all_indexes.schemaname ~ '^pg_toast'::text));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_indexes</code> table
     * reference
     */
    public PgStatSysIndexes(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_indexes</code> table
     * reference
     */
    public PgStatSysIndexes(Name alias) {
        this(alias, PG_STAT_SYS_INDEXES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_sys_indexes</code> table reference
     */
    public PgStatSysIndexes() {
        this(DSL.name("pg_stat_sys_indexes"), null);
    }

    public <O extends Record> PgStatSysIndexes(Table<O> child, ForeignKey<O, PgStatSysIndexesRecord> key) {
        super(child, key, PG_STAT_SYS_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatSysIndexes as(String alias) {
        return new PgStatSysIndexes(DSL.name(alias), this);
    }

    @Override
    public PgStatSysIndexes as(Name alias) {
        return new PgStatSysIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysIndexes rename(String name) {
        return new PgStatSysIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysIndexes rename(Name name) {
        return new PgStatSysIndexes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, String, String, String, Long, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
