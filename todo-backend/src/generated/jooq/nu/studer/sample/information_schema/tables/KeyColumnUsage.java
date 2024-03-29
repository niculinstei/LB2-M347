/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records.KeyColumnUsageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.key_column_usage</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyColumnUsageRecord> getRecordType() {
        return KeyColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.constraint_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.table_catalog</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.table_schema</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.table_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.key_column_usage.column_name</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    public final TableField<KeyColumnUsageRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public final TableField<KeyColumnUsageRecord, Integer> POSITION_IN_UNIQUE_CONSTRAINT = createField(DSL.name("position_in_unique_constraint"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyColumnUsage(Name alias, Table<KeyColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"key_column_usage\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (ss.nc_nspname)::information_schema.sql_identifier AS constraint_schema,\n    (ss.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS table_catalog,\n    (ss.nr_nspname)::information_schema.sql_identifier AS table_schema,\n    (ss.relname)::information_schema.sql_identifier AS table_name,\n    (a.attname)::information_schema.sql_identifier AS column_name,\n    ((ss.x).n)::information_schema.cardinal_number AS ordinal_position,\n    (\n        CASE\n            WHEN (ss.contype = 'f'::\"char\") THEN information_schema._pg_index_position(ss.conindid, ss.confkey[(ss.x).n])\n            ELSE NULL::integer\n        END)::information_schema.cardinal_number AS position_in_unique_constraint\n   FROM pg_attribute a,\n    ( SELECT r.oid AS roid,\n            r.relname,\n            r.relowner,\n            nc.nspname AS nc_nspname,\n            nr.nspname AS nr_nspname,\n            c.oid AS coid,\n            c.conname,\n            c.contype,\n            c.conindid,\n            c.confkey,\n            c.confrelid,\n            information_schema._pg_expandarray(c.conkey) AS x\n           FROM pg_namespace nr,\n            pg_class r,\n            pg_namespace nc,\n            pg_constraint c\n          WHERE ((nr.oid = r.relnamespace) AND (r.oid = c.conrelid) AND (nc.oid = c.connamespace) AND (c.contype = ANY (ARRAY['p'::\"char\", 'u'::\"char\", 'f'::\"char\"])) AND (r.relkind = ANY (ARRAY['r'::\"char\", 'p'::\"char\"])) AND (NOT pg_is_other_temp_schema(nr.oid)))) ss\n  WHERE ((ss.roid = a.attrelid) AND (a.attnum = (ss.x).x) AND (NOT a.attisdropped) AND (pg_has_role(ss.relowner, 'USAGE'::text) OR has_column_privilege(ss.roid, a.attnum, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema.key_column_usage</code> table
     * reference
     */
    public KeyColumnUsage(String alias) {
        this(DSL.name(alias), KEY_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.key_column_usage</code> table
     * reference
     */
    public KeyColumnUsage(Name alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.key_column_usage</code> table reference
     */
    public KeyColumnUsage() {
        this(DSL.name("key_column_usage"), null);
    }

    public <O extends Record> KeyColumnUsage(Table<O> child, ForeignKey<O, KeyColumnUsageRecord> key) {
        super(child, key, KEY_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(DSL.name(alias), this);
    }

    @Override
    public KeyColumnUsage as(Name alias) {
        return new KeyColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyColumnUsage rename(String name) {
        return new KeyColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyColumnUsage rename(Name name) {
        return new KeyColumnUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
