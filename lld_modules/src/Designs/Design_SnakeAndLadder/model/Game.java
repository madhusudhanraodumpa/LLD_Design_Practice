package Designs.Design_SnakeAndLadder.model;

import Designs.Design_SnakeAndLadder.dice.Dice;
import Designs.Design_SnakeAndLadder.dice.RollWithOneDices;
import Designs.Design_SnakeAndLadder.strategy.GameWinningStrategy;
import Designs.Design_SnakeAndLadder.strategy.MultipleWinnerStrategy;
import Designs.Design_SnakeAndLadder.strategy.OnlyOneWinnerStrategy;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private GameStatus gameStatus;
    private Board board;
    private List<Player> playerList;
    private Dice dice;
    private int nextPlayerIndex;
    private int dimension;
    private Queue<Player> winner;



    private int numberOfSnakes;
    private int numberOfLadder;

    public int getNumberOfSnakes() {
        return numberOfSnakes;
    }

    public void setNumberOfSnakes(int numberOfSnakes) {
        this.numberOfSnakes = numberOfSnakes;
    }

    public int getNumberOfLadder() {
        return numberOfLadder;
    }

    public void setNumberOfLadder(int numberOfLadder) {
        this.numberOfLadder = numberOfLadder;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    private GameWinningStrategy gameWinningStrategy;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Queue<Player> getWinner() {
        return winner;
    }

    public void setWinner(Queue<Player> winner) {
        this.winner = winner;
    }


    public static GameBuilder getGameBuilder() {
       return new GameBuilder();
   }



    public void startGame(){

        while(this.getGameStatus().equals(GameStatus.InProgress)) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.getName() + " current position is: " + playerTurn.getCurrentPosition());

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPosition = playerTurn.getCurrentPosition()+ diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            if(playerNewPosition>dimension*dimension) {
                nextPlayerIndex = (nextPlayerIndex+1)%playerList.size();
                continue;
            }
            playerTurn.setCurrentPosition(playerNewPosition);

            System.out.println("player turn is:" + playerTurn.getName()+ " new Position is: " + playerNewPosition);
            //check for winning condition
            gameWinningStrategy.checkWinner(playerNewPosition,dimension,winner,playerTurn,this,playerList);
            nextPlayerIndex = (nextPlayerIndex+1)%playerList.size();


        }

        System.out.println("WINNER IS:" +winner.peek().getName());
    }

    private int jumpCheck(int playerNewPosition) {
        if(playerNewPosition>(dimension*dimension)-1) {
            return playerNewPosition;
        }
        Cell cell = this.board.cellsList.get((int)playerNewPosition/dimension).get(playerNewPosition%dimension);

        if(cell.getJump() !=null && cell.getJump().getStart()==playerNewPosition) {
            if(cell.getJump().getJumpType().equals(JumpType.SNAKE)) {
                System.out.println("Ohh you got snake: ");
            }else {
                System.out.println("Wow you got ladder:");
            }
            playerNewPosition = cell.getJump().getEnd();


        }
        return playerNewPosition;

    }

    private Player findPlayerTurn() {
        Player player = playerList.get(nextPlayerIndex);
        return player;

    }


    public static class GameBuilder {
       private List<Player> playerList;
       private int dimension;

       private int numberOfSnakes;

       private int numberOfLadder;

       public List<Player> getPlayerList() {
           return playerList;
       }

       public GameBuilder setPlayerList(List<Player> playerList) {
           this.playerList = playerList;
           return this;
       }

       public int getDimension() {
           return dimension;
       }

       public GameBuilder setDimension(int dimension) {
           this.dimension = dimension;
           return this;
       }

       public int getNumberOfSnakes() {
           return numberOfSnakes;
       }

       public GameBuilder setNumberOfSnakes(int numberOfSnakes) {
           this.numberOfSnakes = numberOfSnakes;
           return this;
       }

       public int getNumberOfLadder() {
           return numberOfLadder;
       }

       public GameBuilder setNumberOfLadder(int numberOfLadder) {
           this.numberOfLadder = numberOfLadder;
           return this;
       }

       public Game build() {
           Game game = new Game();
           if (isValid()) {
               game.setGameStatus(GameStatus.InProgress);
               game.setPlayerList(playerList);
               game.setBoard(new Board(dimension,numberOfSnakes,numberOfLadder));
               game.setDimension(dimension);
               game.setDice(new RollWithOneDices());
               game.setNextPlayerIndex(0);
               game.setWinner(new LinkedList<>());
               game.setNumberOfSnakes(numberOfSnakes);
               game.setNumberOfLadder(numberOfLadder);
               game.setNextPlayerIndex(0);
               game.setGameWinningStrategy(new MultipleWinnerStrategy(playerList.size()));


           }
           return game;


       }

       private boolean isValid() {

           if(dimension<6) return false;

           if(playerList !=null && playerList.size() >dimension) {
               return false;
           }
           if (playerList !=null && playerList.size()<2) return false;
           if(numberOfSnakes<1) return false;
           if(numberOfLadder<1) return false;

           return true;
       }
   }

}
