package com.Anna.Strategy_06;

public class StrategyTest {
    public static void main(String[] args) {
        GameService gameService = new GameService(new CharacterMovement());
        gameService.playing();
    }
}
