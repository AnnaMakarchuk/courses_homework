package com.Anna.Memento_10;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;

    private List<Point> pointList = new ArrayList<>();
    private Point movePoint;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
