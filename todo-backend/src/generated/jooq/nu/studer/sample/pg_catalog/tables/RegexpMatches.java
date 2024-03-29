/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;
import nu.studer.sample.pg_catalog.tables.records.RegexpMatchesRecord;

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
public class RegexpMatches extends TableImpl<RegexpMatchesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.regexp_matches</code>
     */
    public static final RegexpMatches REGEXP_MATCHES = new RegexpMatches();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegexpMatchesRecord> getRecordType() {
        return RegexpMatchesRecord.class;
    }

    /**
     * The column <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public final TableField<RegexpMatchesRecord, String[]> REGEXP_MATCHES_ = createField(DSL.name("regexp_matches"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private RegexpMatches(Name alias, Table<RegexpMatchesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private RegexpMatches(Name alias, Table<RegexpMatchesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches(String alias) {
        this(DSL.name(alias), REGEXP_MATCHES);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches(Name alias) {
        this(alias, REGEXP_MATCHES);
    }

    /**
     * Create a <code>pg_catalog.regexp_matches</code> table reference
     */
    public RegexpMatches() {
        this(DSL.name("regexp_matches"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public RegexpMatches as(String alias) {
        return new RegexpMatches(DSL.name(alias), this, parameters);
    }

    @Override
    public RegexpMatches as(Name alias) {
        return new RegexpMatches(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpMatches rename(String name) {
        return new RegexpMatches(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpMatches rename(Name name) {
        return new RegexpMatches(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String[]> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public RegexpMatches call(
          String __1
        , String __2
    ) {
        RegexpMatches result = new RegexpMatches(DSL.name("regexp_matches"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB),
            DSL.val(__2, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public RegexpMatches call(
          Field<String> __1
        , Field<String> __2
    ) {
        RegexpMatches result = new RegexpMatches(DSL.name("regexp_matches"), null, new Field[] {
            __1,
            __2
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
