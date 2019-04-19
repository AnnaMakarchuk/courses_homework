package com.Anna.Flyweight_11;

import java.util.HashMap;
import java.util.Map;

public class BacteriaFactory {

    private static Map<BacteriaType, Bacteria> bacteriaMap = new HashMap<>();

    public Bacteria createBacteria(BacteriaType bacteriaType) {
        Bacteria bacteria = bacteriaMap.get(bacteriaType);
        if (bacteria == null) {
            switch (bacteriaType) {
                case VIBRIA:
                    bacteria = new Bacteria("vibria", BacteriaColor.RED);
                    break;
                case TREPOMENA:
                    bacteria = new Bacteria("trepomena", BacteriaColor.BORDO);
                    break;
                case HELICOBACTER:
                    bacteria = new Bacteria("helicobacter", BacteriaColor.VIOLET);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            bacteriaMap.put(bacteriaType, bacteria);
        }
        return bacteria;
    }
}
