package com.Anna.AbstractFactory_03.models;


public class FilmDistribution {
    private Language language;
    private Subtitle subtitle;

    public FilmDistribution(Language language, Subtitle subtitle) {
        this.language = language;
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return "FilmDistribution{" +
                "language=" + language +
                ", subtitle=" + subtitle +
                '}';
    }
}
