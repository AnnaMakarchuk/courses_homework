package com.Anna.AbstractFactory_03;

import com.Anna.AbstractFactory_03.models.*;

public class UkrainianFilmDistributionFactory implements FilmDistributionFactory {
    public Language setLanguage() {
        System.out.println("Film in ukrainian");
        return new UkrainianLanguage();
    }

    public Subtitle setSubtitles() {
        System.out.println("with ukrainian subtitles");
        return new UkrainianSubtitle();
    }
}
