package com.Anna.Strategy_06;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    private CharacterMovement movement;
    List<GameCharacters> gameCharactersList = new ArrayList<>();

    public GameService(CharacterMovement movement) {
        this.movement = movement;
    }

    public List<GameCharacters> createGamesCharacters() {
        gameCharactersList.add(new GameCharacters("Elf", CharacterType.WARRIOR));
        gameCharactersList.add(new GameCharacters("Wizzard", CharacterType.MAGE));
        gameCharactersList.add(new GameCharacters("Griffon", CharacterType.FLYING));
        gameCharactersList.add(new GameCharacters("Doctor", CharacterType.PALLADIN));
        gameCharactersList.add(new GameCharacters("Ork", CharacterType.WARRIOR));
        gameCharactersList.add(new GameCharacters("Vampire", CharacterType.MAGE));
        gameCharactersList.add(new GameCharacters("Night bad", CharacterType.FLYING));
        return gameCharactersList;
    }

    public void playing() {
        gameCharactersList = createGamesCharacters();
        for (GameCharacters character : gameCharactersList) {
            System.out.println(character);
            movement.move(character.getCharacterType());
        }
    }

}
