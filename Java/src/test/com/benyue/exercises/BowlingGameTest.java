package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void AllZeroTest() {
        BowlingGame game = new BowlingGame("-- -- -- -- -- -- -- -- -- --");
        assertEquals(0, game.getScore());
    }

    @Test
    public void AllNumbersTest() {
        BowlingGame game = new BowlingGame("11 22 33 44 11 22 33 44 11 22");
        assertEquals(46, game.getScore());
    }

    @Test
    public void NumberWithTrailingMissTest() {
        BowlingGame game = new BowlingGame("1- 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(10, game.getScore());
    }

    @Test
    public void NumberWithLeadingMissTest() {
        BowlingGame game = new BowlingGame("-2 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(11, game.getScore());
    }
}
