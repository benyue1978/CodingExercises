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
        assertEquals("Foo", fooBarQix.compute(3));
    }

    @Test
    public void Five() {
        assertEquals("Bar", fooBarQix.compute(5));
    }

    @Test
    public void Fifteen() {
        assertEquals("FooBar", fooBarQix.compute(15));
    }
}
