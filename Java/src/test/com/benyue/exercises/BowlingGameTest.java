package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void AllZeroTest(){
        BowlingGame game = new BowlingGame("-- -- -- -- -- -- -- -- -- --");
        assertEquals(0, game.getScore());
    }

    @Test
    public void AllNumbersTest() {
        BowlingGame game = new BowlingGame("11 22 33 44 11 22 33 44 11 22");
        assertEquals(46, game.getScore());
    }
}
