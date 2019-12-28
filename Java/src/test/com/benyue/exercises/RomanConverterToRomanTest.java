package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConverterToRomanTest {
    @Test
    public void Test1() {
        RomanConverter converter = new RomanConverter();
        assertEquals("I", converter.numberToRoman(1));
    }

    @Test
    public void Test5() {
        RomanConverter converter = new RomanConverter();
        assertEquals("V", converter.numberToRoman(5));
    }

    @Test
    public void Test10() {
        RomanConverter converter = new RomanConverter();
        assertEquals("X", converter.numberToRoman(10));
    }

    @Test
    public void Test50() {
        RomanConverter converter = new RomanConverter();
        assertEquals("L", converter.numberToRoman(50));
    }

    @Test
    public void Test100() {
        RomanConverter converter = new RomanConverter();
        assertEquals("C", converter.numberToRoman(100));
    }

    @Test
    public void Test500() {
        RomanConverter converter = new RomanConverter();
        assertEquals("D", converter.numberToRoman(500));
    }

    @Test
    public void Test1000() {
        RomanConverter converter = new RomanConverter();
        assertEquals("M", converter.numberToRoman(1000));
    }

    @Test
    public void Test2() {
        RomanConverter converter = new RomanConverter();
        assertEquals("II", converter.numberToRoman(2));
    }

    @Test
    public void Test6() {
        RomanConverter converter = new RomanConverter();
        assertEquals("VI", converter.numberToRoman(6));
    }

    @Test
    public void Test16() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XVII", converter.numberToRoman(17));
    }

    @Test
    public void Test4() {
        RomanConverter converter = new RomanConverter();
        assertEquals("IV", converter.numberToRoman(4));
    }

    @Test
    public void Test9() {
        RomanConverter converter = new RomanConverter();
        assertEquals("IX", converter.numberToRoman(9));
    }

    @Test
    public void Test40() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XL", converter.numberToRoman(40));
    }

    @Test
    public void Test49() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XLIX", converter.numberToRoman(49));
    }

    @Test
    public void Test90() {
        RomanConverter converter = new RomanConverter();
        assertEquals("XC", converter.numberToRoman(90));
    }

    @Test
    public void Test400() {
        RomanConverter converter = new RomanConverter();
        assertEquals("CD", converter.numberToRoman(400));
    }

    @Test
    public void Test900() {
        RomanConverter converter = new RomanConverter();
        assertEquals("CM", converter.numberToRoman(900));
    }

    @Test
    public void Test3999() {
        RomanConverter converter = new RomanConverter();
        assertEquals("MMMCMXCIX", converter.numberToRoman(3999));
    }
}
