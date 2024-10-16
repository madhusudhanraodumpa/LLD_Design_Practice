package Designs.Desgin_TicTacToe.strategies.botplayingstrategy;

import Designs.Desgin_TicTacToe.model.Board;
import Designs.Desgin_TicTacToe.model.Bot;
import Designs.Desgin_TicTacToe.model.Move;

public interface BotPlayingStrategy {
    Move decideMove(Bot bot, Board board);
}
