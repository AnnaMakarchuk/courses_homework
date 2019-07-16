package com.Anna.Prototype_04;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class WikiArticlesServiceTest {

    private WikiArticlesService service;

    private Articles wikiArticle;

    private List<Articles> wikiArticlesList = new ArrayList<>();

    private List<Articles> copyList = new ArrayList<>();

    @Before
    public void setUp(){
        service = new WikiArticlesService();
        wikiArticle = new WikiArticles("politicalSituationUkraine", ArticleType.POLITIC);
        wikiArticlesList.add(wikiArticle);
    }

    @Test
    public void shouldReturnEqualCopy() {
        ArticleType type = ArticleType.POLITIC;
        copyList = service.createSpecificArticleCopy(type);
        Articles copy = copyList.get(0);
        assertThat(copy, instanceOf(WikiArticles.class));
        String copyName = copy.getName();
        ArticleType typeClone = copy.getArticleType();
        assertThat(typeClone, equalTo(wikiArticle.getArticleType()));
    }
}