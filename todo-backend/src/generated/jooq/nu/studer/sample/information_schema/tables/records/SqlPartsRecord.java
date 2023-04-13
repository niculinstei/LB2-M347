/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.SqlParts;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqlPartsRecord extends TableRecordImpl<SqlPartsRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public void setFeatureId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public String getFeatureId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public void setFeatureName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public String getFeatureName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public void setIsSupported(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public String getIsSupported() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public void setIsVerifiedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public String getIsVerifiedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_parts.comments</code>.
     */
    public void setComments(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.comments</code>.
     */
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SqlParts.SQL_PARTS.FEATURE_ID;
    }

    @Override
    public Field<String> field2() {
        return SqlParts.SQL_PARTS.FEATURE_NAME;
    }

    @Override
    public Field<String> field3() {
        return SqlParts.SQL_PARTS.IS_SUPPORTED;
    }

    @Override
    public Field<String> field4() {
        return SqlParts.SQL_PARTS.IS_VERIFIED_BY;
    }

    @Override
    public Field<String> field5() {
        return SqlParts.SQL_PARTS.COMMENTS;
    }

    @Override
    public String component1() {
        return getFeatureId();
    }

    @Override
    public String component2() {
        return getFeatureName();
    }

    @Override
    public String component3() {
        return getIsSupported();
    }

    @Override
    public String component4() {
        return getIsVerifiedBy();
    }

    @Override
    public String component5() {
        return getComments();
    }

    @Override
    public String value1() {
        return getFeatureId();
    }

    @Override
    public String value2() {
        return getFeatureName();
    }

    @Override
    public String value3() {
        return getIsSupported();
    }

    @Override
    public String value4() {
        return getIsVerifiedBy();
    }

    @Override
    public String value5() {
        return getComments();
    }

    @Override
    public SqlPartsRecord value1(String value) {
        setFeatureId(value);
        return this;
    }

    @Override
    public SqlPartsRecord value2(String value) {
        setFeatureName(value);
        return this;
    }

    @Override
    public SqlPartsRecord value3(String value) {
        setIsSupported(value);
        return this;
    }

    @Override
    public SqlPartsRecord value4(String value) {
        setIsVerifiedBy(value);
        return this;
    }

    @Override
    public SqlPartsRecord value5(String value) {
        setComments(value);
        return this;
    }

    @Override
    public SqlPartsRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached SqlPartsRecord
     */
    public SqlPartsRecord() {
        super(SqlParts.SQL_PARTS);
    }

    /**
     * Create a detached, initialised SqlPartsRecord
     */
    public SqlPartsRecord(String featureId, String featureName, String isSupported, String isVerifiedBy, String comments) {
        super(SqlParts.SQL_PARTS);

        setFeatureId(featureId);
        setFeatureName(featureName);
        setIsSupported(isSupported);
        setIsVerifiedBy(isVerifiedBy);
        setComments(comments);
    }
}
