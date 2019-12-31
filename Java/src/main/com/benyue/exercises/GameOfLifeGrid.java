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
        return lines.clone();
    }

    public int getWidth() {
        return width;
    }

    private String getCellAt(int i, int j) {
        if (i < 0 || j < 0 || i >= width || j >= height) {
            return ".";
        }
        return lines[j + 2].substring(i, i + 1);
    }

    public boolean isLife(int i, int j) {
        return getCellAt(i, j).equals("*");
    }

    public int getNeighbourCount(int i, int j) {
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


}
