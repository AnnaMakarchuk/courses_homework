package com.Anna.Memento_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayGame {

    private static Map<Point, String> gameFieldMap = new HashMap<>();
    private static GameService game = new GameService(new Board(gameFieldMap));

    public static void main(String[] args) {
        playGame();
    }

    private static void testMemento() {
        System.out.println("Player 1 move");
        game.gameMove(1, 1, 1);
        game.saveMove();
        System.out.println("***");
        System.out.println("Player 2 move");
        game.gameMove(2, 1, 2);
        game.saveMove();
        System.out.println("***");
        System.out.println("Player 1 move");
        game.gameMove(1, 2, 1);
        game.saveMove();

        System.out.println("***");
        System.out.println("Player 2 move");
        game.gameMove(2, 3, 2);

        System.out.println("***");
        System.out.println("Player 2 decide to change last move");
        game.undoMove();
        System.out.println("Player 2 new move");
        game.gameMove(2, 3, 1);
        game.saveMove();
    }

    private static void playGame() {
        Scanner in = new Scanner(System.in);
        int playerNumber;
        int xPoint;
        int yPoint;
        boolean isFinish = false;
        while (!isFinish) {
            System.out.println("Please enter Player number (1/2)");
            playerNumber = in.nextInt();
            System.out.println("Please enter Player move in next format: x,y ");
            String input = in.next();
            String[] xy = input.split(",");
            xPoint = Integer.parseInt(xy[0]);
            yPoint = Integer.parseInt(xy[1]);
            game.gameMove(playerNumber, xPoint, yPoint);
            isFinish = game.gameCheckout(playerNumber, xPoint, yPoint);
        }
        in.close();
    }
}
