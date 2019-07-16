package com.Anna.Factory_05;

import java.util.ArrayList;
import java.util.List;

public class UsualFigureCreator implements FigureCreator {

    @Override
    public List<Figure> createFigures() {
        List<Figure> figures = new ArrayList<>();
        figures.add(new UsualFigure(Color.RED, 4, "line"));
        figures.add(new UsualFigure(Color.YELLOW, 4, "line"));
        figures.add(new UsualFigure(Color.BLUE, 4, "line"));
        figures.add(new UsualFigure(Color.GREEN, 4, "line"));

        figures.add(new UsualFigure(Color.RED, 4, "square"));
        figures.add(new UsualFigure(Color.YELLOW, 4, "square"));
        figures.add(new UsualFigure(Color.BLUE, 4, "square"));
        figures.add(new UsualFigure(Color.GREEN, 4, "square"));

        figures.add(new UsualFigure(Color.RED, 4, "lShape"));
        figures.add(new UsualFigure(Color.YELLOW, 4, "lShape"));
        figures.add(new UsualFigure(Color.BLUE, 4, "lShape"));
        figures.add(new UsualFigure(Color.GREEN, 4, "lShape"));


        figures.add(new UsualFigure(Color.RED, 4, "tShape"));
        figures.add(new UsualFigure(Color.YELLOW, 4, "tShape"));
        figures.add(new UsualFigure(Color.BLUE, 4, "tShape"));
        figures.add(new UsualFigure(Color.GREEN, 4, "tShape"));

        figures.add(new UsualFigure(Color.RED, 4, "sShape"));
        figures.add(new UsualFigure(Color.YELLOW, 4, "sShape"));
        figures.add(new UsualFigure(Color.BLUE, 4, "sShape"));
        figures.add(new UsualFigure(Color.GREEN, 4, "sShape"));

        return figures;
    }
}
