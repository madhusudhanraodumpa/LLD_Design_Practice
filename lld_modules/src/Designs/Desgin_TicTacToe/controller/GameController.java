package Designs.Desgin_TicTacToe.controller;

import Designs.Desgin_TicTacToe.excpetions.InvalidGameBuildException;
import Designs.Desgin_TicTacToe.model.Game;
import Designs.Desgin_TicTacToe.model.GameStatus;
import Designs.Desgin_TicTacToe.model.Player;

import java.util.List;

public class GameController {

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public Game createGame(int dimension, List<Player> players) throws InvalidGameBuildException {
        Game game = Game.getGameBuilder().setPlayerList(players).setDimension(dimension)
                .build();

        return game;
    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public boolean executeNextMove(Game game) {

        return game.makeNextMove();
    }

    public void undo(Game game) {
        game.undo(game);
    }
}
