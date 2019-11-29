package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScoreTest {

    private String result = "";
    private final TennisScore tennisScore = new TennisScore();

    @Test
    public void testLoveAll() {
        result = tennisScore.getResult(0, 0, 0);
        assertEquals("love all", result);

    }

    @Test
    public void testFifteenLove() {
        result = tennisScore.getResult(15, 0, 0);
        assertEquals("fifteen love", result);
    }

    @Test
    public void testFifteenAll() {
        result = tennisScore.getResult(15, 15, 0);
        assertEquals("fifteen all", result);
    }

    @Test
    public void testThirtyLove() {
        result = tennisScore.getResult(30, 0, 0);
        assertEquals("thirty love", result);
    }

    @Test
    public void testFortyLove() {
        result = tennisScore.getResult(40, 0, 0);
        assertEquals("forty love", result);
    }

    @Test
    public void testDeuce() {
        result = tennisScore.getResult(40, 40, 0);
        assertEquals("deuce", result);
    }

    @Test
    public void benAdvanced() {
        result = tennisScore.getResult(40, 40, 1);
        assertEquals("Ben advanced", result);
    }

    @Test
    public void ritaWin() {
        result = tennisScore.getResult(40, 40, -2);
        assertEquals("Rita win", result);
    }

    @Test
    public void ritaAdvanced() {
        result = tennisScore.getResult(40, 40, -1);
        assertEquals("Rita advanced", result);
    }

    @Test
    public void benWin() {
        result = tennisScore.getResult(40, 40, 2);
        assertEquals("Ben win", result);
    }
}