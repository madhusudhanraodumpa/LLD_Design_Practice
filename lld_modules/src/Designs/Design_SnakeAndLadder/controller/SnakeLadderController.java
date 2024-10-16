package Designs.Design_SnakeAndLadder.controller;

import Designs.Design_SnakeAndLadder.model.Game;
import Designs.Design_SnakeAndLadder.model.Player;

import java.util.List;

public class SnakeLadderController {

    public Game createGame(int dimension, List<Player> playerList,int numberOfSnakes,int numberOfLadder) {

        return Game.getGameBuilder().setDimension(dimension)
                .setPlayerList(playerList).setNumberOfSnakes(numberOfSnakes).setNumberOfLadder(numberOfLadder).build();
    }
    public void startGame(Game game) {
        game.startGame();

    }
}
