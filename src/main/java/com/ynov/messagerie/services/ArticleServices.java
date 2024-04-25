package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Article;

import java.util.List;

public interface ArticleServices {
    Article createArticle(Article article);
    List<Article> getAllArticles();

}
