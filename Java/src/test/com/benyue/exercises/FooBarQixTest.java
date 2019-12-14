package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarQixTest {
    FooBarQix fooBarQix = new FooBarQix();

    @Test
    public void One() {
        assertEquals("1", fooBarQix.compute(1));
    }

    @Test
    public void Two() {
        assertEquals("2", fooBarQix.compute(2));
    }

    @Test
    public void Three() {
        assertEquals("FooFoo", fooBarQix.compute(3));
    }

    @Test
    public void Five() {
        assertEquals("Bar", fooBarQix.compute(5));
    }

    @Test
    public void Fifteen() {
        assertEquals("FooBar", fooBarQix.compute(15));
    }

    @Test
    public void Seven() {
        assertEquals("Qix", fooBarQix.compute(7));
    }

    @Test
    public void ThirtyFive() {
        assertEquals("BarQixFoo", fooBarQix.compute(35));
    }

    @Test
    public void OneHundredFive() {
        assertEquals("FooBarQix", fooBarQix.compute(105));
    }
}
