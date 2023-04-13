/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgTimezoneNames;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTimezoneNamesRecord extends TableRecordImpl<PgTimezoneNamesRecord> implements Record4<String, String, YearToSecond, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public void setAbbrev(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public String getAbbrev() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public void setUtcOffset(YearToSecond value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public YearToSecond getUtcOffset() {
        return (YearToSecond) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public void setIsDst(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public Boolean getIsDst() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, YearToSecond, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, YearToSecond, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.NAME;
    }

    @Override
    public Field<String> field2() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.ABBREV;
    }

    @Override
    public Field<YearToSecond> field3() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.UTC_OFFSET;
    }

    @Override
    public Field<Boolean> field4() {
        return PgTimezoneNames.PG_TIMEZONE_NAMES.IS_DST;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getAbbrev();
    }

    @Override
    public YearToSecond component3() {
        return getUtcOffset();
    }

    @Override
    public Boolean component4() {
        return getIsDst();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getAbbrev();
    }

    @Override
    public YearToSecond value3() {
        return getUtcOffset();
    }

    @Override
    public Boolean value4() {
        return getIsDst();
    }

    @Override
    public PgTimezoneNamesRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgTimezoneNamesRecord value2(String value) {
        setAbbrev(value);
        return this;
    }

    @Override
    public PgTimezoneNamesRecord value3(YearToSecond value) {
        setUtcOffset(value);
        return this;
    }

    @Override
    public PgTimezoneNamesRecord value4(Boolean value) {
        setIsDst(value);
        return this;
    }

    @Override
    public PgTimezoneNamesRecord values(String value1, String value2, YearToSecond value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTimezoneNamesRecord
     */
    public PgTimezoneNamesRecord() {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);
    }

    /**
     * Create a detached, initialised PgTimezoneNamesRecord
     */
    public PgTimezoneNamesRecord(String name, String abbrev, YearToSecond utcOffset, Boolean isDst) {
        super(PgTimezoneNames.PG_TIMEZONE_NAMES);

        setName(name);
        setAbbrev(abbrev);
        setUtcOffset(utcOffset);
        setIsDst(isDst);
    }
}
