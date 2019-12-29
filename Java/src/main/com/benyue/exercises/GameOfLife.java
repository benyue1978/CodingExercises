package com.benyue.exercises;

public class GameOfLife {
    String currentGrid;

    public GameOfLife(String grid) {
        this.currentGrid = grid;
    }

    public String getNG() {
        String[] lines = currentGrid.split("\n");
        lines[0] = "Generation 2:";
        for (int i = 2; i < lines.length; i++) {
            lines[i] = lines[i].replaceAll("\\*", ".");
        }
        return String.join("\n", lines);
    }
}
