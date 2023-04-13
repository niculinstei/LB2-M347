/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgLocksRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class PgLocks extends TableImpl<PgLocksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_locks</code>
     */
    public static final PgLocks PG_LOCKS = new PgLocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLocksRecord> getRecordType() {
        return PgLocksRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_locks.locktype</code>.
     */
    public final TableField<PgLocksRecord, String> LOCKTYPE = createField(DSL.name("locktype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.database</code>.
     */
    public final TableField<PgLocksRecord, Long> DATABASE = createField(DSL.name("database"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.relation</code>.
     */
    public final TableField<PgLocksRecord, Long> RELATION = createField(DSL.name("relation"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.page</code>.
     */
    public final TableField<PgLocksRecord, Integer> PAGE = createField(DSL.name("page"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.tuple</code>.
     */
    public final TableField<PgLocksRecord, Short> TUPLE = createField(DSL.name("tuple"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    public final TableField<PgLocksRecord, String> VIRTUALXID = createField(DSL.name("virtualxid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.transactionid</code>.
     */
    public final TableField<PgLocksRecord, Long> TRANSACTIONID = createField(DSL.name("transactionid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.classid</code>.
     */
    public final TableField<PgLocksRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.objid</code>.
     */
    public final TableField<PgLocksRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.objsubid</code>.
     */
    public final TableField<PgLocksRecord, Short> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    public final TableField<PgLocksRecord, String> VIRTUALTRANSACTION = createField(DSL.name("virtualtransaction"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.pid</code>.
     */
    public final TableField<PgLocksRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.mode</code>.
     */
    public final TableField<PgLocksRecord, String> MODE = createField(DSL.name("mode"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.granted</code>.
     */
    public final TableField<PgLocksRecord, Boolean> GRANTED = createField(DSL.name("granted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.fastpath</code>.
     */
    public final TableField<PgLocksRecord, Boolean> FASTPATH = createField(DSL.name("fastpath"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.waitstart</code>.
     */
    public final TableField<PgLocksRecord, OffsetDateTime> WAITSTART = createField(DSL.name("waitstart"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLocks(Name alias, Table<PgLocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLocks(Name alias, Table<PgLocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_locks\" as  SELECT l.locktype,\n    l.database,\n    l.relation,\n    l.page,\n    l.tuple,\n    l.virtualxid,\n    l.transactionid,\n    l.classid,\n    l.objid,\n    l.objsubid,\n    l.virtualtransaction,\n    l.pid,\n    l.mode,\n    l.granted,\n    l.fastpath,\n    l.waitstart\n   FROM pg_lock_status() l(locktype, database, relation, page, tuple, virtualxid, transactionid, classid, objid, objsubid, virtualtransaction, pid, mode, granted, fastpath, waitstart);"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks(String alias) {
        this(DSL.name(alias), PG_LOCKS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks(Name alias) {
        this(alias, PG_LOCKS);
    }

    /**
     * Create a <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks() {
        this(DSL.name("pg_locks"), null);
    }

    public <O extends Record> PgLocks(Table<O> child, ForeignKey<O, PgLocksRecord> key) {
        super(child, key, PG_LOCKS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLocks as(String alias) {
        return new PgLocks(DSL.name(alias), this);
    }

    @Override
    public PgLocks as(Name alias) {
        return new PgLocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLocks rename(String name) {
        return new PgLocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLocks rename(Name name) {
        return new PgLocks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, Long, Long, Integer, Short, String, Long, Long, Long, Short, String, Integer, String, Boolean, Boolean, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}