package com.Anna.Prototype_04;

public class PrototypeTest {
    public static void main(String[] args) {
        WikiArticlesService wikiArticlesService = new WikiArticlesService();
        System.out.println("Please distribute copies of all Political articles ");
        System.out.println(wikiArticlesService.createSpecificArticleCopy(ArticleType.POLITIC));
    }
}
