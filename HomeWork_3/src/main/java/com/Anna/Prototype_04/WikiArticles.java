package com.Anna.Prototype_04;

public class WikiArticles extends Articles {

    public WikiArticles(String name, ArticleType articleType) {
        super(name, articleType);
    }

    @Override
    public WikiArticles clone() {
        return new WikiArticles(super.getName(), super.getArticleType());
    }


}
