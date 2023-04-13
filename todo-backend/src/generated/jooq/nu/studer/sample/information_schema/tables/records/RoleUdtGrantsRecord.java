/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables.records;


import nu.studer.sample.information_schema.tables.RoleUdtGrants;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleUdtGrantsRecord extends TableRecordImpl<RoleUdtGrantsRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.role_udt_grants.grantor</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.grantor</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.role_udt_grants.grantee</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.role_udt_grants.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.role_udt_grants.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.role_udt_grants.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.role_udt_grants.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_udt_grants.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.role_udt_grants.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.role_udt_grants.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.GRANTOR;
    }

    @Override
    public Field<String> field2() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.GRANTEE;
    }

    @Override
    public Field<String> field3() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.UDT_CATALOG;
    }

    @Override
    public Field<String> field4() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.UDT_SCHEMA;
    }

    @Override
    public Field<String> field5() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.UDT_NAME;
    }

    @Override
    public Field<String> field6() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field7() {
        return RoleUdtGrants.ROLE_UDT_GRANTS.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantor();
    }

    @Override
    public String component2() {
        return getGrantee();
    }

    @Override
    public String component3() {
        return getUdtCatalog();
    }

    @Override
    public String component4() {
        return getUdtSchema();
    }

    @Override
    public String component5() {
        return getUdtName();
    }

    @Override
    public String component6() {
        return getPrivilegeType();
    }

    @Override
    public String component7() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantor();
    }

    @Override
    public String value2() {
        return getGrantee();
    }

    @Override
    public String value3() {
        return getUdtCatalog();
    }

    @Override
    public String value4() {
        return getUdtSchema();
    }

    @Override
    public String value5() {
        return getUdtName();
    }

    @Override
    public String value6() {
        return getPrivilegeType();
    }

    @Override
    public String value7() {
        return getIsGrantable();
    }

    @Override
    public RoleUdtGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value3(String value) {
        setUdtCatalog(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value4(String value) {
        setUdtSchema(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value5(String value) {
        setUdtName(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value6(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public RoleUdtGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleUdtGrantsRecord
     */
    public RoleUdtGrantsRecord() {
        super(RoleUdtGrants.ROLE_UDT_GRANTS);
    }

    /**
     * Create a detached, initialised RoleUdtGrantsRecord
     */
    public RoleUdtGrantsRecord(String grantor, String grantee, String udtCatalog, String udtSchema, String udtName, String privilegeType, String isGrantable) {
        super(RoleUdtGrants.ROLE_UDT_GRANTS);

        setGrantor(grantor);
        setGrantee(grantee);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
    }
}
