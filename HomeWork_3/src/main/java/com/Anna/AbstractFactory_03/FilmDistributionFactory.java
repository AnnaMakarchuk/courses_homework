package com.Anna.AbstractFactory_03;

import com.Anna.AbstractFactory_03.models.Language;
import com.Anna.AbstractFactory_03.models.Subtitle;

public interface FilmDistributionFactory {

    Language setLanguage ();
    Subtitle setSubtitles();
}
