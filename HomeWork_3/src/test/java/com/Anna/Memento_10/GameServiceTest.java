package com.Anna.Memento_10;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.junit.Assert.*;

public class GameServiceTest {

    private GameService gameService;
    private Map<Point, String> gameFieldMap = new HashMap<>();
    private Board board;
    private Memento memento;

    @Before
    public void setUp() {
        board = new Board(gameFieldMap);
        gameFieldMap.put(new Point(1, 1), "x");
        gameFieldMap.put(new Point(1, 2), "x");
        gameFieldMap.put(new Point(2, 1), "x");
        gameService = new GameService(board);
        memento = new Memento(board.getGameFieldMap());
    }

    @Test
    public void shouldCheckMove() {
        gameService.gameMove(1, 3, 1);
        assertThat(gameFieldMap, hasEntry(new Point(3, 1), "x"));
    }

    @Test
    public void shouldCheckVertical() {
        gameFieldMap.put(new Point(1, 3), "x");
        boolean result = gameService.gameCheckout(1, 1, 3);
        assertTrue(result);
    }

    @Test
    public void shouldCheckHorizontal() {
        gameFieldMap.put(new Point(2, 2), "x");
        gameFieldMap.put(new Point(3, 3), "x");
        boolean result = gameService.gameCheckout(1, 3, 3);
        assertTrue(result);
    }

    @Test
    public void shouldCheckDiagonal() {
        gameFieldMap.put(new Point(3, 1), "x");
        boolean result = gameService.gameCheckout(1, 3, 1);
        assertTrue(result);
    }

    @Test
    public void shouldCheckSaveMove() {
        gameService.saveMove();
        assertThat(memento, instanceOf(Memento.class));
    }

    @Test
    public void checkUndoMove() {
        gameService.saveMove();
        gameService.gameMove(2, 3, 3);
        gameService.undoMove();
        gameFieldMap = memento.getGameFieldMap();
        assertThat(gameFieldMap, not(hasEntry(new Point(3, 3), "0")));
    }
}
