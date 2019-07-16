package com.Anna.Flyweight_11;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class BacteriaFactoryTest {

    private Map<BacteriaType, Bacteria> bacteriaMap;
    private BacteriaFactory bacteriaFactory;

    @Before
    public void setUp() {
        bacteriaFactory = new BacteriaFactory();
        bacteriaMap = new HashMap<>();
    }

    @Test
    public void shouldCreateBacteriaMap() {
        bacteriaMap.put(BacteriaType.HELICOBACTER, bacteriaFactory.createBacteria(BacteriaType.HELICOBACTER));
        bacteriaMap.put(BacteriaType.VIBRIA, bacteriaFactory.createBacteria(BacteriaType.VIBRIA));
        bacteriaMap.put(BacteriaType.TREPOMENA, bacteriaFactory.createBacteria(BacteriaType.TREPOMENA));
        bacteriaMap.put(BacteriaType.VIBRIA, bacteriaFactory.createBacteria(BacteriaType.VIBRIA));
        assertThat (bacteriaMap.size(), equalTo(3));
    }

    @Test
    public void shouldCheckDuplicateInMap() {
        bacteriaMap.put(BacteriaType.HELICOBACTER, bacteriaFactory.createBacteria(BacteriaType.HELICOBACTER));
        bacteriaMap.put(BacteriaType.HELICOBACTER, bacteriaFactory.createBacteria(BacteriaType.HELICOBACTER));
        bacteriaMap.put(BacteriaType.HELICOBACTER, bacteriaFactory.createBacteria(BacteriaType.HELICOBACTER));
        bacteriaMap.put(BacteriaType.VIBRIA, bacteriaFactory.createBacteria(BacteriaType.VIBRIA));
        assertThat (bacteriaMap.size(), equalTo(2));
    }

}
