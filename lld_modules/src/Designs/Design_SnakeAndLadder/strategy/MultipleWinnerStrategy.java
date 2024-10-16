package Designs.Design_SnakeAndLadder.strategy;

import Designs.Design_SnakeAndLadder.model.Game;
import Designs.Design_SnakeAndLadder.model.GameStatus;
import Designs.Design_SnakeAndLadder.model.Player;

import java.util.List;
import java.util.Queue;

public class MultipleWinnerStrategy implements GameWinningStrategy{
    private int playerSize;

    public MultipleWinnerStrategy(int playerSize) {
        this.playerSize = playerSize;
    }

    @Override
    public void checkWinner(int playerNewPosition, int dimension, Queue<Player> winner, Player playerTurn, Game game, List<Player> playerList) {
        if(playerNewPosition == dimension *dimension){
            winner.offer(playerTurn);
            playerList.remove(playerTurn);
            if (winner.size()==playerSize-1) {
                game.setGameStatus(GameStatus.End);
            }

        }
    }
}
