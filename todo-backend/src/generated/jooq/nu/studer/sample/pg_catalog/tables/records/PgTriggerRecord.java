/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables.records;


import nu.studer.sample.pg_catalog.tables.PgTrigger;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTriggerRecord extends UpdatableRecordImpl<PgTriggerRecord> implements Record19<Long, Long, Long, String, Long, Short, String, Boolean, Long, Long, Long, Boolean, Boolean, Short, Object[], byte[], Object, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_trigger.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    public void setTgrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    public Long getTgrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgparentid</code>.
     */
    public void setTgparentid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgparentid</code>.
     */
    public Long getTgparentid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgname</code>.
     */
    public void setTgname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgname</code>.
     */
    public String getTgname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    public void setTgfoid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    public Long getTgfoid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    public void setTgtype(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    public Short getTgtype() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    public void setTgenabled(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    public String getTgenabled() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    public void setTgisinternal(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    public Boolean getTgisinternal() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    public void setTgconstrrelid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    public Long getTgconstrrelid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    public void setTgconstrindid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    public Long getTgconstrindid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    public void setTgconstraint(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    public Long getTgconstraint() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    public void setTgdeferrable(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    public Boolean getTgdeferrable() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    public void setTginitdeferred(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    public Boolean getTginitdeferred() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    public void setTgnargs(Short value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    public Short getTgnargs() {
        return (Short) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    public void setTgattr(Object[] value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    public Object[] getTgattr() {
        return (Object[]) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    public void setTgargs(byte[] value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    public byte[] getTgargs() {
        return (byte[]) get(15);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setTgqual(Object value) {
        set(16, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getTgqual() {
        return get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    public void setTgoldtable(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    public String getTgoldtable() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    public void setTgnewtable(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    public String getTgnewtable() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Long, Long, String, Long, Short, String, Boolean, Long, Long, Long, Boolean, Boolean, Short, Object[], byte[], Object, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Long, Long, Long, String, Long, Short, String, Boolean, Long, Long, Long, Boolean, Boolean, Short, Object[], byte[], Object, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTrigger.PG_TRIGGER.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgTrigger.PG_TRIGGER.TGRELID;
    }

    @Override
    public Field<Long> field3() {
        return PgTrigger.PG_TRIGGER.TGPARENTID;
    }

    @Override
    public Field<String> field4() {
        return PgTrigger.PG_TRIGGER.TGNAME;
    }

    @Override
    public Field<Long> field5() {
        return PgTrigger.PG_TRIGGER.TGFOID;
    }

    @Override
    public Field<Short> field6() {
        return PgTrigger.PG_TRIGGER.TGTYPE;
    }

    @Override
    public Field<String> field7() {
        return PgTrigger.PG_TRIGGER.TGENABLED;
    }

    @Override
    public Field<Boolean> field8() {
        return PgTrigger.PG_TRIGGER.TGISINTERNAL;
    }

    @Override
    public Field<Long> field9() {
        return PgTrigger.PG_TRIGGER.TGCONSTRRELID;
    }

    @Override
    public Field<Long> field10() {
        return PgTrigger.PG_TRIGGER.TGCONSTRINDID;
    }

    @Override
    public Field<Long> field11() {
        return PgTrigger.PG_TRIGGER.TGCONSTRAINT;
    }

    @Override
    public Field<Boolean> field12() {
        return PgTrigger.PG_TRIGGER.TGDEFERRABLE;
    }

    @Override
    public Field<Boolean> field13() {
        return PgTrigger.PG_TRIGGER.TGINITDEFERRED;
    }

    @Override
    public Field<Short> field14() {
        return PgTrigger.PG_TRIGGER.TGNARGS;
    }

    @Override
    public Field<Object[]> field15() {
        return PgTrigger.PG_TRIGGER.TGATTR;
    }

    @Override
    public Field<byte[]> field16() {
        return PgTrigger.PG_TRIGGER.TGARGS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field17() {
        return PgTrigger.PG_TRIGGER.TGQUAL;
    }

    @Override
    public Field<String> field18() {
        return PgTrigger.PG_TRIGGER.TGOLDTABLE;
    }

    @Override
    public Field<String> field19() {
        return PgTrigger.PG_TRIGGER.TGNEWTABLE;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getTgrelid();
    }

    @Override
    public Long component3() {
        return getTgparentid();
    }

    @Override
    public String component4() {
        return getTgname();
    }

    @Override
    public Long component5() {
        return getTgfoid();
    }

    @Override
    public Short component6() {
        return getTgtype();
    }

    @Override
    public String component7() {
        return getTgenabled();
    }

    @Override
    public Boolean component8() {
        return getTgisinternal();
    }

    @Override
    public Long component9() {
        return getTgconstrrelid();
    }

    @Override
    public Long component10() {
        return getTgconstrindid();
    }

    @Override
    public Long component11() {
        return getTgconstraint();
    }

    @Override
    public Boolean component12() {
        return getTgdeferrable();
    }

    @Override
    public Boolean component13() {
        return getTginitdeferred();
    }

    @Override
    public Short component14() {
        return getTgnargs();
    }

    @Override
    public Object[] component15() {
        return getTgattr();
    }

    @Override
    public byte[] component16() {
        return getTgargs();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component17() {
        return getTgqual();
    }

    @Override
    public String component18() {
        return getTgoldtable();
    }

    @Override
    public String component19() {
        return getTgnewtable();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getTgrelid();
    }

    @Override
    public Long value3() {
        return getTgparentid();
    }

    @Override
    public String value4() {
        return getTgname();
    }

    @Override
    public Long value5() {
        return getTgfoid();
    }

    @Override
    public Short value6() {
        return getTgtype();
    }

    @Override
    public String value7() {
        return getTgenabled();
    }

    @Override
    public Boolean value8() {
        return getTgisinternal();
    }

    @Override
    public Long value9() {
        return getTgconstrrelid();
    }

    @Override
    public Long value10() {
        return getTgconstrindid();
    }

    @Override
    public Long value11() {
        return getTgconstraint();
    }

    @Override
    public Boolean value12() {
        return getTgdeferrable();
    }

    @Override
    public Boolean value13() {
        return getTginitdeferred();
    }

    @Override
    public Short value14() {
        return getTgnargs();
    }

    @Override
    public Object[] value15() {
        return getTgattr();
    }

    @Override
    public byte[] value16() {
        return getTgargs();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value17() {
        return getTgqual();
    }

    @Override
    public String value18() {
        return getTgoldtable();
    }

    @Override
    public String value19() {
        return getTgnewtable();
    }

    @Override
    public PgTriggerRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value2(Long value) {
        setTgrelid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value3(Long value) {
        setTgparentid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value4(String value) {
        setTgname(value);
        return this;
    }

    @Override
    public PgTriggerRecord value5(Long value) {
        setTgfoid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value6(Short value) {
        setTgtype(value);
        return this;
    }

    @Override
    public PgTriggerRecord value7(String value) {
        setTgenabled(value);
        return this;
    }

    @Override
    public PgTriggerRecord value8(Boolean value) {
        setTgisinternal(value);
        return this;
    }

    @Override
    public PgTriggerRecord value9(Long value) {
        setTgconstrrelid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value10(Long value) {
        setTgconstrindid(value);
        return this;
    }

    @Override
    public PgTriggerRecord value11(Long value) {
        setTgconstraint(value);
        return this;
    }

    @Override
    public PgTriggerRecord value12(Boolean value) {
        setTgdeferrable(value);
        return this;
    }

    @Override
    public PgTriggerRecord value13(Boolean value) {
        setTginitdeferred(value);
        return this;
    }

    @Override
    public PgTriggerRecord value14(Short value) {
        setTgnargs(value);
        return this;
    }

    @Override
    public PgTriggerRecord value15(Object[] value) {
        setTgattr(value);
        return this;
    }

    @Override
    public PgTriggerRecord value16(byte[] value) {
        setTgargs(value);
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
    public PgTriggerRecord value17(Object value) {
        setTgqual(value);
        return this;
    }

    @Override
    public PgTriggerRecord value18(String value) {
        setTgoldtable(value);
        return this;
    }

    @Override
    public PgTriggerRecord value19(String value) {
        setTgnewtable(value);
        return this;
    }

    @Override
    public PgTriggerRecord values(Long value1, Long value2, Long value3, String value4, Long value5, Short value6, String value7, Boolean value8, Long value9, Long value10, Long value11, Boolean value12, Boolean value13, Short value14, Object[] value15, byte[] value16, Object value17, String value18, String value19) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTriggerRecord
     */
    public PgTriggerRecord() {
        super(PgTrigger.PG_TRIGGER);
    }

    /**
     * Create a detached, initialised PgTriggerRecord
     */
    public PgTriggerRecord(Long oid, Long tgrelid, Long tgparentid, String tgname, Long tgfoid, Short tgtype, String tgenabled, Boolean tgisinternal, Long tgconstrrelid, Long tgconstrindid, Long tgconstraint, Boolean tgdeferrable, Boolean tginitdeferred, Short tgnargs, Object[] tgattr, byte[] tgargs, Object tgqual, String tgoldtable, String tgnewtable) {
        super(PgTrigger.PG_TRIGGER);

        setOid(oid);
        setTgrelid(tgrelid);
        setTgparentid(tgparentid);
        setTgname(tgname);
        setTgfoid(tgfoid);
        setTgtype(tgtype);
        setTgenabled(tgenabled);
        setTgisinternal(tgisinternal);
        setTgconstrrelid(tgconstrrelid);
        setTgconstrindid(tgconstrindid);
        setTgconstraint(tgconstraint);
        setTgdeferrable(tgdeferrable);
        setTginitdeferred(tginitdeferred);
        setTgnargs(tgnargs);
        setTgattr(tgattr);
        setTgargs(tgargs);
        setTgqual(tgqual);
        setTgoldtable(tgoldtable);
        setTgnewtable(tgnewtable);
    }
}
