package com.benyue.exercises;

public class GameOfLife {
    GameOfLifeGrid currentGrid;

    public GameOfLife(String grid) {
        this.currentGrid = new GameOfLifeGrid(grid);
    }

    private boolean isSurvived(int i, int j) {
        int neighbourCount = currentGrid.getNeighbourCount(i, j);
        return currentGrid.isLife(i, j) && neighbourCount == 2 || neighbourCount == 3;
    }

    public String getNG() {
        String[] lines = currentGrid.getLines();
        lines[0] = "Generation 2:";
        int width = currentGrid.getWidth();
        for (int j = 2; j < lines.length; j++) {
            StringBuilder lineNG = new StringBuilder(lines[j]);
            for (int i = 0; i < width; i++) {
                lineNG.setCharAt(i, isSurvived(i, j - 2) ? '*' : '.');
            }
            lines[j] = lineNG.toString();
        }
        return String.join("\n", lines);
    }
}
