/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records.DomainsRecord;

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
public class Domains extends TableImpl<DomainsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.domains</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainsRecord> getRecordType() {
        return DomainsRecord.class;
    }

    /**
     * The column <code>information_schema.domains.domain_catalog</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_schema</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_name</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.data_type</code>.
     */
    public final TableField<DomainsRecord, String> DATA_TYPE = createField(DSL.name("data_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_catalog</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_schema</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.character_set_name</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_catalog</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_schema</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.collation_name</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.numeric_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.numeric_scale</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.datetime_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.interval_type</code>.
     */
    public final TableField<DomainsRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.interval_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.domain_default</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_DEFAULT = createField(DSL.name("domain_default"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_catalog</code>.
     */
    public final TableField<DomainsRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_schema</code>.
     */
    public final TableField<DomainsRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.udt_name</code>.
     */
    public final TableField<DomainsRecord, String> UDT_NAME = createField(DSL.name("udt_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_catalog</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_schema</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.scope_name</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.maximum_cardinality</code>.
     */
    public final TableField<DomainsRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), nu.studer.sample.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domains.dtd_identifier</code>.
     */
    public final TableField<DomainsRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private Domains(Name alias, Table<DomainsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Domains(Name alias, Table<DomainsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"domains\" as  SELECT (current_database())::information_schema.sql_identifier AS domain_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS domain_schema,\n    (t.typname)::information_schema.sql_identifier AS domain_name,\n    (\n        CASE\n            WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text\n            WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(t.typbasetype, NULL::integer)\n            ELSE 'USER-DEFINED'::text\n        END)::information_schema.character_data AS data_type,\n    (information_schema._pg_char_max_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_maximum_length,\n    (information_schema._pg_char_octet_length(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS character_octet_length,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (NULL::name)::information_schema.sql_identifier AS character_set_name,\n    (\n        CASE\n            WHEN (nco.nspname IS NOT NULL) THEN current_database()\n            ELSE NULL::name\n        END)::information_schema.sql_identifier AS collation_catalog,\n    (nco.nspname)::information_schema.sql_identifier AS collation_schema,\n    (co.collname)::information_schema.sql_identifier AS collation_name,\n    (information_schema._pg_numeric_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision,\n    (information_schema._pg_numeric_precision_radix(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_precision_radix,\n    (information_schema._pg_numeric_scale(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS numeric_scale,\n    (information_schema._pg_datetime_precision(t.typbasetype, t.typtypmod))::information_schema.cardinal_number AS datetime_precision,\n    (information_schema._pg_interval_type(t.typbasetype, t.typtypmod))::information_schema.character_data AS interval_type,\n    (NULL::integer)::information_schema.cardinal_number AS interval_precision,\n    (t.typdefault)::information_schema.character_data AS domain_default,\n    (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (nbt.nspname)::information_schema.sql_identifier AS udt_schema,\n    (bt.typname)::information_schema.sql_identifier AS udt_name,\n    (NULL::name)::information_schema.sql_identifier AS scope_catalog,\n    (NULL::name)::information_schema.sql_identifier AS scope_schema,\n    (NULL::name)::information_schema.sql_identifier AS scope_name,\n    (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,\n    (1)::information_schema.sql_identifier AS dtd_identifier\n   FROM (((pg_type t\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))\n     JOIN (pg_type bt\n     JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typbasetype = bt.oid) AND (t.typtype = 'd'::\"char\"))))\n     LEFT JOIN (pg_collation co\n     JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((t.typcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))\n  WHERE (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text));"));
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    /**
     * Create a <code>information_schema.domains</code> table reference
     */
    public Domains() {
        this(DSL.name("domains"), null);
    }

    public <O extends Record> Domains(Table<O> child, ForeignKey<O, DomainsRecord> key) {
        super(child, key, DOMAINS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    @Override
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(String name) {
        return new Domains(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(Name name) {
        return new Domains(name, null);
    }
}
