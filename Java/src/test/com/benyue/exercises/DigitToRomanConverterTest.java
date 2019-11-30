package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitToRomanConverterTest {
    @Test
    public void OneTest() {
        DigitToRomanConverter converter = new DigitToRomanConverter();
        assertEquals("I", converter.toRoman(1));
    }
}
