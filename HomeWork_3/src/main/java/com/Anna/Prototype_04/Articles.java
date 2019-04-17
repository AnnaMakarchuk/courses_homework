package com.Anna.Prototype_04;

public abstract class Articles {
    private ArticleType articleType;
    private String name;

    public Articles(String name, ArticleType articleType) {
        this.name = name;
        this.articleType = articleType;
    }

    public abstract Articles clone();

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articles)) return false;

        Articles articles = (Articles) o;

        if (articleType != articles.articleType) return false;
        return name != null ? name.equals(articles.name) : articles.name == null;
    }

    @Override
    public int hashCode() {
        int result = articleType != null ? articleType.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nArticles{" +
                "articleType=" + articleType +
                ", name='" + name + '\'' +
                '}';
    }
}
