package Designs.Desgin_TicTacToe.strategies.gamewinningstrategy;

import Designs.Desgin_TicTacToe.model.Board;
import Designs.Desgin_TicTacToe.model.Cell;
import Designs.Desgin_TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

    List<Map<Character, Integer>> rowSymbolCounts = new ArrayList<>();
    List<Map<Character, Integer>> colSymbolCounts = new ArrayList<>();
    Map<Character, Integer> topLeftDiagSymbolCounts = new HashMap<>();
    Map<Character, Integer> topRightDiagSymbolCounts = new HashMap<>();
    public OrderOneGameWinningStrategy(int dimension) {
        for (int i=0;i<dimension;i++) {
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }

    }

    @Override
    public boolean checkWinner(Board board, Player player, Cell cell) {
        char symbol = player.getSymbol();
        int row = cell.getRow();
        int col = cell.getCol();
        int dimension = board.getBoard().size();

        if(!rowSymbolCounts.get(row).containsKey(symbol)) {
            rowSymbolCounts.get(row).put(symbol,0);
        }
        rowSymbolCounts.get(row).put(symbol, rowSymbolCounts.get(row).get(symbol) + 1);

        if(!colSymbolCounts.get(col).containsKey(symbol)) {
            colSymbolCounts.get(col).put(symbol,0);
        }
        colSymbolCounts.get(col).put(symbol, colSymbolCounts.get(col).get(symbol) + 1);

        if (row==col && !topLeftDiagSymbolCounts.containsKey(symbol)) {
            topLeftDiagSymbolCounts.put(symbol,0);
        } else if(row==col) {
            topLeftDiagSymbolCounts.put(symbol,topLeftDiagSymbolCounts.get(symbol)+1);
        }

        if (row+col ==dimension-1 && !topRightDiagSymbolCounts.containsKey(symbol)) {
            topRightDiagSymbolCounts.put(symbol,0);
        } else if(row+col ==dimension-1) {
            topRightDiagSymbolCounts.put(symbol,topRightDiagSymbolCounts.get(symbol)+1);
        }

        if(rowSymbolCounts.get(row).get(symbol) == dimension || colSymbolCounts.get(col).get(symbol) == dimension) {
            return true;
        }
        if(row == col && topLeftDiagSymbolCounts.get(symbol) == dimension) {
            return true;
        }
        if(row+col ==dimension-1 && topRightDiagSymbolCounts.get(symbol)==dimension) {
            return true;
        }

        return false;
    }

    @Override
    public boolean undo(Board board, Player player, Cell cell) {
        int row = cell.getRow();
        int col = cell.getCol();;
        char symbol = player.getSymbol();
        int dimension = board.getBoard().size();
        rowSymbolCounts.get(row).put(symbol, rowSymbolCounts.get(row).get(symbol)-1);
        colSymbolCounts.get(col).put(symbol, colSymbolCounts.get(col).get(symbol)-1);

        if(row==col) {
            topLeftDiagSymbolCounts.put(symbol,topLeftDiagSymbolCounts.get(symbol)-1);
        }
        if(row+col ==dimension-1) {
            topRightDiagSymbolCounts.put(symbol,topRightDiagSymbolCounts.get(symbol)-1);
        }
        return true;
    }
}
