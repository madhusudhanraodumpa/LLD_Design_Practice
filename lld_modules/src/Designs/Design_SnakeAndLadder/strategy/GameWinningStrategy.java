package Designs.Design_SnakeAndLadder.strategy;

import Designs.Design_SnakeAndLadder.model.Game;
import Designs.Design_SnakeAndLadder.model.Player;

import java.util.List;
import java.util.Queue;

public interface GameWinningStrategy {
    void checkWinner(int playerNewPosition, int dimension, Queue<Player> winner, Player player, Game game, List<Player> playerList);
}
