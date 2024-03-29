/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.JsonEach;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonEachRecord extends TableRecordImpl<JsonEachRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_each.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.json_each.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JsonEach.JSON_EACH.KEY;
    }

    @Override
    public Field<String> field2() {
        return JsonEach.JSON_EACH.VALUE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public JsonEachRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public JsonEachRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonEachRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonEachRecord
     */
    public JsonEachRecord() {
        super(JsonEach.JSON_EACH);
    }

    /**
     * Create a detached, initialised JsonEachRecord
     */
    public JsonEachRecord(String key, String value) {
        super(JsonEach.JSON_EACH);

        setKey(key);
        setValue(value);
    }
}
