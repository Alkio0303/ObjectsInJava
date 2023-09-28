package com.sirma.javacourse.objectsinjava.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This utility class is summing different kind of variables.
 *
 */
public class Sumator {
    /**
     * Calculates the sum of integers
     *
     * @param firstNum, first integer to be summed
     * @param secondNum, second integer to be summed
     */
    public int sumIntegers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    /**
     * Calculates the sum of doubles
     *
     * @param firstNum, first double to be summed
     * @param secondNum, second double to be summed
     */
    public double sumDoubles(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    /**
     * Calculates the sum of Strings
     *
     * @param firstNum, first double parsed from string to be summed
     * @param secondNum, second double parsed from string to be summed
     */
    public String sumStrings(String firstNum, String secondNum) {
        try {
            double num1 = Double.parseDouble(firstNum);
            double num2 = Double.parseDouble(secondNum);
            return String.valueOf(num1 + num2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: Cannot parse strings to numbers.");
        }
    }

    /**
     * Calculates the sum of Strings
     *
     * @param firstNum, first BigInteger to be summed
     * @param secondNum, second BigInteger to be summed
     */
    public BigInteger sumBigIntegers(BigInteger firstNum, BigInteger secondNum) {
        return firstNum.add(secondNum);
    }

    /**
     * Calculates the sum of Strings
     *
     * @param firstNum, first BigDecimal to be summed
     * @param secondNum, second BigDecimal to be summed
     */
    public BigDecimal sumBigDecimals(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.add(secondNum);
    }
}