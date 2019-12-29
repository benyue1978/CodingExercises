package com.benyue.exercises;

public class GameOfLife {
    String currentGrid;

    public GameOfLife(String grid) {
        this.currentGrid = grid;
    }

    public String getNG() {
        String[] lines = currentGrid.split("\n");
        lines[0] = "Generation 2:";
        lines[2] = lines[2].replaceAll("\\*", ".");
        return String.join("\n", lines);
    }
}
