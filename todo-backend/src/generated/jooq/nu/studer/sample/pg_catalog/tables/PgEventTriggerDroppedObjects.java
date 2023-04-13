/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgEventTriggerDroppedObjectsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgEventTriggerDroppedObjects extends TableImpl<PgEventTriggerDroppedObjectsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_event_trigger_dropped_objects</code>
     */
    public static final PgEventTriggerDroppedObjects PG_EVENT_TRIGGER_DROPPED_OBJECTS = new PgEventTriggerDroppedObjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEventTriggerDroppedObjectsRecord> getRecordType() {
        return PgEventTriggerDroppedObjectsRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.classid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objsubid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.original</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> ORIGINAL = createField(DSL.name("original"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.normal</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> NORMAL = createField(DSL.name("normal"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.is_temporary</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> IS_TEMPORARY = createField(DSL.name("is_temporary"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_type</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.schema_name</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_name</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_identity</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_IDENTITY = createField(DSL.name("object_identity"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_names</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String[]> ADDRESS_NAMES = createField(DSL.name("address_names"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_args</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String[]> ADDRESS_ARGS = createField(DSL.name("address_args"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgEventTriggerDroppedObjects(Name alias, Table<PgEventTriggerDroppedObjectsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgEventTriggerDroppedObjects(Name alias, Table<PgEventTriggerDroppedObjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    public PgEventTriggerDroppedObjects(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    public PgEventTriggerDroppedObjects(Name alias) {
        this(alias, PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    /**
     * Create a <code>pg_catalog.pg_event_trigger_dropped_objects</code> table
     * reference
     */
    public PgEventTriggerDroppedObjects() {
        this(DSL.name("pg_event_trigger_dropped_objects"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgEventTriggerDroppedObjects as(String alias) {
        return new PgEventTriggerDroppedObjects(DSL.name(alias), this, parameters);
    }

    @Override
    public PgEventTriggerDroppedObjects as(Name alias) {
        return new PgEventTriggerDroppedObjects(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDroppedObjects rename(String name) {
        return new PgEventTriggerDroppedObjects(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDroppedObjects rename(Name name) {
        return new PgEventTriggerDroppedObjects(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Integer, Boolean, Boolean, Boolean, String, String, String, String, String[], String[]> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgEventTriggerDroppedObjects call() {
        PgEventTriggerDroppedObjects result = new PgEventTriggerDroppedObjects(DSL.name("pg_event_trigger_dropped_objects"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
