/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgPublicationRelRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class PgPublicationRel extends TableImpl<PgPublicationRelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_rel</code>
     */
    public static final PgPublicationRel PG_PUBLICATION_REL = new PgPublicationRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationRelRecord> getRecordType() {
        return PgPublicationRelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public final TableField<PgPublicationRelRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public final TableField<PgPublicationRelRecord, Long> PRPUBID = createField(DSL.name("prpubid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public final TableField<PgPublicationRelRecord, Long> PRRELID = createField(DSL.name("prrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    public PgPublicationRel(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_REL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    public PgPublicationRel(Name alias) {
        this(alias, PG_PUBLICATION_REL);
    }

    /**
     * Create a <code>pg_catalog.pg_publication_rel</code> table reference
     */
    public PgPublicationRel() {
        this(DSL.name("pg_publication_rel"), null);
    }

    public <O extends Record> PgPublicationRel(Table<O> child, ForeignKey<O, PgPublicationRelRecord> key) {
        super(child, key, PG_PUBLICATION_REL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgPublicationRelRecord> getPrimaryKey() {
        return Keys.PG_PUBLICATION_REL_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgPublicationRelRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX);
    }

    @Override
    public PgPublicationRel as(String alias) {
        return new PgPublicationRel(DSL.name(alias), this);
    }

    @Override
    public PgPublicationRel as(Name alias) {
        return new PgPublicationRel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(String name) {
        return new PgPublicationRel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(Name name) {
        return new PgPublicationRel(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
