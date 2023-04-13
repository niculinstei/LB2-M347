/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.PgPreparedStatementRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row7;
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
public class PgPreparedStatement extends TableImpl<PgPreparedStatementRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_statement</code>
     */
    public static final PgPreparedStatement PG_PREPARED_STATEMENT = new PgPreparedStatement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedStatementRecord> getRecordType() {
        return PgPreparedStatementRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public final TableField<PgPreparedStatementRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public final TableField<PgPreparedStatementRecord, String> STATEMENT = createField(DSL.name("statement"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public final TableField<PgPreparedStatementRecord, OffsetDateTime> PREPARE_TIME = createField(DSL.name("prepare_time"), SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public final TableField<PgPreparedStatementRecord, Object[]> PARAMETER_TYPES = createField(DSL.name("parameter_types"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\"").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public final TableField<PgPreparedStatementRecord, Boolean> FROM_SQL = createField(DSL.name("from_sql"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.generic_plans</code>.
     */
    public final TableField<PgPreparedStatementRecord, Long> GENERIC_PLANS = createField(DSL.name("generic_plans"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.custom_plans</code>.
     */
    public final TableField<PgPreparedStatementRecord, Long> CUSTOM_PLANS = createField(DSL.name("custom_plans"), SQLDataType.BIGINT, this, "");

    private PgPreparedStatement(Name alias, Table<PgPreparedStatementRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgPreparedStatement(Name alias, Table<PgPreparedStatementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statement</code> table
     * reference
     */
    public PgPreparedStatement(String alias) {
        this(DSL.name(alias), PG_PREPARED_STATEMENT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statement</code> table
     * reference
     */
    public PgPreparedStatement(Name alias) {
        this(alias, PG_PREPARED_STATEMENT);
    }

    /**
     * Create a <code>pg_catalog.pg_prepared_statement</code> table reference
     */
    public PgPreparedStatement() {
        this(DSL.name("pg_prepared_statement"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPreparedStatement as(String alias) {
        return new PgPreparedStatement(DSL.name(alias), this, parameters);
    }

    @Override
    public PgPreparedStatement as(Name alias) {
        return new PgPreparedStatement(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatement rename(String name) {
        return new PgPreparedStatement(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatement rename(Name name) {
        return new PgPreparedStatement(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, OffsetDateTime, Object[], Boolean, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgPreparedStatement call() {
        PgPreparedStatement result = new PgPreparedStatement(DSL.name("pg_prepared_statement"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}