package Designs.Design_SnakeAndLadder;

import Designs.Design_SnakeAndLadder.controller.SnakeLadderController;
import Designs.Design_SnakeAndLadder.model.Game;
import Designs.Design_SnakeAndLadder.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SnakeLadderController snakeLadderController = new SnakeLadderController();
        System.out.println("What is the dimension of the game");
        int dimension = scanner.nextInt();
        System.out.println("Number of player will play this game.");
        int numberPlayer = scanner.nextInt();
        List<Player> playerList = new ArrayList<>();

        for (int i=0;i<numberPlayer;i++) {
            System.out.println("What is the name of "+(i+1)+" the player :");
            String name = scanner.next();
            Player player = new Player(name);
            playerList.add(player);
        }
        Game game = snakeLadderController.createGame(dimension,playerList,5,5);
        snakeLadderController.startGame(game);
        int winnerSize=1;
        while (!game.getWinner().isEmpty()) {
            System.out.println(winnerSize + " winner is :" + game.getWinner().poll().getName());
            winnerSize++;
        }






    }
}
