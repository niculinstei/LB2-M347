/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgMcvListItems;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgMcvListItemsRecord extends TableRecordImpl<PgMcvListItemsRecord> implements Record5<Integer, String[], Boolean[], Double, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.index</code>.
     */
    public void setIndex(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.index</code>.
     */
    public Integer getIndex() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.values</code>.
     */
    public void setValues(String[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.values</code>.
     */
    public String[] getValues() {
        return (String[]) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.nulls</code>.
     */
    public void setNulls(Boolean[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.nulls</code>.
     */
    public Boolean[] getNulls() {
        return (Boolean[]) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.frequency</code>.
     */
    public void setFrequency(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.frequency</code>.
     */
    public Double getFrequency() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_mcv_list_items.base_frequency</code>.
     */
    public void setBaseFrequency(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_mcv_list_items.base_frequency</code>.
     */
    public Double getBaseFrequency() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String[], Boolean[], Double, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String[], Boolean[], Double, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.INDEX;
    }

    @Override
    public Field<String[]> field2() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.VALUES;
    }

    @Override
    public Field<Boolean[]> field3() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.NULLS;
    }

    @Override
    public Field<Double> field4() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.FREQUENCY;
    }

    @Override
    public Field<Double> field5() {
        return PgMcvListItems.PG_MCV_LIST_ITEMS.BASE_FREQUENCY;
    }

    @Override
    public Integer component1() {
        return getIndex();
    }

    @Override
    public String[] component2() {
        return getValues();
    }

    @Override
    public Boolean[] component3() {
        return getNulls();
    }

    @Override
    public Double component4() {
        return getFrequency();
    }

    @Override
    public Double component5() {
        return getBaseFrequency();
    }

    @Override
    public Integer value1() {
        return getIndex();
    }

    @Override
    public String[] value2() {
        return getValues();
    }

    @Override
    public Boolean[] value3() {
        return getNulls();
    }

    @Override
    public Double value4() {
        return getFrequency();
    }

    @Override
    public Double value5() {
        return getBaseFrequency();
    }

    @Override
    public PgMcvListItemsRecord value1(Integer value) {
        setIndex(value);
        return this;
    }

    @Override
    public PgMcvListItemsRecord value2(String[] value) {
        setValues(value);
        return this;
    }

    @Override
    public PgMcvListItemsRecord value3(Boolean[] value) {
        setNulls(value);
        return this;
    }

    @Override
    public PgMcvListItemsRecord value4(Double value) {
        setFrequency(value);
        return this;
    }

    @Override
    public PgMcvListItemsRecord value5(Double value) {
        setBaseFrequency(value);
        return this;
    }

    @Override
    public PgMcvListItemsRecord values(Integer value1, String[] value2, Boolean[] value3, Double value4, Double value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgMcvListItemsRecord
     */
    public PgMcvListItemsRecord() {
        super(PgMcvListItems.PG_MCV_LIST_ITEMS);
    }

    /**
     * Create a detached, initialised PgMcvListItemsRecord
     */
    public PgMcvListItemsRecord(Integer index, String[] values, Boolean[] nulls, Double frequency, Double baseFrequency) {
        super(PgMcvListItems.PG_MCV_LIST_ITEMS);

        setIndex(index);
        setValues(values);
        setNulls(nulls);
        setFrequency(frequency);
        setBaseFrequency(baseFrequency);
    }
}
