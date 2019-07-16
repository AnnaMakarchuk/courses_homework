package com.Anna.Flyweight_11;

public class Laborotory {

    public static void main(String[] args) {
        BacteriaFactory factory = new BacteriaFactory();
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j <= i; j++) {
                factory.createBacteria(BacteriaType.VIBRIA).putInJournal();
                factory.createBacteria(BacteriaType.HELICOBACTER).putInJournal();
                factory.createBacteria(BacteriaType.TREPOMENA).putInJournal();
            }
        }
    }
}
