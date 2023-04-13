/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgStatGetWalSendersRecord;

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
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetWalSenders extends TableImpl<PgStatGetWalSendersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_wal_senders</code>
     */
    public static final PgStatGetWalSenders PG_STAT_GET_WAL_SENDERS = new PgStatGetWalSenders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGetWalSendersRecord> getRecordType() {
        return PgStatGetWalSendersRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.pid</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.state</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> SENT_LSN = createField(DSL.name("sent_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> WRITE_LSN = createField(DSL.name("write_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> FLUSH_LSN = createField(DSL.name("flush_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> REPLAY_LSN = createField(DSL.name("replay_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.write_lag</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, YearToSecond> WRITE_LAG = createField(DSL.name("write_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.flush_lag</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, YearToSecond> FLUSH_LAG = createField(DSL.name("flush_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.replay_lag</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, YearToSecond> REPLAY_LAG = createField(DSL.name("replay_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.sync_priority</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, Integer> SYNC_PRIORITY = createField(DSL.name("sync_priority"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.sync_state</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, String> SYNC_STATE = createField(DSL.name("sync_state"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.reply_time</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, OffsetDateTime> REPLY_TIME = createField(DSL.name("reply_time"), SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_wal_senders</code> table
     * reference
     */
    public PgStatGetWalSenders(String alias) {
        this(DSL.name(alias), PG_STAT_GET_WAL_SENDERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_wal_senders</code> table
     * reference
     */
    public PgStatGetWalSenders(Name alias) {
        this(alias, PG_STAT_GET_WAL_SENDERS);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_wal_senders</code> table reference
     */
    public PgStatGetWalSenders() {
        this(DSL.name("pg_stat_get_wal_senders"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetWalSenders as(String alias) {
        return new PgStatGetWalSenders(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetWalSenders as(Name alias) {
        return new PgStatGetWalSenders(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetWalSenders rename(String name) {
        return new PgStatGetWalSenders(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetWalSenders rename(Name name) {
        return new PgStatGetWalSenders(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, Object, Object, Object, Object, YearToSecond, YearToSecond, YearToSecond, Integer, String, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetWalSenders call() {
        PgStatGetWalSenders result = new PgStatGetWalSenders(DSL.name("pg_stat_get_wal_senders"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
