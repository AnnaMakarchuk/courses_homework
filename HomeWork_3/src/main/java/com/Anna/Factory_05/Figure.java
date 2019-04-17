package com.Anna.Factory_05;

public class Figure {
    private  String shape;
    private Color color;
    private int size;

    public Figure (Color color, int size, String shape) {
        this.color = color;
        this.size = size;
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "shape='" + shape + '\'' +
                ", color=" + color +
                ", size=" + size;
    }
}
