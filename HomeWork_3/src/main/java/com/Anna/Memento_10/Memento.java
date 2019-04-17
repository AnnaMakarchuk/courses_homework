package com.Anna.Memento_10;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private Map<Point, String> gameFieldMap;

    public Memento(Map<Point, String> gameFieldMap) {
        this.gameFieldMap = new HashMap<>(gameFieldMap);
        System.out.println("Movements:" + gameFieldMap.toString());
    }

    public Map<Point, String> getGameFieldMap() {
        return gameFieldMap;
    }
}
