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
}
