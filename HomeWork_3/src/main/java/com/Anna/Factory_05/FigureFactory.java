package com.Anna.Factory_05;

import java.util.List;

public class FigureFactory {
    public List<Figure> createFigureList (int figureSize) {
        if (figureSize == 4) {
            return new UsualFigureCreator().createFigures();
        } else if (figureSize !=4 ){
            return new NotStandartFigureCreator().createFigures();
        } else throw new IllegalArgumentException();
    }
}
