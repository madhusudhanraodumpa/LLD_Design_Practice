package Designs.Design_SnakeAndLadder.model;

public class Cell {
    private int row;
    private int col;
    private Jump jump;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.jump =null;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}
