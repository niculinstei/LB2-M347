/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgPublicationTablesRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPublicationTables extends TableImpl<PgPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_tables</code>
     */
    public static final PgPublicationTables PG_PUBLICATION_TABLES = new PgPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationTablesRecord> getRecordType() {
        return PgPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> PUBNAME = createField(DSL.name("pubname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    private PgPublicationTables(Name alias, Table<PgPublicationTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationTables(Name alias, Table<PgPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_publication_tables\" as  SELECT p.pubname,\n    n.nspname AS schemaname,\n    c.relname AS tablename\n   FROM pg_publication p,\n    LATERAL pg_get_publication_tables((p.pubname)::text) gpt(relid),\n    (pg_class c\n     JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE (c.oid = gpt.relid);"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    public PgPublicationTables(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    public PgPublicationTables(Name alias) {
        this(alias, PG_PUBLICATION_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_publication_tables</code> table reference
     */
    public PgPublicationTables() {
        this(DSL.name("pg_publication_tables"), null);
    }

    public <O extends Record> PgPublicationTables(Table<O> child, ForeignKey<O, PgPublicationTablesRecord> key) {
        super(child, key, PG_PUBLICATION_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPublicationTables as(String alias) {
        return new PgPublicationTables(DSL.name(alias), this);
    }

    @Override
    public PgPublicationTables as(Name alias) {
        return new PgPublicationTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationTables rename(String name) {
        return new PgPublicationTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationTables rename(Name name) {
        return new PgPublicationTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
