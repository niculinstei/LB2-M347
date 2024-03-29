/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records.AttributesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Attributes extends TableImpl<AttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.attributes</code>
     */
    public static final Attributes ATTRIBUTES = new Attributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributesRecord> getRecordType() {
        return AttributesRecord.class;
    }

    /**
     * The column <code>information_schema.attributes.udt_catalog</code>.
     */
    public final TableField<AttributesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.udt_schema</code>.
     */
    public final TableField<AttributesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.udt_name</code>.
     */
    public final TableField<AttributesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.attribute_name</code>.
     */
    public final TableField<AttributesRecord, String> ATTRIBUTE_NAME = createField(DSL.name("attribute_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.ordinal_position</code>.
     */
    public final TableField<AttributesRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.attribute_default</code>.
     */
    public final TableField<AttributesRecord, String> ATTRIBUTE_DEFAULT = createField(DSL.name("attribute_default"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.is_nullable</code>.
     */
    public final TableField<AttributesRecord, String> IS_NULLABLE = createField(DSL.name("is_nullable"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.data_type</code>.
     */
    public final TableField<AttributesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.character_maximum_length</code>.
     */
    public final TableField<AttributesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.character_octet_length</code>.
     */
    public final TableField<AttributesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.character_set_catalog</code>.
     */
    public final TableField<AttributesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.character_set_schema</code>.
     */
    public final TableField<AttributesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.character_set_name</code>.
     */
    public final TableField<AttributesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.collation_catalog</code>.
     */
    public final TableField<AttributesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.collation_schema</code>.
     */
    public final TableField<AttributesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.collation_name</code>.
     */
    public final TableField<AttributesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.numeric_precision</code>.
     */
    public final TableField<AttributesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.numeric_precision_radix</code>.
     */
    public final TableField<AttributesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.numeric_scale</code>.
     */
    public final TableField<AttributesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.datetime_precision</code>.
     */
    public final TableField<AttributesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.interval_type</code>.
     */
    public final TableField<AttributesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.interval_precision</code>.
     */
    public final TableField<AttributesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.attribute_udt_catalog</code>.
     */
    public final TableField<AttributesRecord, String> ATTRIBUTE_UDT_CATALOG = createField(DSL.name("attribute_udt_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.attribute_udt_schema</code>.
     */
    public final TableField<AttributesRecord, String> ATTRIBUTE_UDT_SCHEMA = createField(DSL.name("attribute_udt_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.attribute_udt_name</code>.
     */
    public final TableField<AttributesRecord, String> ATTRIBUTE_UDT_NAME = createField(DSL.name("attribute_udt_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.scope_catalog</code>.
     */
    public final TableField<AttributesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.scope_schema</code>.
     */
    public final TableField<AttributesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.scope_name</code>.
     */
    public final TableField<AttributesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.maximum_cardinality</code>.
     */
    public final TableField<AttributesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.attributes.dtd_identifier</code>.
     */
    public final TableField<AttributesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.attributes.is_derived_reference_attribute</code>.
     */
    public final TableField<AttributesRecord, String> IS_DERIVED_REFERENCE_ATTRIBUTE = createField(DSL.name("is_derived_reference_attribute"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private Attributes(Name alias, Table<AttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attributes(Name alias, Table<AttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"attributes\" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS udt_schema,\n    (c.relname)::information_schema.sql_identifier AS udt_name,\n    (a.attname)::information_schema.sql_identifier AS attribute_name,\n    (a.attnum)::information_schema.cardinal_number AS ordinal_position,\n    (pg_get_expr(ad.adbin, ad.adrelid))::information_schema.character_data AS attribute_default,\n    (\n        CASE\n            WHEN (a.attnotnull OR ((t.typtype = 'd'::\"char\") AND t.typnotnull)) THEN 'NO'::text\n            ELSE 'YES'::text\n        END)::information_schema.yes_or_no AS is_nullable,\n    (\n        CASE\n            WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text\n            WHEN (nt.nspname = 'pg_catalog'::name) THEN format_type(a.atttypid, NULL::integer)\n            ELSE 'USER-DEFINED'::text\n        END)::information_schema.character_data AS data_type,\n    (information_schema._pg_char_max_length(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS character_maximum_length,\n    (information_schema._pg_char_octet_length(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS character_octet_length,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (NULL::name)::information_schema.sql_identifier AS character_set_name,\n    (\n        CASE\n            WHEN (nco.nspname IS NOT NULL) THEN current_database()\n            ELSE NULL::name\n        END)::information_schema.sql_identifier AS collation_catalog,\n    (nco.nspname)::information_schema.sql_identifier AS collation_schema,\n    (co.collname)::information_schema.sql_identifier AS collation_name,\n    (information_schema._pg_numeric_precision(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_precision,\n    (information_schema._pg_numeric_precision_radix(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_precision_radix,\n    (information_schema._pg_numeric_scale(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_scale,\n    (information_schema._pg_datetime_precision(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS datetime_precision,\n    (information_schema._pg_interval_type(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.character_data AS interval_type,\n    (NULL::integer)::information_schema.cardinal_number AS interval_precision,\n    (current_database())::information_schema.sql_identifier AS attribute_udt_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS attribute_udt_schema,\n    (t.typname)::information_schema.sql_identifier AS attribute_udt_name,\n    (NULL::name)::information_schema.sql_identifier AS scope_catalog,\n    (NULL::name)::information_schema.sql_identifier AS scope_schema,\n    (NULL::name)::information_schema.sql_identifier AS scope_name,\n    (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,\n    (a.attnum)::information_schema.sql_identifier AS dtd_identifier,\n    ('NO'::character varying)::information_schema.yes_or_no AS is_derived_reference_attribute\n   FROM ((((pg_attribute a\n     LEFT JOIN pg_attrdef ad ON (((a.attrelid = ad.adrelid) AND (a.attnum = ad.adnum))))\n     JOIN (pg_class c\n     JOIN pg_namespace nc ON ((c.relnamespace = nc.oid))) ON ((a.attrelid = c.oid)))\n     JOIN (pg_type t\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON ((a.atttypid = t.oid)))\n     LEFT JOIN (pg_collation co\n     JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((a.attcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))\n  WHERE ((a.attnum > 0) AND (NOT a.attisdropped) AND (c.relkind = 'c'::\"char\") AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_type_privilege(c.reltype, 'USAGE'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema.attributes</code> table
     * reference
     */
    public Attributes(String alias) {
        this(DSL.name(alias), ATTRIBUTES);
    }

    /**
     * Create an aliased <code>information_schema.attributes</code> table
     * reference
     */
    public Attributes(Name alias) {
        this(alias, ATTRIBUTES);
    }

    /**
     * Create a <code>information_schema.attributes</code> table reference
     */
    public Attributes() {
        this(DSL.name("attributes"), null);
    }

    public <O extends Record> Attributes(Table<O> child, ForeignKey<O, AttributesRecord> key) {
        super(child, key, ATTRIBUTES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Attributes as(String alias) {
        return new Attributes(DSL.name(alias), this);
    }

    @Override
    public Attributes as(Name alias) {
        return new Attributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(String name) {
        return new Attributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(Name name) {
        return new Attributes(name, null);
    }
}
