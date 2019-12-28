package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConverterToNumberTest {
    @Test
    public void TestI() {
        RomanConverter converter = new RomanConverter();
        assertEquals(1, converter.romanToNumber("I"));
    }

    @Test
    public void TestII() {
        RomanConverter converter = new RomanConverter();
        assertEquals(2, converter.romanToNumber("II"));
    }

    @Test
    public void TestMMMCMXCIX() {
        RomanConverter converter = new RomanConverter();
        assertEquals(3999, converter.romanToNumber("MMMCMXCIX"));
    }
}
