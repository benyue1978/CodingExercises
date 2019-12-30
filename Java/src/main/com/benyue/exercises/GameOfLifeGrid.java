package com.benyue.exercises;

public class GameOfLifeGrid {

    private final int width;
    private final int height;
    private final String[] lines;

    public GameOfLifeGrid(String grid) {
        lines = grid.split("\n");
        width = Integer.parseInt(lines[1].split(" ")[0]);
        height = Integer.parseInt(lines[1].split(" ")[1]);
    }

    public String[] getLines() {
        return lines;
    }

}
