/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Indexes;
import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgDependRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgDepend extends TableImpl<PgDependRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_depend</code>
     */
    public static final PgDepend PG_DEPEND = new PgDepend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDependRecord> getRecordType() {
        return PgDependRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_depend.classid</code>.
     */
    public final TableField<PgDependRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.objid</code>.
     */
    public final TableField<PgDependRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public final TableField<PgDependRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public final TableField<PgDependRecord, Long> REFCLASSID = createField(DSL.name("refclassid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public final TableField<PgDependRecord, Long> REFOBJID = createField(DSL.name("refobjid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public final TableField<PgDependRecord, Integer> REFOBJSUBID = createField(DSL.name("refobjsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_depend.deptype</code>.
     */
    public final TableField<PgDependRecord, String> DEPTYPE = createField(DSL.name("deptype"), SQLDataType.CHAR.nullable(false), this, "");

    private PgDepend(Name alias, Table<PgDependRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDepend(Name alias, Table<PgDependRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_depend</code> table reference
     */
    public PgDepend(String alias) {
        this(DSL.name(alias), PG_DEPEND);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_depend</code> table reference
     */
    public PgDepend(Name alias) {
        this(alias, PG_DEPEND);
    }

    /**
     * Create a <code>pg_catalog.pg_depend</code> table reference
     */
    public PgDepend() {
        this(DSL.name("pg_depend"), null);
    }

    public <O extends Record> PgDepend(Table<O> child, ForeignKey<O, PgDependRecord> key) {
        super(child, key, PG_DEPEND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_DEPEND_DEPENDER_INDEX, Indexes.PG_DEPEND_REFERENCE_INDEX);
    }

    @Override
    public PgDepend as(String alias) {
        return new PgDepend(DSL.name(alias), this);
    }

    @Override
    public PgDepend as(Name alias) {
        return new PgDepend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDepend rename(String name) {
        return new PgDepend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDepend rename(Name name) {
        return new PgDepend(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Integer, Long, Long, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
