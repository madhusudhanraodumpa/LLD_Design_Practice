package Designs.Desgin_TicTacToe.strategies.gamewinningstrategy;

import Designs.Desgin_TicTacToe.model.Board;
import Designs.Desgin_TicTacToe.model.Cell;
import Designs.Desgin_TicTacToe.model.Player;

public interface GameWinningStrategy {
    public boolean checkWinner(Board board, Player player, Cell cell);
    public boolean undo(Board board, Player player, Cell cell);
}
