package com.bobocode.fp;

/**
 * An util class that provides a factory method for creating an instance of a {@link FunctionMap} filled with a list
 * of functions.
 *
 * @author Taras Boychuk
 */
public class Functions {
    private Functions() {
    }

    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("sgn", e -> (e != 0) ? ((e > 0) ? 1 : -1) : 0);
        intFunctionMap.addFunction("increment", e -> ++e);
        intFunctionMap.addFunction("decrement", e -> --e);
        intFunctionMap.addFunction("square", e -> (int) Math.pow(e, 2));

        return intFunctionMap;
    }
}
