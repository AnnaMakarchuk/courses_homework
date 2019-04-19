package com.Anna.Prototype_04;

import java.util.ArrayList;
import java.util.List;

public class WikiArticlesService {

    public List<Articles> createSpecificArticleCopy(ArticleType type) {
        List<Articles> wikiArticlesList = WikiArticlesService.createArticlesList();
        List<Articles> copyArticlesList = new ArrayList<>();
        for (Articles article : wikiArticlesList) {
            if (article.getArticleType() == type) {
                copyArticlesList.add(article.clone());
            }
        }
        return copyArticlesList;
    }

    public static List<Articles> createArticlesList() {
        List<Articles> wikiArticlesList = new ArrayList<>();
        wikiArticlesList.add(new WikiArticles("politicalSituationUkraine", ArticleType.POLITIC));
        wikiArticlesList.add(new WikiArticles("WorldClimate", ArticleType.CLIMATE));
        wikiArticlesList.add(new WikiArticles("JAVA", ArticleType.SCIENCE));
        wikiArticlesList.add(new WikiArticles("Most beatiful places", ArticleType.ARHITECHTURE));
        wikiArticlesList.add(new WikiArticles("politicalCrisises", ArticleType.POLITIC));
        wikiArticlesList.add(new WikiArticles("Secrets", ArticleType.CULTURE));
        return wikiArticlesList;
    }
}
