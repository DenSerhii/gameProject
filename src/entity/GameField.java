package entity;

import island.Cell;

public class GameField {
    private int width;
    private int height;
    private Cell[][] cells = new Cell[width][height];

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
