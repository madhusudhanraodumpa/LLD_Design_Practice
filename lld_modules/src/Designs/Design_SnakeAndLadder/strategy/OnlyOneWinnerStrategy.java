package Designs.Design_SnakeAndLadder.strategy;

import Designs.Design_SnakeAndLadder.model.Game;
import Designs.Design_SnakeAndLadder.model.GameStatus;
import Designs.Design_SnakeAndLadder.model.Player;

import java.util.List;
import java.util.Queue;

public class OnlyOneWinnerStrategy implements GameWinningStrategy{
    @Override
    public void checkWinner(int playerNewPosition, int dimension, Queue<Player> winner, Player playerTurn, Game game, List<Player> playerList) {
        if(playerNewPosition == dimension *dimension){
            winner.offer(playerTurn);
            game.setGameStatus(GameStatus.End);
        }
    }


}
