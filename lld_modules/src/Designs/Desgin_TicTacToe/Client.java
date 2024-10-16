package Designs.Desgin_TicTacToe;

import Designs.Desgin_TicTacToe.controller.GameController;
import Designs.Desgin_TicTacToe.excpetions.InvalidGameBuildException;
import Designs.Desgin_TicTacToe.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InvalidGameBuildException {

        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("What is the dimension of the game");
        int dimension = scanner.nextInt();

        System.out.println("Do you want to have a bot in the game ? y/n");
        String isBot = scanner.next();
        List<Player> players = new ArrayList<>();

        int numberOfPlayer = dimension - 1;
        if (isBot.charAt(0) == 'y') {
            numberOfPlayer = dimension - 2;
        }

        for (int i=0;i<numberOfPlayer;i++ ){
            System.out.println("What is the name of the player :");
            String name = scanner.next();

            System.out.println("What is the symbol of the player :");
            String symbol = scanner.next();

            players.add(new Player(name, symbol.charAt(0), PlayerType.HUMAN));

        }

        if (isBot.charAt(0) == 'y') {
            System.out.println("What is the name of the bot :");
            String name = scanner.next();

            System.out.println("What is the symbol of the bot :");
            String symbol = scanner.next();

            players.add(new Bot(name, symbol.charAt(0), PlayerType.BOT, BotDifficultyLevel.EASY));
        }

        Game game = gameController.createGame(dimension, players);

        while (game.getGameStatus().equals(GameStatus.InProgres)) {

            System.out.println("This is the current board:");
            gameController.displayBoard(game);

            System.out.println("Do you want to undo ? y/n");
            String input = scanner.next();

            if (input.equals("y")) {
                gameController.undo(game);
            } else {
                if (!gameController.executeNextMove(game)) {
                    System.out.println(" The move is already occupied please re-try.");
                }
            }
        }
        System.out.println("Game has ended, Result is: ");
        if (game.getGameStatus().equals(GameStatus.End)) {
            System.out.println("Winner is : " + gameController.getWinner(game).getName());
        }

    }
}
