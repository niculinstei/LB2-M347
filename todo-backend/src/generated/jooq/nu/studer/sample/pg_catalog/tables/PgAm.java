/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgAmRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class PgAm extends TableImpl<PgAmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_am</code>
     */
    public static final PgAm PG_AM = new PgAm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAmRecord> getRecordType() {
        return PgAmRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_am.oid</code>.
     */
    public final TableField<PgAmRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amname</code>.
     */
    public final TableField<PgAmRecord, String> AMNAME = createField(DSL.name("amname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amhandler</code>.
     */
    public final TableField<PgAmRecord, String> AMHANDLER = createField(DSL.name("amhandler"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_am.amtype</code>.
     */
    public final TableField<PgAmRecord, String> AMTYPE = createField(DSL.name("amtype"), SQLDataType.CHAR.nullable(false), this, "");

    private PgAm(Name alias, Table<PgAmRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAm(Name alias, Table<PgAmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm(String alias) {
        this(DSL.name(alias), PG_AM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm(Name alias) {
        this(alias, PG_AM);
    }

    /**
     * Create a <code>pg_catalog.pg_am</code> table reference
     */
    public PgAm() {
        this(DSL.name("pg_am"), null);
    }

    public <O extends Record> PgAm(Table<O> child, ForeignKey<O, PgAmRecord> key) {
        super(child, key, PG_AM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgAmRecord> getPrimaryKey() {
        return Keys.PG_AM_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgAmRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AM_NAME_INDEX);
    }

    @Override
    public PgAm as(String alias) {
        return new PgAm(DSL.name(alias), this);
    }

    @Override
    public PgAm as(Name alias) {
        return new PgAm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAm rename(String name) {
        return new PgAm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAm rename(Name name) {
        return new PgAm(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
