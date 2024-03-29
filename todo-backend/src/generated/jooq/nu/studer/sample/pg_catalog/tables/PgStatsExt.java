/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatsExtRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class PgStatsExt extends TableImpl<PgStatsExtRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stats_ext</code>
     */
    public static final PgStatsExt PG_STATS_EXT = new PgStatsExt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatsExtRecord> getRecordType() {
        return PgStatsExtRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stats_ext.schemaname</code>.
     */
    public final TableField<PgStatsExtRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.tablename</code>.
     */
    public final TableField<PgStatsExtRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.statistics_schemaname</code>.
     */
    public final TableField<PgStatsExtRecord, String> STATISTICS_SCHEMANAME = createField(DSL.name("statistics_schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.statistics_name</code>.
     */
    public final TableField<PgStatsExtRecord, String> STATISTICS_NAME = createField(DSL.name("statistics_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.statistics_owner</code>.
     */
    public final TableField<PgStatsExtRecord, String> STATISTICS_OWNER = createField(DSL.name("statistics_owner"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.attnames</code>.
     */
    public final TableField<PgStatsExtRecord, String[]> ATTNAMES = createField(DSL.name("attnames"), SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.exprs</code>.
     */
    public final TableField<PgStatsExtRecord, String[]> EXPRS = createField(DSL.name("exprs"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.kinds</code>.
     */
    public final TableField<PgStatsExtRecord, String[]> KINDS = createField(DSL.name("kinds"), SQLDataType.CHAR.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatsExtRecord, Object> N_DISTINCT = createField(DSL.name("n_distinct"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ndistinct\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatsExtRecord, Object> DEPENDENCIES = createField(DSL.name("dependencies"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_dependencies\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.most_common_vals</code>.
     */
    public final TableField<PgStatsExtRecord, String[]> MOST_COMMON_VALS = createField(DSL.name("most_common_vals"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.most_common_val_nulls</code>.
     */
    public final TableField<PgStatsExtRecord, Boolean[]> MOST_COMMON_VAL_NULLS = createField(DSL.name("most_common_val_nulls"), SQLDataType.BOOLEAN.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.most_common_freqs</code>.
     */
    public final TableField<PgStatsExtRecord, Double[]> MOST_COMMON_FREQS = createField(DSL.name("most_common_freqs"), SQLDataType.FLOAT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats_ext.most_common_base_freqs</code>.
     */
    public final TableField<PgStatsExtRecord, Double[]> MOST_COMMON_BASE_FREQS = createField(DSL.name("most_common_base_freqs"), SQLDataType.FLOAT.getArrayDataType(), this, "");

    private PgStatsExt(Name alias, Table<PgStatsExtRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatsExt(Name alias, Table<PgStatsExtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stats_ext\" as  SELECT cn.nspname AS schemaname,\n    c.relname AS tablename,\n    sn.nspname AS statistics_schemaname,\n    s.stxname AS statistics_name,\n    pg_get_userbyid(s.stxowner) AS statistics_owner,\n    ( SELECT array_agg(a.attname ORDER BY a.attnum) AS array_agg\n           FROM (unnest(s.stxkeys) k(k)\n             JOIN pg_attribute a ON (((a.attrelid = s.stxrelid) AND (a.attnum = k.k))))) AS attnames,\n    pg_get_statisticsobjdef_expressions(s.oid) AS exprs,\n    s.stxkind AS kinds,\n    sd.stxdndistinct AS n_distinct,\n    sd.stxddependencies AS dependencies,\n    m.most_common_vals,\n    m.most_common_val_nulls,\n    m.most_common_freqs,\n    m.most_common_base_freqs\n   FROM (((((pg_statistic_ext s\n     JOIN pg_class c ON ((c.oid = s.stxrelid)))\n     JOIN pg_statistic_ext_data sd ON ((s.oid = sd.stxoid)))\n     LEFT JOIN pg_namespace cn ON ((cn.oid = c.relnamespace)))\n     LEFT JOIN pg_namespace sn ON ((sn.oid = s.stxnamespace)))\n     LEFT JOIN LATERAL ( SELECT array_agg(pg_mcv_list_items.\"values\") AS most_common_vals,\n            array_agg(pg_mcv_list_items.nulls) AS most_common_val_nulls,\n            array_agg(pg_mcv_list_items.frequency) AS most_common_freqs,\n            array_agg(pg_mcv_list_items.base_frequency) AS most_common_base_freqs\n           FROM pg_mcv_list_items(sd.stxdmcv) pg_mcv_list_items(index, \"values\", nulls, frequency, base_frequency)) m ON ((sd.stxdmcv IS NOT NULL)))\n  WHERE ((NOT (EXISTS ( SELECT 1\n           FROM (unnest(s.stxkeys) k(k)\n             JOIN pg_attribute a ON (((a.attrelid = s.stxrelid) AND (a.attnum = k.k))))\n          WHERE (NOT has_column_privilege(c.oid, a.attnum, 'select'::text))))) AND ((c.relrowsecurity = false) OR (NOT row_security_active(c.oid))));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stats_ext</code> table reference
     */
    public PgStatsExt(String alias) {
        this(DSL.name(alias), PG_STATS_EXT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stats_ext</code> table reference
     */
    public PgStatsExt(Name alias) {
        this(alias, PG_STATS_EXT);
    }

    /**
     * Create a <code>pg_catalog.pg_stats_ext</code> table reference
     */
    public PgStatsExt() {
        this(DSL.name("pg_stats_ext"), null);
    }

    public <O extends Record> PgStatsExt(Table<O> child, ForeignKey<O, PgStatsExtRecord> key) {
        super(child, key, PG_STATS_EXT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatsExt as(String alias) {
        return new PgStatsExt(DSL.name(alias), this);
    }

    @Override
    public PgStatsExt as(Name alias) {
        return new PgStatsExt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatsExt rename(String name) {
        return new PgStatsExt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatsExt rename(Name name) {
        return new PgStatsExt(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, String[], String[], String[], Object, Object, String[], Boolean[], Double[], Double[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
