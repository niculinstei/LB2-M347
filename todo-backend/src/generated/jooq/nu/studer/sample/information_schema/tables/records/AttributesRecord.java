/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.Attributes;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttributesRecord extends TableRecordImpl<AttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.attributes.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.attributes.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.attributes.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.attributes.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_name</code>.
     */
    public void setAttributeName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_name</code>.
     */
    public String getAttributeName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.attributes.ordinal_position</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.attributes.ordinal_position</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_default</code>.
     */
    public void setAttributeDefault(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_default</code>.
     */
    public String getAttributeDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.attributes.is_nullable</code>.
     */
    public void setIsNullable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.attributes.is_nullable</code>.
     */
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.attributes.data_type</code>.
     */
    public void setDataType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.attributes.data_type</code>.
     */
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.attributes.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.attributes.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.attributes.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.attributes.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(16);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.attributes.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.attributes.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>information_schema.attributes.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.attributes.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>information_schema.attributes.interval_type</code>.
     */
    public void setIntervalType(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.attributes.interval_type</code>.
     */
    public String getIntervalType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.attributes.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.attributes.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(21);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    public void setAttributeUdtCatalog(String value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    public String getAttributeUdtCatalog() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    public void setAttributeUdtSchema(String value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    public String getAttributeUdtSchema() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    public void setAttributeUdtName(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.attributes.attribute_udt_name</code>.
     */
    public String getAttributeUdtName() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_catalog</code>.
     */
    public void setScopeCatalog(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_schema</code>.
     */
    public void setScopeSchema(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_schema</code>.
     */
    public String getScopeSchema() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.attributes.scope_name</code>.
     */
    public void setScopeName(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.attributes.scope_name</code>.
     */
    public String getScopeName() {
        return (String) get(27);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer value) {
        set(28, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.attributes.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(29);
    }

    /**
     * Setter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    public void setIsDerivedReferenceAttribute(String value) {
        set(30, value);
    }

    /**
     * Getter for
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    public String getIsDerivedReferenceAttribute() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttributesRecord
     */
    public AttributesRecord() {
        super(Attributes.ATTRIBUTES);
    }

    /**
     * Create a detached, initialised AttributesRecord
     */
    public AttributesRecord(String udtCatalog, String udtSchema, String udtName, String attributeName, Integer ordinalPosition, String attributeDefault, String isNullable, String dataType, Integer characterMaximumLength, Integer characterOctetLength, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String attributeUdtCatalog, String attributeUdtSchema, String attributeUdtName, String scopeCatalog, String scopeSchema, String scopeName, Integer maximumCardinality, String dtdIdentifier, String isDerivedReferenceAttribute) {
        super(Attributes.ATTRIBUTES);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setAttributeName(attributeName);
        setOrdinalPosition(ordinalPosition);
        setAttributeDefault(attributeDefault);
        setIsNullable(isNullable);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setAttributeUdtCatalog(attributeUdtCatalog);
        setAttributeUdtSchema(attributeUdtSchema);
        setAttributeUdtName(attributeUdtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        setIsDerivedReferenceAttribute(isDerivedReferenceAttribute);
    }
}