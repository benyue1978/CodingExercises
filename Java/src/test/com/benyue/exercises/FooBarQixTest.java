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
        assertEquals("BarBar", fooBarQix.compute(5));
    }

    @Test
    public void Fifteen() {
        assertEquals("FooBarBar", fooBarQix.compute(15));
    }

    @Test
    public void Seven() {
        assertEquals("QixQix", fooBarQix.compute(7));
    }

    @Test
    public void ThirtyFive() {
        assertEquals("BarQixFooBar", fooBarQix.compute(35));
    }

    @Test
    public void OneHundredFive() {
        assertEquals("FooBarQix*Bar", fooBarQix.compute(105));
    }

    @Test
    public void ThirtyThree() {
        assertEquals("FooFooFoo", fooBarQix.compute(33));
    }

    @Test
    public void ZeroReplace101() {
        assertEquals("1*1", fooBarQix.compute(101));
    }

    @Test
    public void ZeroReplace303() {
        assertEquals("FooFoo*Foo", fooBarQix.compute(303));
    }

    @Test
    public void TwentyThree() {
        assertEquals("BarFoo", fooBarQix.compute(53));
    }
}
