package Designs.Desgin_TicTacToe.model;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(String name, char symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move decideMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the row: ");
        int row = scanner.nextInt();

        System.out.println("Please enter the col: ");
        int col = scanner.nextInt();
        Cell cell = new Cell(row,col);

        return new Move(this,cell);




    }
}
