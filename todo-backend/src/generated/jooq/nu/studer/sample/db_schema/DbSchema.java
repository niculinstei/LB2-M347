/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.db_schema;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.DefaultCatalog;
import nu.studer.sample.db_schema.tables.Note;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>db_schema</code>
     */
    public static final DbSchema DB_SCHEMA = new DbSchema();

    /**
     * The table <code>db_schema.note</code>.
     */
    public final Note NOTE = Note.NOTE;

    /**
     * No further instances allowed
     */
    private DbSchema() {
        super("db_schema", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Note.NOTE
        );
    }
}
