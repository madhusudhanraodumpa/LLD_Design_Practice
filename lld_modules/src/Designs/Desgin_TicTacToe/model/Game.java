package Designs.Desgin_TicTacToe.model;

import Designs.Desgin_TicTacToe.strategies.gamewinningstrategy.GameWinningStrategy;
import Designs.Desgin_TicTacToe.strategies.gamewinningstrategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList;
    private Board board;
    private GameStatus gameStatus;

    private List<Move> moveList;
    private int nextPlayerIndex;
    private Player winner;

    private GameWinningStrategy gameWinningStrategy;

    public static GameBuilder getGameBuilder() {
        return new GameBuilder();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard() {
        this.board.display();
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public boolean makeNextMove() {
        Player playerToMove = playerList.get(nextPlayerIndex);
        System.out.println("It is " + playerToMove.getName() + "'s turn to play");

        Move move = playerToMove.decideMove(this.board);
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = move.getCell();
        if(board.getBoard().get(row).get(col).getCellStatus().equals(CellStatus.NotAvilable)) {

            return false;
        }

        cell.setPlayer(playerToMove);
        moveList.add(move);

        //Validate move;
        board.getBoard().get(row).get(col).setPlayer(playerToMove);
        board.getBoard().get(row).get(col).setCellStatus(CellStatus.NotAvilable);
        if (gameWinningStrategy.checkWinner(board, playerToMove, cell)) {
            gameStatus = GameStatus.End;
            winner = playerToMove;
        }
        nextPlayerIndex = (nextPlayerIndex+1)%playerList.size();
        return true;
    }

    public void undo(Game game) {

        List<Move> moveList = game.getMoveList();
        Move move = moveList.get(moveList.size()-1);
        Cell cell = move.getCell();
        int row= cell.getRow();
        int col = cell.getCol();
        gameWinningStrategy.undo(board,move.getPlayer(),cell);
        board.getBoard().get(row).get(col).setCellStatus(CellStatus.Avilable);
        board.getBoard().get(row).get(col).setPlayer(null);
        moveList.remove(moveList.size()-1);


    }

    public static class GameBuilder {
        private List<Player> playerList;
        private  int dimension;

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
        public Game build() {
            Game game = new Game();
            if(isValid()) {
                game.setPlayerList(playerList);
                game.setNextPlayerIndex(0);
                game.setGameStatus(GameStatus.InProgres);
                game.setBoard(new Board(dimension));
                game.setMoveList(new ArrayList<>());
                game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));
            }
            return game;

        }
        public void displayBoard(Game game) {
            game.getBoard().display();
        }

        private boolean isValid() {

            if(dimension<3) return false;

            if(playerList.size() != dimension-1) {
                return false;
            }
            return true;
        }
    }
}
