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
    public void Test10() {
        RomanConverter converter = new RomanConverter();
        assertEquals("X", converter.toRoman(10));
    }

    @Test
    public void Test50() {
        RomanConverter converter = new RomanConverter();
        assertEquals("L", converter.toRoman(50));
    }

    @Test
    public void Test100() {
        RomanConverter converter = new RomanConverter();
        assertEquals("C", converter.toRoman(100));
    }

    @Test
    public void Test500() {
        RomanConverter converter = new RomanConverter();
        assertEquals("D", converter.toRoman(500));
    }

    @Test
    public void Test1000() {
        RomanConverter converter = new RomanConverter();
        assertEquals("M", converter.toRoman(1000));
    }

    @Test
    public void Test2() {
        RomanConverter converter = new RomanConverter();
        assertEquals("II", converter.toRoman(2));
    }

    @Test
    public void Test6() {
        RomanConverter converter = new RomanConverter();
        assertEquals("VI", converter.toRoman(6));
    }

    @Test
    public void Test16() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XVII", converter.toRoman(17));
    }

    @Test
    public void Test4() {
        RomanConverter converter = new RomanConverter();
        assertEquals("IV", converter.toRoman(4));
    }
}
