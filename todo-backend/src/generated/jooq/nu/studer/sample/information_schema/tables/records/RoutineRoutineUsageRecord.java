/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.RoutineRoutineUsage;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineRoutineUsageRecord extends TableRecordImpl<RoutineRoutineUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field4() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.ROUTINE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.ROUTINE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE.ROUTINE_NAME;
    }

    @Override
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    public String component3() {
        return getSpecificName();
    }

    @Override
    public String component4() {
        return getRoutineCatalog();
    }

    @Override
    public String component5() {
        return getRoutineSchema();
    }

    @Override
    public String component6() {
        return getRoutineName();
    }

    @Override
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    public String value3() {
        return getSpecificName();
    }

    @Override
    public String value4() {
        return getRoutineCatalog();
    }

    @Override
    public String value5() {
        return getRoutineSchema();
    }

    @Override
    public String value6() {
        return getRoutineName();
    }

    @Override
    public RoutineRoutineUsageRecord value1(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord value2(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord value3(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord value4(String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord value5(String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord value6(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public RoutineRoutineUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutineRoutineUsageRecord
     */
    public RoutineRoutineUsageRecord() {
        super(RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised RoutineRoutineUsageRecord
     */
    public RoutineRoutineUsageRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName) {
        super(RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
    }
}
