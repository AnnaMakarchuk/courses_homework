package com.Anna.Memento_10;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Point point;
    private  Map<Point, String> gameFieldMap;

    public Board () {
        gameFieldMap = new HashMap<>();
    }

    public void move(int playerNumber, int xPoint, int yPoint){
        if (checkPoint(xPoint, yPoint)) {
            point = new Point(xPoint, yPoint);
            switch (playerNumber){
                case 1:
                    gameFieldMap.put(point, "x");
                    break;
                case 2:
                    gameFieldMap.put(point, "0");
                    break;
                default: throw new IllegalArgumentException("only 2 players available");
            }
        }
        System.out.println("Player " + playerNumber + " with move " + xPoint + ", " + yPoint);
    }

    public boolean checkPoint(int x, int y){
        point = new Point(x, y);
        if (!point.checkPoint() && gameFieldMap.containsKey(point)) {
            return false;
        }
        return true;
    }

    public Memento save() {
        System.out.println("We are making snapshot: saving to Memento");
        return new Memento(gameFieldMap);
    }

    public void undo(Memento memento) {
        System.out.println("undo last move");
        gameFieldMap = memento.getGameFieldMap();
    }

    public Map<Point, String> getGameFieldMap() {
        return gameFieldMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board = (Board) o;

        return gameFieldMap != null ? gameFieldMap.equals(board.gameFieldMap) : board.gameFieldMap == null;
    }

    @Override
    public int hashCode() {
        return gameFieldMap != null ? gameFieldMap.hashCode() : 0;
    }
}
