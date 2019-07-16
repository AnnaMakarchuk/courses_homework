package com.Anna.AbstractFactory_03;

import com.Anna.AbstractFactory_03.models.*;

public class RussianFilmDistributionFactory implements FilmDistributionFactory {
    public Language setLanguage() {
        System.out.println("Film in russian");
        return new RussianLanguage();
    }

    public Subtitle setSubtitles() {
        System.out.println("with russian subtitles");
        return new RussianSubtitle();
    }
}
