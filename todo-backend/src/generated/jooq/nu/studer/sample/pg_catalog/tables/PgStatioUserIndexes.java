/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatioUserIndexesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class PgStatioUserIndexes extends TableImpl<PgStatioUserIndexesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_user_indexes</code>
     */
    public static final PgStatioUserIndexes PG_STATIO_USER_INDEXES = new PgStatioUserIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioUserIndexesRecord> getRecordType() {
        return PgStatioUserIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.relid</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.indexrelid</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.schemaname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.relname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.indexrelname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.idx_blks_read</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.idx_blks_hit</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioUserIndexes(Name alias, Table<PgStatioUserIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioUserIndexes(Name alias, Table<PgStatioUserIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_statio_user_indexes\" as  SELECT pg_statio_all_indexes.relid,\n    pg_statio_all_indexes.indexrelid,\n    pg_statio_all_indexes.schemaname,\n    pg_statio_all_indexes.relname,\n    pg_statio_all_indexes.indexrelname,\n    pg_statio_all_indexes.idx_blks_read,\n    pg_statio_all_indexes.idx_blks_hit\n   FROM pg_statio_all_indexes\n  WHERE ((pg_statio_all_indexes.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_statio_all_indexes.schemaname !~ '^pg_toast'::text));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_indexes</code> table
     * reference
     */
    public PgStatioUserIndexes(String alias) {
        this(DSL.name(alias), PG_STATIO_USER_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_indexes</code> table
     * reference
     */
    public PgStatioUserIndexes(Name alias) {
        this(alias, PG_STATIO_USER_INDEXES);
    }

    /**
     * Create a <code>pg_catalog.pg_statio_user_indexes</code> table reference
     */
    public PgStatioUserIndexes() {
        this(DSL.name("pg_statio_user_indexes"), null);
    }

    public <O extends Record> PgStatioUserIndexes(Table<O> child, ForeignKey<O, PgStatioUserIndexesRecord> key) {
        super(child, key, PG_STATIO_USER_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioUserIndexes as(String alias) {
        return new PgStatioUserIndexes(DSL.name(alias), this);
    }

    @Override
    public PgStatioUserIndexes as(Name alias) {
        return new PgStatioUserIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserIndexes rename(String name) {
        return new PgStatioUserIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserIndexes rename(Name name) {
        return new PgStatioUserIndexes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
