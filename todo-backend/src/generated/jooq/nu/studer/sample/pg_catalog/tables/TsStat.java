/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.TsStatRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
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
public class TsStat extends TableImpl<TsStatRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.ts_stat</code>
     */
    public static final TsStat TS_STAT = new TsStat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TsStatRecord> getRecordType() {
        return TsStatRecord.class;
    }

    /**
     * The column <code>pg_catalog.ts_stat.word</code>.
     */
    public final TableField<TsStatRecord, String> WORD = createField(DSL.name("word"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public final TableField<TsStatRecord, Integer> NDOC = createField(DSL.name("ndoc"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.ts_stat.nentry</code>.
     */
    public final TableField<TsStatRecord, Integer> NENTRY = createField(DSL.name("nentry"), SQLDataType.INTEGER, this, "");

    private TsStat(Name alias, Table<TsStatRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private TsStat(Name alias, Table<TsStatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.ts_stat</code> table reference
     */
    public TsStat(String alias) {
        this(DSL.name(alias), TS_STAT);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_stat</code> table reference
     */
    public TsStat(Name alias) {
        this(alias, TS_STAT);
    }

    /**
     * Create a <code>pg_catalog.ts_stat</code> table reference
     */
    public TsStat() {
        this(DSL.name("ts_stat"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public TsStat as(String alias) {
        return new TsStat(DSL.name(alias), this, parameters);
    }

    @Override
    public TsStat as(Name alias) {
        return new TsStat(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsStat rename(String name) {
        return new TsStat(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsStat rename(Name name) {
        return new TsStat(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public TsStat call(
          String query
    ) {
        TsStat result = new TsStat(DSL.name("ts_stat"), null, new Field[] {
            DSL.val(query, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public TsStat call(
          Field<String> query
    ) {
        TsStat result = new TsStat(DSL.name("ts_stat"), null, new Field[] {
            query
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
