/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.UnnestRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Unnest extends TableImpl<UnnestRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.unnest</code>
     */
    public static final Unnest UNNEST = new Unnest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UnnestRecord> getRecordType() {
        return UnnestRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<UnnestRecord, Object> UNNEST_ = createField(DSL.name("unnest"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"anyrange\""), this, "");

    private Unnest(Name alias, Table<UnnestRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anymultirange\""))
        });
    }

    private Unnest(Name alias, Table<UnnestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    public Unnest(String alias) {
        this(DSL.name(alias), UNNEST);
    }

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    public Unnest(Name alias) {
        this(alias, UNNEST);
    }

    /**
     * Create a <code>pg_catalog.unnest</code> table reference
     */
    public Unnest() {
        this(DSL.name("unnest"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public Unnest as(String alias) {
        return new Unnest(DSL.name(alias), this, parameters);
    }

    @Override
    public Unnest as(Name alias) {
        return new Unnest(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Unnest rename(String name) {
        return new Unnest(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Unnest rename(Name name) {
        return new Unnest(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Object> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public Unnest call(
          Object __1
    ) {
        Unnest result = new Unnest(DSL.name("unnest"), null, new Field[] {
            DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anymultirange\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public Unnest call(
          Field<Object> __1
    ) {
        Unnest result = new Unnest(DSL.name("unnest"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}