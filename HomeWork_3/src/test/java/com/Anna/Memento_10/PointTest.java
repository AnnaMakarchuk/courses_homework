package com.Anna.Memento_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    private Point point;

    @Test
    public void shouldCheckIncorrectCoordinate(){
        point = new Point(5, 4);
        boolean result = point.checkPoint();
        assertFalse("point is incorrect", result);
    }

    @Test
    public void shouldCheckCorrectCoordinate(){
        point = new Point(2, 1);
        boolean result = point.checkPoint();
        assertTrue("point is correct", result);
    }

}