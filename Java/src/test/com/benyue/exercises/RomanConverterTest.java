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

    @Test
    public void Test9() {
        RomanConverter converter = new RomanConverter();
        assertEquals("IX", converter.toRoman(9));
    }

    @Test
    public void Test40() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XL", converter.toRoman(40));
    }

    @Test
    public void Test49() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XLIX", converter.toRoman(49));
    }

    @Test
    public void Test90() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XC", converter.toRoman(90));
    }

    @Test
    public void Test400() {
        RomanConverter converter = new RomanConverter();
        assertEquals("CD", converter.toRoman(400));
    }

    @Test
    public void Test900() {
        RomanConverter converter = new RomanConverter();
        assertEquals("CM", converter.toRoman(900));
    }

    @Test
    public void Test3999() {
        RomanConverter converter = new RomanConverter();
        assertEquals("MMMCMXCIX", converter.toRoman(3999));
    }

}
