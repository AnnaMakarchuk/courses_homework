package com.Anna.Factory_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestFactory {
    public static void main(String[] args) {
        int figureSize = 4;
        System.out.printf("Случайный набор фигур тетриса с размером " + figureSize);
        FigureFactory factory = new FigureFactory();
        List<Figure> randomist = getRandom(factory.createFigureList(figureSize));
        System.out.println(randomist);
    }

    public static List<Figure> getRandom(List<Figure> list) {
        List <Figure> randomList = new ArrayList<>();

        Random randomGenerator = new Random();
        int randomListSize = randomGenerator.nextInt(list.size());

        for (int i = 0; i < randomListSize; i++) {
            int index = randomGenerator.nextInt(list.size());
            Figure figure = list.get(index);
            randomList.add(figure);
        }
        return randomList;
    }
}
