/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PercentileContIntervalMultiFinal extends AbstractRoutine<YearToSecond[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.percentile_cont_interval_multi_final.RETURN_VALUE</code>.
     */
    public static final Parameter<YearToSecond[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * The parameter
     * <code>pg_catalog.percentile_cont_interval_multi_final._2</code>.
     */
    public static final Parameter<Double[]> _2 = Internal.createParameter("_2", SQLDataType.FLOAT.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public PercentileContIntervalMultiFinal() {
        super("percentile_cont_interval_multi_final", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double[] value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double[]> field) {
        setField(_2, field);
    }
}
