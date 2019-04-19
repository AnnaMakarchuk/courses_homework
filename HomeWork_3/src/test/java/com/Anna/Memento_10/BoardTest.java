package com.Anna.Memento_10;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class BoardTest {

    private Board board;
    private Map<Point, String> gameFieldMap = new HashMap<>();

    @Before
    public  void setUp() {
        board = new Board(gameFieldMap);
        gameFieldMap.put(new Point(1, 1), "x");
        gameFieldMap.put(new Point(1, 2), "x");
        gameFieldMap.put(new Point(2, 1), "x");
    }

    @Test
    public void shouldCheckPointNotMap() {
        boolean result = board.checkPointInMap(1,3);
        assertTrue("this point not new point", result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldCheckPointInMap() {
        board.checkPointInMap(1,1);
    }

    @Test
    public void shouldCheckIfPointPutInMap(){
        board.move(1, 2,2);
        assertThat(gameFieldMap.size(), equalTo(4));
    }

    @Test
    public void shouldPutXForPlayer1(){
        board.move(1, 3,1);
        String result = gameFieldMap.get(new Point(3,1));
        assertThat(result, equalTo("x"));
    }

    @Test
    public void shouldPutOForPlayer2(){
        board.move(2, 3,2);
        String result = gameFieldMap.get(new Point(3,2));
        assertThat(result, equalTo("0"));
    }

    @Test
    public void checkSaveMomento(){
        assertThat(board.save(), instanceOf(Memento.class));
    }

    @Test
    public void checkMementoMap(){
        Memento memento = board.save();
        board.undo(memento);
        Map<Point, String> MementoMap = memento.getGameFieldMap();
        assertThat(MementoMap, equalTo(gameFieldMap));
    }
}