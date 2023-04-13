/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.public_.enums;


import nu.studer.sample.public_.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum Notestate implements EnumType {

    TODOIN_PROGRESSDONE("TODOIN_PROGRESSDONE");

    private final String literal;

    private Notestate(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "notestate";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}