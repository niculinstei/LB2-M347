/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgLargeobjectMetadata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLargeobjectMetadataRecord extends UpdatableRecordImpl<PgLargeobjectMetadataRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public void setLomowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public Long getLomowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public void setLomacl(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public String[] getLomacl() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMOWNER;
    }

    @Override
    public Field<String[]> field3() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMACL;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getLomowner();
    }

    @Override
    public String[] component3() {
        return getLomacl();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getLomowner();
    }

    @Override
    public String[] value3() {
        return getLomacl();
    }

    @Override
    public PgLargeobjectMetadataRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgLargeobjectMetadataRecord value2(Long value) {
        setLomowner(value);
        return this;
    }

    @Override
    public PgLargeobjectMetadataRecord value3(String[] value) {
        setLomacl(value);
        return this;
    }

    @Override
    public PgLargeobjectMetadataRecord values(Long value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord() {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);
    }

    /**
     * Create a detached, initialised PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord(Long oid, Long lomowner, String[] lomacl) {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);

        setOid(oid);
        setLomowner(lomowner);
        setLomacl(lomacl);
    }
}
