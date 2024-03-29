/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgGetPublicationTablesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row1;
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
public class PgGetPublicationTables extends TableImpl<PgGetPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_publication_tables</code>
     */
    public static final PgGetPublicationTables PG_GET_PUBLICATION_TABLES = new PgGetPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetPublicationTablesRecord> getRecordType() {
        return PgGetPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(String alias) {
        this(DSL.name(alias), PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(Name alias) {
        this(alias, PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables() {
        this(DSL.name("pg_get_publication_tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetPublicationTables as(String alias) {
        return new PgGetPublicationTables(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetPublicationTables as(Name alias) {
        return new PgGetPublicationTables(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(String name) {
        return new PgGetPublicationTables(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(Name name) {
        return new PgGetPublicationTables(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          String pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            DSL.val(pubname, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          Field<String> pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            pubname
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
