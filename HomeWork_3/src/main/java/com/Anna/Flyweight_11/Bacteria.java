package com.Anna.Flyweight_11;

public class Bacteria {

    private BacteriaColor color;
    private String name;

    public Bacteria(String name, BacteriaColor color) {
        this.name = name;
        this.color = color;
    }

    public BacteriaColor getColor() {
        return color;
    }

    public void setColor(BacteriaColor color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void putInJournal() {
        System.out.println("Bacteria " + name + " color " + color.toString() + " is born");
    }
}
