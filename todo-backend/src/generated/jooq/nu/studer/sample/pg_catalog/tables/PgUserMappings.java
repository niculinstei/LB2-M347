/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgUserMappingsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class PgUserMappings extends TableImpl<PgUserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_user_mappings</code>
     */
    public static final PgUserMappings PG_USER_MAPPINGS = new PgUserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserMappingsRecord> getRecordType() {
        return PgUserMappingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMID = createField(DSL.name("umid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> SRVID = createField(DSL.name("srvid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public final TableField<PgUserMappingsRecord, String> SRVNAME = createField(DSL.name("srvname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMUSER = createField(DSL.name("umuser"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public final TableField<PgUserMappingsRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public final TableField<PgUserMappingsRecord, String[]> UMOPTIONS = createField(DSL.name("umoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_user_mappings\" as  SELECT u.oid AS umid,\n    s.oid AS srvid,\n    s.srvname,\n    u.umuser,\n        CASE\n            WHEN (u.umuser = (0)::oid) THEN 'public'::name\n            ELSE a.rolname\n        END AS usename,\n        CASE\n            WHEN (((u.umuser <> (0)::oid) AND (a.rolname = CURRENT_USER) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text))) OR ((u.umuser = (0)::oid) AND pg_has_role(s.srvowner, 'USAGE'::text)) OR ( SELECT pg_authid.rolsuper\n               FROM pg_authid\n              WHERE (pg_authid.rolname = CURRENT_USER))) THEN u.umoptions\n            ELSE NULL::text[]\n        END AS umoptions\n   FROM ((pg_user_mapping u\n     JOIN pg_foreign_server s ON ((u.umserver = s.oid)))\n     LEFT JOIN pg_authid a ON ((a.oid = u.umuser)));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table
     * reference
     */
    public PgUserMappings(String alias) {
        this(DSL.name(alias), PG_USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table
     * reference
     */
    public PgUserMappings(Name alias) {
        this(alias, PG_USER_MAPPINGS);
    }

    /**
     * Create a <code>pg_catalog.pg_user_mappings</code> table reference
     */
    public PgUserMappings() {
        this(DSL.name("pg_user_mappings"), null);
    }

    public <O extends Record> PgUserMappings(Table<O> child, ForeignKey<O, PgUserMappingsRecord> key) {
        super(child, key, PG_USER_MAPPINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgUserMappings as(String alias) {
        return new PgUserMappings(DSL.name(alias), this);
    }

    @Override
    public PgUserMappings as(Name alias) {
        return new PgUserMappings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(String name) {
        return new PgUserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(Name name) {
        return new PgUserMappings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, String, Long, String, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
