package com.benyue.exercises;

public class GameOfLife {
    GameOfLifeGrid currentGrid;

    public GameOfLife(String grid) {
        this.currentGrid = new GameOfLifeGrid(grid);
    }

    public String getNG() {
        String[] lines = currentGrid.getLines();
        lines[0] = "Generation 2:";
        int width = Integer.parseInt(lines[1].split(" ")[0]);
        for (int i = 2; i < lines.length; i++) {
            StringBuilder lineNG = new StringBuilder(lines[i]);
            for (int j = 0; j < width; j++) {
                lineNG.setCharAt(j, currentGrid.isSurvive(i, j) ? '*' : '.');
            }
            lines[i] = lineNG.toString();
        }
        return String.join("\n", lines);
    }
}
