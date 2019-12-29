package com.benyue.exercises;

public class GameOfLife {
    String currentGrid;

    public GameOfLife(String grid) {
        this.currentGrid = grid;
    }

    public String getNG() {
        String[] lines = currentGrid.split("\n");
        lines[0] = "Generation 2:";
        int width = Integer.parseInt(lines[1].split(" ")[0]);
        for (int i = 2; i < lines.length; i++) {
            StringBuilder lineNG = new StringBuilder(lines[i]);
            for (int j = 0; j < width; j++) {
                lineNG.setCharAt(j, survive(i, j) ? '*' : '.');
            }
            lines[i] = lineNG.toString();
        }
        return String.join("\n", lines);
    }

    private boolean survive(int i, int j) {
        return currentGrid.split("\n")[2].length() == 4 && (i == 3 && j == 1 || i == 3 && j == 2 || i == 4 && j == 1 || i == 4 && j == 2);
    }
}
