package com.benyue.exercises.stringcalculator;

import com.benyue.exercises.stringcalculator.StringCalculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Rule
    public ExpectedException exceptionNegative = ExpectedException.none();

    @Test
    public void noNegative() {
        exceptionNegative.expect(IllegalArgumentException.class);
        exceptionNegative.expectMessage("negatives not allowed: -1,-2");

        sc.Add("-1,2,-2");
    }

    @Test
    public void ignore1K() {
        assertEquals(2, sc.Add("2,1001"));
    }
}
