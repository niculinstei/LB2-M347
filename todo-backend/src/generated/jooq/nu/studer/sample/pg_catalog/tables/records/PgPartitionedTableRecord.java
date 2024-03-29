/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgPartitionedTable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPartitionedTableRecord extends UpdatableRecordImpl<PgPartitionedTableRecord> implements Record8<Long, String, Short, Long, Object[], Long[], Long[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public void setPartrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public Long getPartrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public void setPartstrat(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public String getPartstrat() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public void setPartnatts(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public Short getPartnatts() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partdefid</code>.
     */
    public void setPartdefid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partdefid</code>.
     */
    public Long getPartdefid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public void setPartattrs(Object[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public Object[] getPartattrs() {
        return (Object[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public void setPartclass(Long[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public Long[] getPartclass() {
        return (Long[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public void setPartcollation(Long[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public Long[] getPartcollation() {
        return (Long[]) get(6);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setPartexprs(Object value) {
        set(7, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getPartexprs() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Short, Long, Object[], Long[], Long[], Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, Short, Long, Object[], Long[], Long[], Object> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID;
    }

    @Override
    public Field<String> field2() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTSTRAT;
    }

    @Override
    public Field<Short> field3() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTNATTS;
    }

    @Override
    public Field<Long> field4() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTDEFID;
    }

    @Override
    public Field<Object[]> field5() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTATTRS;
    }

    @Override
    public Field<Long[]> field6() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCLASS;
    }

    @Override
    public Field<Long[]> field7() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCOLLATION;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field8() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTEXPRS;
    }

    @Override
    public Long component1() {
        return getPartrelid();
    }

    @Override
    public String component2() {
        return getPartstrat();
    }

    @Override
    public Short component3() {
        return getPartnatts();
    }

    @Override
    public Long component4() {
        return getPartdefid();
    }

    @Override
    public Object[] component5() {
        return getPartattrs();
    }

    @Override
    public Long[] component6() {
        return getPartclass();
    }

    @Override
    public Long[] component7() {
        return getPartcollation();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component8() {
        return getPartexprs();
    }

    @Override
    public Long value1() {
        return getPartrelid();
    }

    @Override
    public String value2() {
        return getPartstrat();
    }

    @Override
    public Short value3() {
        return getPartnatts();
    }

    @Override
    public Long value4() {
        return getPartdefid();
    }

    @Override
    public Object[] value5() {
        return getPartattrs();
    }

    @Override
    public Long[] value6() {
        return getPartclass();
    }

    @Override
    public Long[] value7() {
        return getPartcollation();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value8() {
        return getPartexprs();
    }

    @Override
    public PgPartitionedTableRecord value1(Long value) {
        setPartrelid(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value2(String value) {
        setPartstrat(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value3(Short value) {
        setPartnatts(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value4(Long value) {
        setPartdefid(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value5(Object[] value) {
        setPartattrs(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value6(Long[] value) {
        setPartclass(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord value7(Long[] value) {
        setPartcollation(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public PgPartitionedTableRecord value8(Object value) {
        setPartexprs(value);
        return this;
    }

    @Override
    public PgPartitionedTableRecord values(Long value1, String value2, Short value3, Long value4, Object[] value5, Long[] value6, Long[] value7, Object value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord() {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);
    }

    /**
     * Create a detached, initialised PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord(Long partrelid, String partstrat, Short partnatts, Long partdefid, Object[] partattrs, Long[] partclass, Long[] partcollation, Object partexprs) {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);

        setPartrelid(partrelid);
        setPartstrat(partstrat);
        setPartnatts(partnatts);
        setPartdefid(partdefid);
        setPartattrs(partattrs);
        setPartclass(partclass);
        setPartcollation(partcollation);
        setPartexprs(partexprs);
    }
}
