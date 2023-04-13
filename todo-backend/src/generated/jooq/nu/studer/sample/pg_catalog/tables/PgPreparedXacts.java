/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgPreparedXactsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class PgPreparedXacts extends TableImpl<PgPreparedXactsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_xacts</code>
     */
    public static final PgPreparedXacts PG_PREPARED_XACTS = new PgPreparedXacts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedXactsRecord> getRecordType() {
        return PgPreparedXactsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public final TableField<PgPreparedXactsRecord, Long> TRANSACTION = createField(DSL.name("transaction"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> GID = createField(DSL.name("gid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public final TableField<PgPreparedXactsRecord, OffsetDateTime> PREPARED = createField(DSL.name("prepared"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> OWNER = createField(DSL.name("owner"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> DATABASE = createField(DSL.name("database"), SQLDataType.VARCHAR, this, "");

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_prepared_xacts\" as  SELECT p.transaction,\n    p.gid,\n    p.prepared,\n    u.rolname AS owner,\n    d.datname AS database\n   FROM ((pg_prepared_xact() p(transaction, gid, prepared, ownerid, dbid)\n     LEFT JOIN pg_authid u ON ((p.ownerid = u.oid)))\n     LEFT JOIN pg_database d ON ((p.dbid = d.oid)));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table
     * reference
     */
    public PgPreparedXacts(String alias) {
        this(DSL.name(alias), PG_PREPARED_XACTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table
     * reference
     */
    public PgPreparedXacts(Name alias) {
        this(alias, PG_PREPARED_XACTS);
    }

    /**
     * Create a <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts() {
        this(DSL.name("pg_prepared_xacts"), null);
    }

    public <O extends Record> PgPreparedXacts(Table<O> child, ForeignKey<O, PgPreparedXactsRecord> key) {
        super(child, key, PG_PREPARED_XACTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPreparedXacts as(String alias) {
        return new PgPreparedXacts(DSL.name(alias), this);
    }

    @Override
    public PgPreparedXacts as(Name alias) {
        return new PgPreparedXacts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(String name) {
        return new PgPreparedXacts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(Name name) {
        return new PgPreparedXacts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, OffsetDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
