/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.math.BigDecimal;

import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.GenerateSeriesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row1;
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
public class GenerateSeries extends TableImpl<GenerateSeriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.generate_series</code>
     */
    public static final GenerateSeries GENERATE_SERIES = new GenerateSeries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenerateSeriesRecord> getRecordType() {
        return GenerateSeriesRecord.class;
    }

    /**
     * The column <code>pg_catalog.generate_series.generate_series</code>.
     */
    public final TableField<GenerateSeriesRecord, BigDecimal> GENERATE_SERIES_ = createField(DSL.name("generate_series"), SQLDataType.NUMERIC, this, "");

    private GenerateSeries(Name alias, Table<GenerateSeriesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.NUMERIC),
            DSL.val(null, SQLDataType.NUMERIC),
            DSL.val(null, SQLDataType.NUMERIC)
        });
    }

    private GenerateSeries(Name alias, Table<GenerateSeriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries(String alias) {
        this(DSL.name(alias), GENERATE_SERIES);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries(Name alias) {
        this(alias, GENERATE_SERIES);
    }

    /**
     * Create a <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries() {
        this(DSL.name("generate_series"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public GenerateSeries as(String alias) {
        return new GenerateSeries(DSL.name(alias), this, parameters);
    }

    @Override
    public GenerateSeries as(Name alias) {
        return new GenerateSeries(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSeries rename(String name) {
        return new GenerateSeries(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSeries rename(Name name) {
        return new GenerateSeries(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<BigDecimal> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GenerateSeries call(
          BigDecimal __1
        , BigDecimal __2
        , BigDecimal __3
    ) {
        GenerateSeries result = new GenerateSeries(DSL.name("generate_series"), null, new Field[] {
            DSL.val(__1, SQLDataType.NUMERIC),
            DSL.val(__2, SQLDataType.NUMERIC),
            DSL.val(__3, SQLDataType.NUMERIC)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GenerateSeries call(
          Field<BigDecimal> __1
        , Field<BigDecimal> __2
        , Field<BigDecimal> __3
    ) {
        GenerateSeries result = new GenerateSeries(DSL.name("generate_series"), null, new Field[] {
            __1,
            __2,
            __3
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}