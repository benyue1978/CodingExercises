package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConverterTest {
    @Test
    public void Test1() {
        RomanConverter converter = new RomanConverter();
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void Test5() {
        RomanConverter converter = new RomanConverter();
        assertEquals("V", converter.toRoman(5));
    }

    @Test
    public void Test2() {
        RomanConverter converter = new RomanConverter();
        assertEquals("II", converter.toRoman(2));
    }
}
