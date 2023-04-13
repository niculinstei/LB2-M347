/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema;


import java.time.OffsetDateTime;

import org.jooq.Domain;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.LazySchema;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all Domains in information_schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains {

    /**
     * The domain <code>information_schema.cardinal_number</code>.
     */
    public static final Domain<Integer> CARDINAL_NUMBER = Internal.createDomain(
          schema()
        , DSL.name("cardinal_number")
        , SQLDataType.INTEGER
        , Internal.createCheck(null, null, "CHECK ((VALUE >= 0))")
    );

    /**
     * The domain <code>information_schema.character_data</code>.
     */
    public static final Domain<String> CHARACTER_DATA = Internal.createDomain(
          schema()
        , DSL.name("character_data")
        , SQLDataType.VARCHAR
    );

    /**
     * The domain <code>information_schema.sql_identifier</code>.
     */
    public static final Domain<String> SQL_IDENTIFIER = Internal.createDomain(
          schema()
        , DSL.name("sql_identifier")
        , SQLDataType.VARCHAR
    );

    /**
     * The domain <code>information_schema.time_stamp</code>.
     */
    public static final Domain<OffsetDateTime> TIME_STAMP = Internal.createDomain(
          schema()
        , DSL.name("time_stamp")
        , SQLDataType.TIMESTAMPWITHTIMEZONE.defaultValue(DSL.field("CURRENT_TIMESTAMP(2)", SQLDataType.TIMESTAMPWITHTIMEZONE))
    );

    /**
     * The domain <code>information_schema.yes_or_no</code>.
     */
    public static final Domain<String> YES_OR_NO = Internal.createDomain(
          schema()
        , DSL.name("yes_or_no")
        , SQLDataType.VARCHAR(3)
        , Internal.createCheck(null, null, "CHECK (((VALUE)::text = ANY ((ARRAY['YES'::character varying, 'NO'::character varying])::text[])))")
    );

    private static final Schema schema() {
        return new LazySchema(DSL.name("information_schema"), DSL.comment(""), () -> InformationSchema.INFORMATION_SCHEMA);
    }
}
