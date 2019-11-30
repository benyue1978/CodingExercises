package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConverterTest {
    @Test
    public void OneTest() {
        RomanConverter converter = new RomanConverter();
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void FiveTest() {
        RomanConverter converter = new RomanConverter();
        assertEquals("V", converter.toRoman(5));
    }
}
