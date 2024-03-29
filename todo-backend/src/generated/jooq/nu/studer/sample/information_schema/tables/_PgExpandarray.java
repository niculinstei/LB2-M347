/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records._PgExpandarrayRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row2;
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
public class _PgExpandarray extends TableImpl<_PgExpandarrayRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema._pg_expandarray</code>
     */
    public static final _PgExpandarray _PG_EXPANDARRAY = new _PgExpandarray();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgExpandarrayRecord> getRecordType() {
        return _PgExpandarrayRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<_PgExpandarrayRecord, Object> X = createField(DSL.name("x"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), this, "");

    /**
     * The column <code>information_schema._pg_expandarray.n</code>.
     */
    public final TableField<_PgExpandarrayRecord, Integer> N = createField(DSL.name("n"), SQLDataType.INTEGER, this, "");

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""))
        });
    }

    private _PgExpandarray(Name alias, Table<_PgExpandarrayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>information_schema._pg_expandarray</code> table
     * reference
     */
    public _PgExpandarray(String alias) {
        this(DSL.name(alias), _PG_EXPANDARRAY);
    }

    /**
     * Create an aliased <code>information_schema._pg_expandarray</code> table
     * reference
     */
    public _PgExpandarray(Name alias) {
        this(alias, _PG_EXPANDARRAY);
    }

    /**
     * Create a <code>information_schema._pg_expandarray</code> table reference
     */
    public _PgExpandarray() {
        this(DSL.name("_pg_expandarray"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgExpandarray as(String alias) {
        return new _PgExpandarray(DSL.name(alias), this, parameters);
    }

    @Override
    public _PgExpandarray as(Name alias) {
        return new _PgExpandarray(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgExpandarray rename(String name) {
        return new _PgExpandarray(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgExpandarray rename(Name name) {
        return new _PgExpandarray(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Object, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public _PgExpandarray call(
          Object __1
    ) {
        _PgExpandarray result = new _PgExpandarray(DSL.name("_pg_expandarray"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyarray\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public _PgExpandarray call(
          Field<Object> __1
    ) {
        _PgExpandarray result = new _PgExpandarray(DSL.name("_pg_expandarray"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
