/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgPublicationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class PgPublication extends TableImpl<PgPublicationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_publication</code>
     */
    public static final PgPublication PG_PUBLICATION = new PgPublication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationRecord> getRecordType() {
        return PgPublicationRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication.oid</code>.
     */
    public final TableField<PgPublicationRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubname</code>.
     */
    public final TableField<PgPublicationRecord, String> PUBNAME = createField(DSL.name("pubname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public final TableField<PgPublicationRecord, Long> PUBOWNER = createField(DSL.name("pubowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBALLTABLES = createField(DSL.name("puballtables"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBINSERT = createField(DSL.name("pubinsert"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBUPDATE = createField(DSL.name("pubupdate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBDELETE = createField(DSL.name("pubdelete"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBTRUNCATE = createField(DSL.name("pubtruncate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication.pubviaroot</code>.
     */
    public final TableField<PgPublicationRecord, Boolean> PUBVIAROOT = createField(DSL.name("pubviaroot"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgPublication(Name alias, Table<PgPublicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublication(Name alias, Table<PgPublicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication</code> table reference
     */
    public PgPublication(String alias) {
        this(DSL.name(alias), PG_PUBLICATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication</code> table reference
     */
    public PgPublication(Name alias) {
        this(alias, PG_PUBLICATION);
    }

    /**
     * Create a <code>pg_catalog.pg_publication</code> table reference
     */
    public PgPublication() {
        this(DSL.name("pg_publication"), null);
    }

    public <O extends Record> PgPublication(Table<O> child, ForeignKey<O, PgPublicationRecord> key) {
        super(child, key, PG_PUBLICATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgPublicationRecord> getPrimaryKey() {
        return Keys.PG_PUBLICATION_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgPublicationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PUBLICATION_PUBNAME_INDEX);
    }

    @Override
    public PgPublication as(String alias) {
        return new PgPublication(DSL.name(alias), this);
    }

    @Override
    public PgPublication as(Name alias) {
        return new PgPublication(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublication rename(String name) {
        return new PgPublication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublication rename(Name name) {
        return new PgPublication(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
