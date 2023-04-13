/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import java.math.BigDecimal;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Numeric7 extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.numeric.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>pg_catalog.numeric._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.VARCHAR, false, true);

    /**
     * Create a new routine call instance
     */
    public Numeric7() {
        super("numeric", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }
}
