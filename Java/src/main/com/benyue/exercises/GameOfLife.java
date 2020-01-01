package com.benyue.exercises;

import java.util.Arrays;

public class GameOfLife {
    private final int generation;
    private final int width;
    private final int height;
    private final String[] lines;

    public GameOfLife(String grid) {
        String[] allLines = grid.split("\n");
        generation = Integer.parseInt(allLines[0].split("[ :]")[1]);
        width = Integer.parseInt(allLines[1].split(" ")[0]);
        height = Integer.parseInt(allLines[1].split(" ")[1]);
        lines = Arrays.copyOfRange(allLines, 2, allLines.length);
    }

    private GameOfLife(int generation, int width, int height) {
        this.generation = generation;
        this.width = width;
        this.height = height;
        lines = new String[height];
        for (int j = 0; j < height; j++) {
            lines[j] = ".".repeat(width);
        }
    }

    private String getCellAt(int i, int j) {
        if (i < 0 || j < 0 || i >= width || j >= height) {
            return ".";
        }
        return lines[j].substring(i, i + 1);
    }

    private void setCellAt(int i, int j, boolean life) {
        StringBuilder line = new StringBuilder(lines[j]);
        line.setCharAt(i, life ? '*' : '.');
        lines[j] = line.toString();
    }

    private boolean isLife(int i, int j) {
        return getCellAt(i, j).equals("*");
    }

    private int getNeighbourCount(int i, int j) {
        int count = 0;
        if (isLife(i - 1, j - 1)) count++;
        if (isLife(i - 1, j)) count++;
        if (isLife(i - 1, j + 1)) count++;
        if (isLife(i, j - 1)) count++;
        if (isLife(i, j + 1)) count++;
        if (isLife(i + 1, j - 1)) count++;
        if (isLife(i + 1, j)) count++;
        if (isLife(i + 1, j + 1)) count++;
        return count;
    }

    private boolean isSurvived(int i, int j) {
        int neighbourCount = getNeighbourCount(i, j);
        return isLife(i, j) && neighbourCount == 2 || neighbourCount == 3;
    }

    public GameOfLife getNGGrid() {
        GameOfLife NGGrid = new GameOfLife(generation + 1, width, height);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                NGGrid.setCellAt(i, j, isSurvived(i, j));
            }
        }
        return NGGrid;
    }

    @Override
    public String toString() {
        String infoFormat = "Generation %d:\n%d %d\n";
        return String.format(infoFormat, generation, width, height) + String.join("\n", lines);
    }
}
