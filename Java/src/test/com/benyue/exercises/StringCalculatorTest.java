package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator sc = new StringCalculator();

    @Test
    public void emptyString() {
        assertEquals(0, sc.Add(""));
    }

    @Test
    public void singleNumber() {
        assertEquals(1, sc.Add("1"));
    }

    @Test
    public void twoNumbers() {
        assertEquals(3, sc.Add("1,2"));
    }

    @Test
    public void manyNumbers() {
        assertEquals(10, sc.Add("1,2,3,4"));
    }

    @Test
    public void newLineAndComma() {
        assertEquals(6, sc.Add("1\n2,3"));
    }

    @Test
    public void setDelimiters() {
        assertEquals(3, sc.Add("//;\n1;2"));
    }
}
