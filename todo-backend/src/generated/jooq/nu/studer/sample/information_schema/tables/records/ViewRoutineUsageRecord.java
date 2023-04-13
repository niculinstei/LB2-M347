/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.ViewRoutineUsage;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewRoutineUsageRecord extends TableRecordImpl<ViewRoutineUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.view_routine_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_routine_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.view_routine_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_routine_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.view_routine_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.view_routine_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.view_routine_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_routine_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.view_routine_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_routine_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.view_routine_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_routine_usage.specific_name</code>.
     */
    public String getSpecificName() {
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
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_NAME;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getSpecificCatalog();
    }

    @Override
    public String component5() {
        return getSpecificSchema();
    }

    @Override
    public String component6() {
        return getSpecificName();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getSpecificCatalog();
    }

    @Override
    public String value5() {
        return getSpecificSchema();
    }

    @Override
    public String value6() {
        return getSpecificName();
    }

    @Override
    public ViewRoutineUsageRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord value4(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord value5(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord value6(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public ViewRoutineUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached ViewRoutineUsageRecord
     */
    public ViewRoutineUsageRecord() {
        super(ViewRoutineUsage.VIEW_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised ViewRoutineUsageRecord
     */
    public ViewRoutineUsageRecord(String tableCatalog, String tableSchema, String tableName, String specificCatalog, String specificSchema, String specificName) {
        super(ViewRoutineUsage.VIEW_ROUTINE_USAGE);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
    }
}
