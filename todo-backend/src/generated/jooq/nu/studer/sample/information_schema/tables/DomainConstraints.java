/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.tables.records.DomainConstraintsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class DomainConstraints extends TableImpl<DomainConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.domain_constraints</code>
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = new DomainConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainConstraintsRecord> getRecordType() {
        return DomainConstraintsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_catalog</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_schema</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.constraint_name</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_catalog</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_schema</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.domain_name</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.is_deferrable</code>.
     */
    public final TableField<DomainConstraintsRecord, String> IS_DEFERRABLE = createField(DSL.name("is_deferrable"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_constraints.initially_deferred</code>.
     */
    public final TableField<DomainConstraintsRecord, String> INITIALLY_DEFERRED = createField(DSL.name("initially_deferred"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private DomainConstraints(Name alias, Table<DomainConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainConstraints(Name alias, Table<DomainConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"domain_constraints\" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,\n    (rs.nspname)::information_schema.sql_identifier AS constraint_schema,\n    (con.conname)::information_schema.sql_identifier AS constraint_name,\n    (current_database())::information_schema.sql_identifier AS domain_catalog,\n    (n.nspname)::information_schema.sql_identifier AS domain_schema,\n    (t.typname)::information_schema.sql_identifier AS domain_name,\n    (\n        CASE\n            WHEN con.condeferrable THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_deferrable,\n    (\n        CASE\n            WHEN con.condeferred THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS initially_deferred\n   FROM pg_namespace rs,\n    pg_namespace n,\n    pg_constraint con,\n    pg_type t\n  WHERE ((rs.oid = con.connamespace) AND (n.oid = t.typnamespace) AND (t.oid = con.contypid) AND (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text)));"));
    }

    /**
     * Create an aliased <code>information_schema.domain_constraints</code>
     * table reference
     */
    public DomainConstraints(String alias) {
        this(DSL.name(alias), DOMAIN_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.domain_constraints</code>
     * table reference
     */
    public DomainConstraints(Name alias) {
        this(alias, DOMAIN_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.domain_constraints</code> table
     * reference
     */
    public DomainConstraints() {
        this(DSL.name("domain_constraints"), null);
    }

    public <O extends Record> DomainConstraints(Table<O> child, ForeignKey<O, DomainConstraintsRecord> key) {
        super(child, key, DOMAIN_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DomainConstraints as(String alias) {
        return new DomainConstraints(DSL.name(alias), this);
    }

    @Override
    public DomainConstraints as(Name alias) {
        return new DomainConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainConstraints rename(String name) {
        return new DomainConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainConstraints rename(Name name) {
        return new DomainConstraints(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
