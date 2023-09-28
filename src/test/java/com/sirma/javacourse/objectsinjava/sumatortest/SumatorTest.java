package com.sirma.javacourse.objectsinjava.sumatortest;

import com.sirma.javacourse.objectsinjava.sumator.Sumator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SumatorTest {

    @Test
    public void testSumIntegers() {
        Sumator sumator = new Sumator();
        assertEquals(12, sumator.sumIntegers(5, 7));
    }

    @Test
    public void testSumDoubles() {
        Sumator sumator = new Sumator();
        assertEquals(5.85, sumator.sumDoubles(3.14, 2.71));
    }

    @Test
    public void testSumStrings() {
        Sumator sumator = new Sumator();
        assertEquals("30.8", sumator.sumStrings("10.5", "20.3"));
    }

    @Test
    public void testSumBigIntegers() {
        Sumator sumator = new Sumator();
        assertEquals(new BigInteger("11111111100"), sumator.sumBigIntegers(new BigInteger("1234567890"), new BigInteger("9876543210")));
    }

    @Test
    public void testSumBigDecimals() {
        Sumator sumator = new Sumator();
        assertEquals(new BigDecimal("11111.1110"), sumator.sumBigDecimals(new BigDecimal("1234.5678"), new BigDecimal("9876.5432")));
    }

    @Test
    public void testSumInvalidStringInput() {
        Sumator sumator = new Sumator();
        assertThrows(IllegalArgumentException.class, () -> sumator.sumStrings("abc", "def"));
    }
}