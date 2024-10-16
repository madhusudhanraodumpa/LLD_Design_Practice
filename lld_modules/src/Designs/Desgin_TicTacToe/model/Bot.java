package Designs.Desgin_TicTacToe.model;

import Designs.Desgin_TicTacToe.factory.GetBotStrategyFactory;
import Designs.Desgin_TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;

import java.util.Scanner;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(name,symbol,playerType);
        this.botDifficultyLevel =botDifficultyLevel;
        this.botPlayingStrategy = GetBotStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public Move decideMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        return botPlayingStrategy.decideMove(this,board);

    }
}
