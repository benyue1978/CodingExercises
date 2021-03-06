package com.benyue.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    private void testNG(String grid, String gridNG) {
        GameOfLife gol = new GameOfLife(grid);
        assertEquals(gridNG, gol.getNGGrid().toString());
    }

    @Test
    public void blank1x1Grid() {
        String grid = "Generation 1:\n" +
                "1 1\n" +
                ".";
        String gridNG = "Generation 2:\n" +
                "1 1\n" +
                ".";
        testNG(grid, gridNG);
    }


    @Test
    public void life1x1Grid() {
        String grid = "Generation 1:\n" +
                "1 1\n" +
                "*";
        String gridNG = "Generation 2:\n" +
                "1 1\n" +
                ".";
        testNG(grid, gridNG);
    }

    @Test
    public void blank2x1Grid() {
        String grid = "Generation 1:\n" +
                "2 1\n" +
                "..";
        String gridNG = "Generation 2:\n" +
                "2 1\n" +
                "..";
        testNG(grid, gridNG);
    }

    @Test
    public void dead2x2Grid() {
        String grid = "Generation 1:\n" +
                "2 2\n" +
                "..\n" +
                ".*";
        String gridNG = "Generation 2:\n" +
                "2 2\n" +
                "..\n" +
                "..";
        testNG(grid, gridNG);
    }

    @Test
    public void life4x4grid() {
        String grid = "Generation 1:\n" +
                "4 4\n" +
                "....\n" +
                ".**.\n" +
                ".**.\n" +
                "....";
        String gridNG = "Generation 2:\n" +
                "4 4\n" +
                "....\n" +
                ".**.\n" +
                ".**.\n" +
                "....";
        testNG(grid, gridNG);
    }

    @Test
    public void life4x1grid() {
        String grid = "Generation 1:\n" +
                "4 1\n" +
                "****";
        String gridNG = "Generation 2:\n" +
                "4 1\n" +
                ".**.";
        testNG(grid, gridNG);
    }

    @Test
    public void newLife3x3grid() {
        String grid = "Generation 1:\n" +
                "3 3\n" +
                "...\n" +
                "***\n" +
                "...";
        String gridNG = "Generation 2:\n" +
                "3 3\n" +
                ".*.\n" +
                ".*.\n" +
                ".*.";
        testNG(grid, gridNG);
    }

    @Test
    public void dieCrowd3x3grid() {
        String grid = "Generation 1:\n" +
                "3 3\n" +
                "***\n" +
                "***\n" +
                "***";
        String gridNG = "Generation 2:\n" +
                "3 3\n" +
                "*.*\n" +
                "...\n" +
                "*.*";
        testNG(grid, gridNG);
    }
}
