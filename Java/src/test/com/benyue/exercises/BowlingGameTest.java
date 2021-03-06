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

    @Test
    public void strikeStrikeTest() {
        BowlingGame game = new BowlingGame("x x 12 1- 1- 1- 1- 1- 1- 1-");
        assertEquals(44, game.getScore());
    }

    @Test
    public void strikeStrikeStrikeTest() {
        BowlingGame game = new BowlingGame("x x x 12 1- 1- 1- 1- 1- 1-");
        assertEquals(73, game.getScore());
    }

    @Test
    public void spareInFrameTenTest() {
        BowlingGame game = new BowlingGame("1- 1- 1- 1- 1- 1- 1- 1- 1- 1/2");
        assertEquals(21, game.getScore());
    }

    @Test
    public void strikeInFrameTenTest() {
        BowlingGame game = new BowlingGame("1- 1- 1- 1- 1- 1- 1- 1- 1- x12");
        assertEquals(22, game.getScore());
    }

    @Test
    public void strikeStrikeInFrameTenTest() {
        BowlingGame game = new BowlingGame("1- 1- 1- 1- 1- 1- 1- 1- 1- xx2");
        assertEquals(31, game.getScore());
    }

    @Test
    public void allStrikeTest() {
        BowlingGame game = new BowlingGame("x x x x x x x x x xxx");
        assertEquals(300, game.getScore());
    }
}
