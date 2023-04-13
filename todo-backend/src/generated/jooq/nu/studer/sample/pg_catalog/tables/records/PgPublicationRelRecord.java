/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgPublicationRel;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPublicationRelRecord extends UpdatableRecordImpl<PgPublicationRelRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public void setPrpubid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public Long getPrpubid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public void setPrrelid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public Long getPrrelid() {
        return (Long) get(2);
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
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgPublicationRel.PG_PUBLICATION_REL.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgPublicationRel.PG_PUBLICATION_REL.PRPUBID;
    }

    @Override
    public Field<Long> field3() {
        return PgPublicationRel.PG_PUBLICATION_REL.PRRELID;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getPrpubid();
    }

    @Override
    public Long component3() {
        return getPrrelid();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getPrpubid();
    }

    @Override
    public Long value3() {
        return getPrrelid();
    }

    @Override
    public PgPublicationRelRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgPublicationRelRecord value2(Long value) {
        setPrpubid(value);
        return this;
    }

    @Override
    public PgPublicationRelRecord value3(Long value) {
        setPrrelid(value);
        return this;
    }

    @Override
    public PgPublicationRelRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationRelRecord
     */
    public PgPublicationRelRecord() {
        super(PgPublicationRel.PG_PUBLICATION_REL);
    }

    /**
     * Create a detached, initialised PgPublicationRelRecord
     */
    public PgPublicationRelRecord(Long oid, Long prpubid, Long prrelid) {
        super(PgPublicationRel.PG_PUBLICATION_REL);

        setOid(oid);
        setPrpubid(prpubid);
        setPrrelid(prrelid);
    }
}