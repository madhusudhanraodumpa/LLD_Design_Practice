package Designs.Desgin_TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>();
        for (int i=0;i<dimension;i++){
            this.board.add(new ArrayList<>());
            for (int j=0;j<dimension;j++) {
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }
    public void display() {
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {

                if (this.board.get(i).get(j).getCellStatus().equals(CellStatus.Avilable)) {
                    System.out.printf("|   |");
                } else {
                    System.out.printf("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
                }
            }
            System.out.println("\n");
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
