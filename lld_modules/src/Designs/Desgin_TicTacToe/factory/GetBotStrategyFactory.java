package Designs.Desgin_TicTacToe.factory;

import Designs.Desgin_TicTacToe.model.BotDifficultyLevel;
import Designs.Desgin_TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;
import Designs.Desgin_TicTacToe.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import Designs.Desgin_TicTacToe.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class GetBotStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        BotPlayingStrategy botPlayingStrategy =null;
        if(!botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            botPlayingStrategy = new RandomBotPlayingStrategy();
        }else {
        botPlayingStrategy = new EasyBotPlayingStrategy();
        }
        return botPlayingStrategy;
    }
}
