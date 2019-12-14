package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarQixTest {
    @Test
    public void One() {
        FooBarQix fooBarQix = new FooBarQix();
        assertEquals("1", fooBarQix.compute(1));
    }
}
