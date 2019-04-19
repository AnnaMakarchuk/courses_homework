package com.Anna.AbstractFactory_03;

import com.Anna.AbstractFactory_03.models.FilmDistribution;
import com.Anna.AbstractFactory_03.models.Language;
import com.Anna.AbstractFactory_03.models.Subtitle;

public class AbstractFactory {

    public static void main(String[] args) {
        AbstractFactory.createFilmDistribution("english");
    }

    public static void createFilmDistribution(String type) {
        FilmDistributionFactory factory = AbstractFactory.getFilmDistributionFactory(type);
        Language language = factory.setLanguage();
        Subtitle subtitle = factory.setSubtitles();
        new FilmDistribution(language, subtitle);
    }

    public static FilmDistributionFactory getFilmDistributionFactory(DistributionType type) {
        switch (type) {
            case UKRAINIAN:
                return new UkrainianFilmDistributionFactory();
            case ENGLISH:
                return new EnglishFilmDistributionFactory();
            case RUSSIAN:
                return new RussianFilmDistributionFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static FilmDistributionFactory getFilmDistributionFactory(String type) {
        return AbstractFactory.getFilmDistributionFactory(DistributionType.valueOf(type.toUpperCase()));
    }


}
