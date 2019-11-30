package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void allZeroTest() {
        BowlingGame game = new BowlingGame("-- -- -- -- -- -- -- -- -- --");
        assertEquals(0, game.getScore());
    }

    @Test
    public void allNumbersTest() {
        BowlingGame game = new BowlingGame("11 22 33 44 11 22 33 44 11 22");
        assertEquals(46, game.getScore());
    }

    @Test
    public void numberWithTrailingMissTest() {
        BowlingGame game = new BowlingGame("1- 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(10, game.getScore());
    }

    @Test
    public void numberWithLeadingMissTest() {
        BowlingGame game = new BowlingGame("-2 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(11, game.getScore());
    }

    @Test
    public void spareOneMissTest() {
        BowlingGame game = new BowlingGame("1/ 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(20, game.getScore());
    }

    @Test
    public void spareOneTwoTest() {
        BowlingGame game = new BowlingGame("1/ 12 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(22, game.getScore());
    }

    @Test
    public void spareSpareTest() {
        BowlingGame game = new BowlingGame("1/ 1/ 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(30, game.getScore());
    }

    @Test
    public void strikeOneMissTest() {
        BowlingGame game = new BowlingGame("x 1- 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(20, game.getScore());
    }

    @Test
    public void strikeOneTwoTest() {
        BowlingGame game = new BowlingGame("x 12 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(24, game.getScore());
    }

    @Test
    public void strikeSpareTest() {
        BowlingGame game = new BowlingGame("x 1/ 1- 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(39, game.getScore());
    }

    @Test
    public void spareStrikeTest() {
        BowlingGame game = new BowlingGame("1/ x 12 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(43, game.getScore());
    }
}
