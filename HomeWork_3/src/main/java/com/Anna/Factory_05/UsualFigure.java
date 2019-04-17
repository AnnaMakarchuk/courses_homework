package com.Anna.Factory_05;

public class UsualFigure extends Figure {

    private String shape;
    private int size = 4;

    public UsualFigure(Color color, int size, String shape) {
        super(color, size, shape);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "\nUsualFigure{"+ super.toString() +
                '}';
    }
}
