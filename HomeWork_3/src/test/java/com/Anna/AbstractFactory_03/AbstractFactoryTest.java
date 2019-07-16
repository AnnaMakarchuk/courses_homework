package com.Anna.AbstractFactory_03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceprionWhenIncorrectType(){
        String type = "door";
        AbstractFactory.getFilmDistributionFactory(type);
    }

    @Test
    public void shouldReturnUkrainianDistributionFactory () {
        String type = "ukrainian";
        FilmDistributionFactory factories =
                AbstractFactory.getFilmDistributionFactory(type);
        assertThat (factories, instanceOf(UkrainianFilmDistributionFactory.class));
    }

    @Test
    public void shouldReturnEnglishDistributionFactory () {
        String type = "english";
        FilmDistributionFactory factories =
                AbstractFactory.getFilmDistributionFactory(type);
        assertThat (factories, instanceOf(EnglishFilmDistributionFactory.class));
    }

    @Test
    public void shouldReturnRussianDistributionFactory () {
        String type = "russian";
        FilmDistributionFactory factories =
                AbstractFactory.getFilmDistributionFactory(type);
        assertThat (factories, instanceOf(RussianFilmDistributionFactory.class));
    }
}