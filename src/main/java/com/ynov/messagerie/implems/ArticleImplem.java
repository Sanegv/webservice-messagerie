package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Article;
import com.ynov.messagerie.repos.ArticleRepo;
import com.ynov.messagerie.services.ArticleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleImplem implements ArticleServices {
    @Autowired
    private ArticleRepo articleRepo;

    @Override
    public Article createArticle(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }
}
