/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.db_schema;


import nu.studer.sample.db_schema.tables.Note;
import nu.studer.sample.db_schema.tables.records.NoteRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * db_schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<NoteRecord> NOTE_PKEY = Internal.createUniqueKey(Note.NOTE, DSL.name("note_pkey"), new TableField[] { Note.NOTE.NOTE_ID }, true);
}