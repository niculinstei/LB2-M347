/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records.CollationCharacterSetApplicabilityRecord;

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
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollationCharacterSetApplicability extends TableImpl<CollationCharacterSetApplicabilityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.collation_character_set_applicability</code>
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = new CollationCharacterSetApplicability();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationCharacterSetApplicabilityRecord> getRecordType() {
        return CollationCharacterSetApplicabilityRecord.class;
    }

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased) {
        this(alias, aliased, null);
    }

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"collation_character_set_applicability\" as  SELECT (current_database())::information_schema.sql_identifier AS collation_catalog,\n    (nc.nspname)::information_schema.sql_identifier AS collation_schema,\n    (c.collname)::information_schema.sql_identifier AS collation_name,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name\n   FROM pg_collation c,\n    pg_namespace nc\n  WHERE ((c.collnamespace = nc.oid) AND (c.collencoding = ANY (ARRAY['-1'::integer, ( SELECT pg_database.encoding\n           FROM pg_database\n          WHERE (pg_database.datname = current_database()))])));"));
    }

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability(String alias) {
        this(DSL.name(alias), COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability(Name alias) {
        this(alias, COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability() {
        this(DSL.name("collation_character_set_applicability"), null);
    }

    public <O extends Record> CollationCharacterSetApplicability(Table<O> child, ForeignKey<O, CollationCharacterSetApplicabilityRecord> key) {
        super(child, key, COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CollationCharacterSetApplicability as(String alias) {
        return new CollationCharacterSetApplicability(DSL.name(alias), this);
    }

    @Override
    public CollationCharacterSetApplicability as(Name alias) {
        return new CollationCharacterSetApplicability(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(String name) {
        return new CollationCharacterSetApplicability(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(Name name) {
        return new CollationCharacterSetApplicability(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
