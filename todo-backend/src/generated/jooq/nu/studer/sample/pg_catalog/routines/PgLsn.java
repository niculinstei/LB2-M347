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
 * @deprecated Unknown data type. Please define an explicit {@link
 * org.jooq.Binding} to specify how this type should be handled. Deprecation can
 * be turned off using {@literal <deprecationOnUnknownTypes/>} in your code
 * generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLsn extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_lsn._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = Internal.createParameter("_1", SQLDataType.NUMERIC, false, true);

    /**
     * Create a new routine call instance
     */
    public PgLsn() {
        super("pg_lsn", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }
}
