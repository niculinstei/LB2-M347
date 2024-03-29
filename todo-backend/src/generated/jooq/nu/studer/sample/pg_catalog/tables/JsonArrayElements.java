/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.JsonArrayElementsRecord;

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
public class JsonArrayElements extends TableImpl<JsonArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.json_array_elements</code>
     */
    public static final JsonArrayElements JSON_ARRAY_ELEMENTS = new JsonArrayElements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonArrayElementsRecord> getRecordType() {
        return JsonArrayElementsRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_array_elements.value</code>.
     */
    public final TableField<JsonArrayElementsRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR, this, "");

    private JsonArrayElements(Name alias, Table<JsonArrayElementsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR)
        });
    }

    private JsonArrayElements(Name alias, Table<JsonArrayElementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table
     * reference
     */
    public JsonArrayElements(String alias) {
        this(DSL.name(alias), JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table
     * reference
     */
    public JsonArrayElements(Name alias) {
        this(alias, JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create a <code>pg_catalog.json_array_elements</code> table reference
     */
    public JsonArrayElements() {
        this(DSL.name("json_array_elements"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonArrayElements as(String alias) {
        return new JsonArrayElements(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonArrayElements as(Name alias) {
        return new JsonArrayElements(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElements rename(String name) {
        return new JsonArrayElements(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElements rename(Name name) {
        return new JsonArrayElements(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElements call(
          String fromJson
    ) {
        JsonArrayElements result = new JsonArrayElements(DSL.name("json_array_elements"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.VARCHAR)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElements call(
          Field<String> fromJson
    ) {
        JsonArrayElements result = new JsonArrayElements(DSL.name("json_array_elements"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
