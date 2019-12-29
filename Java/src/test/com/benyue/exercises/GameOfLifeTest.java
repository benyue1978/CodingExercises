package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    public void blank1x1Grid() {
        String grid = "Generation 1:\n" +
                "1 1\n" +
                ".";

        String gridNG = "Generation 2:\n" +
                "1 1\n" +
                ".";
        GameOfLife gol = new GameOfLife(grid);

        assertEquals(gridNG, gol.getNG());

    }
}