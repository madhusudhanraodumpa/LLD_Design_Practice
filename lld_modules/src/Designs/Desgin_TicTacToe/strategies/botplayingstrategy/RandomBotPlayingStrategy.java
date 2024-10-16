package Designs.Desgin_TicTacToe.strategies.botplayingstrategy;

import Designs.Desgin_TicTacToe.model.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move decideMove(Bot bot, Board board) {
        for (int i = 0; i < board.getBoard().size(); i++) {
            for (int j = 0; j < board.getBoard().size(); j++) {
                if (board.getBoard().get(i).get(j).getCellStatus().equals(CellStatus.Avilable)) {
                    return new Move(bot, new Cell(i, j));
                }
            }
        }
        return null;
    }
}
