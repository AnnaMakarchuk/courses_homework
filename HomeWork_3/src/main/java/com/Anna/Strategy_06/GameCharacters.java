package com.Anna.Strategy_06;


public class GameCharacters {
    private CharacterType characterType;
    private String name;

    GameCharacters(String name, CharacterType characterType) {
        this.name = name;
        this.characterType = characterType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nIt's " + name + ", i am a " + characterType.toString().toLowerCase();
    }
}
