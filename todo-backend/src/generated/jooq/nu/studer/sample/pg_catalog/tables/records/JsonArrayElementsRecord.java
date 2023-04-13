/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.JsonArrayElements;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonArrayElementsRecord extends TableRecordImpl<JsonArrayElementsRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JsonArrayElements.JSON_ARRAY_ELEMENTS.VALUE;
    }

    @Override
    public String component1() {
        return getValue();
    }

    @Override
    public String value1() {
        return getValue();
    }

    @Override
    public JsonArrayElementsRecord value1(String value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonArrayElementsRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord() {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create a detached, initialised JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord(String value) {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);

        setValue(value);
    }
}
