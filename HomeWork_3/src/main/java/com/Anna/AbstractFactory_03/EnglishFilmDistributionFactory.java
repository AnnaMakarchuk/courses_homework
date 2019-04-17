package com.Anna.AbstractFactory_03;

import com.Anna.AbstractFactory_03.models.*;

public class EnglishFilmDistributionFactory implements FilmDistributionFactory {
    public Language setLanguage() {
        System.out.println("Film in english");
        return new EnglishLanguage();
    }

    public Subtitle setSubtitles() {
        System.out.println("with english subtitles");
        return new EnglishSubtitle();
    }
}
