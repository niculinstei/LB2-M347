/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCopyLogicalReplicationSlot3 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_copy_logical_replication_slot.src_slot_name</code>.
     */
    public static final Parameter<String> SRC_SLOT_NAME = Internal.createParameter("src_slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_copy_logical_replication_slot.dst_slot_name</code>.
     */
    public static final Parameter<String> DST_SLOT_NAME = Internal.createParameter("dst_slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_copy_logical_replication_slot.slot_name</code>.
     */
    public static final Parameter<String> SLOT_NAME = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * Create a new routine call instance
     */
    public PgCopyLogicalReplicationSlot3() {
        super("pg_copy_logical_replication_slot", PgCatalog.PG_CATALOG);

        addInParameter(SRC_SLOT_NAME);
        addInParameter(DST_SLOT_NAME);
        addOutParameter(SLOT_NAME);
        addOutParameter(LSN);
        setOverloaded(true);
    }

    /**
     * Set the <code>src_slot_name</code> parameter IN value to the routine
     */
    public void setSrcSlotName(String value) {
        setValue(SRC_SLOT_NAME, value);
    }

    /**
     * Set the <code>dst_slot_name</code> parameter IN value to the routine
     */
    public void setDstSlotName(String value) {
        setValue(DST_SLOT_NAME, value);
    }

    /**
     * Get the <code>slot_name</code> parameter OUT value from the routine
     */
    public String getSlotName() {
        return get(SLOT_NAME);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getLsn() {
        return get(LSN);
    }
}
