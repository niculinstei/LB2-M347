/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.Sequences;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SequencesRecord extends TableRecordImpl<SequencesRecord> implements Record12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public void setSequenceCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public String getSequenceCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public void setSequenceSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public String getSequenceSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_name</code>.
     */
    public void setSequenceName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_name</code>.
     */
    public String getSequenceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sequences.data_type</code>.
     */
    public void setDataType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sequences.data_type</code>.
     */
    public String getDataType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.sequences.start_value</code>.
     */
    public void setStartValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.sequences.start_value</code>.
     */
    public String getStartValue() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.sequences.minimum_value</code>.
     */
    public void setMinimumValue(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.sequences.minimum_value</code>.
     */
    public String getMinimumValue() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.sequences.maximum_value</code>.
     */
    public void setMaximumValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.sequences.maximum_value</code>.
     */
    public String getMaximumValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.sequences.increment</code>.
     */
    public void setIncrement(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.sequences.increment</code>.
     */
    public String getIncrement() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.sequences.cycle_option</code>.
     */
    public void setCycleOption(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.sequences.cycle_option</code>.
     */
    public String getCycleOption() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Sequences.SEQUENCES.SEQUENCE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Sequences.SEQUENCES.SEQUENCE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Sequences.SEQUENCES.SEQUENCE_NAME;
    }

    @Override
    public Field<String> field4() {
        return Sequences.SEQUENCES.DATA_TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return Sequences.SEQUENCES.NUMERIC_PRECISION;
    }

    @Override
    public Field<Integer> field6() {
        return Sequences.SEQUENCES.NUMERIC_PRECISION_RADIX;
    }

    @Override
    public Field<Integer> field7() {
        return Sequences.SEQUENCES.NUMERIC_SCALE;
    }

    @Override
    public Field<String> field8() {
        return Sequences.SEQUENCES.START_VALUE;
    }

    @Override
    public Field<String> field9() {
        return Sequences.SEQUENCES.MINIMUM_VALUE;
    }

    @Override
    public Field<String> field10() {
        return Sequences.SEQUENCES.MAXIMUM_VALUE;
    }

    @Override
    public Field<String> field11() {
        return Sequences.SEQUENCES.INCREMENT;
    }

    @Override
    public Field<String> field12() {
        return Sequences.SEQUENCES.CYCLE_OPTION;
    }

    @Override
    public String component1() {
        return getSequenceCatalog();
    }

    @Override
    public String component2() {
        return getSequenceSchema();
    }

    @Override
    public String component3() {
        return getSequenceName();
    }

    @Override
    public String component4() {
        return getDataType();
    }

    @Override
    public Integer component5() {
        return getNumericPrecision();
    }

    @Override
    public Integer component6() {
        return getNumericPrecisionRadix();
    }

    @Override
    public Integer component7() {
        return getNumericScale();
    }

    @Override
    public String component8() {
        return getStartValue();
    }

    @Override
    public String component9() {
        return getMinimumValue();
    }

    @Override
    public String component10() {
        return getMaximumValue();
    }

    @Override
    public String component11() {
        return getIncrement();
    }

    @Override
    public String component12() {
        return getCycleOption();
    }

    @Override
    public String value1() {
        return getSequenceCatalog();
    }

    @Override
    public String value2() {
        return getSequenceSchema();
    }

    @Override
    public String value3() {
        return getSequenceName();
    }

    @Override
    public String value4() {
        return getDataType();
    }

    @Override
    public Integer value5() {
        return getNumericPrecision();
    }

    @Override
    public Integer value6() {
        return getNumericPrecisionRadix();
    }

    @Override
    public Integer value7() {
        return getNumericScale();
    }

    @Override
    public String value8() {
        return getStartValue();
    }

    @Override
    public String value9() {
        return getMinimumValue();
    }

    @Override
    public String value10() {
        return getMaximumValue();
    }

    @Override
    public String value11() {
        return getIncrement();
    }

    @Override
    public String value12() {
        return getCycleOption();
    }

    @Override
    public SequencesRecord value1(String value) {
        setSequenceCatalog(value);
        return this;
    }

    @Override
    public SequencesRecord value2(String value) {
        setSequenceSchema(value);
        return this;
    }

    @Override
    public SequencesRecord value3(String value) {
        setSequenceName(value);
        return this;
    }

    @Override
    public SequencesRecord value4(String value) {
        setDataType(value);
        return this;
    }

    @Override
    public SequencesRecord value5(Integer value) {
        setNumericPrecision(value);
        return this;
    }

    @Override
    public SequencesRecord value6(Integer value) {
        setNumericPrecisionRadix(value);
        return this;
    }

    @Override
    public SequencesRecord value7(Integer value) {
        setNumericScale(value);
        return this;
    }

    @Override
    public SequencesRecord value8(String value) {
        setStartValue(value);
        return this;
    }

    @Override
    public SequencesRecord value9(String value) {
        setMinimumValue(value);
        return this;
    }

    @Override
    public SequencesRecord value10(String value) {
        setMaximumValue(value);
        return this;
    }

    @Override
    public SequencesRecord value11(String value) {
        setIncrement(value);
        return this;
    }

    @Override
    public SequencesRecord value12(String value) {
        setCycleOption(value);
        return this;
    }

    @Override
    public SequencesRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, String value8, String value9, String value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SequencesRecord
     */
    public SequencesRecord() {
        super(Sequences.SEQUENCES);
    }

    /**
     * Create a detached, initialised SequencesRecord
     */
    public SequencesRecord(String sequenceCatalog, String sequenceSchema, String sequenceName, String dataType, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, String startValue, String minimumValue, String maximumValue, String increment, String cycleOption) {
        super(Sequences.SEQUENCES);

        setSequenceCatalog(sequenceCatalog);
        setSequenceSchema(sequenceSchema);
        setSequenceName(sequenceName);
        setDataType(dataType);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setStartValue(startValue);
        setMinimumValue(minimumValue);
        setMaximumValue(maximumValue);
        setIncrement(increment);
        setCycleOption(cycleOption);
    }
}
