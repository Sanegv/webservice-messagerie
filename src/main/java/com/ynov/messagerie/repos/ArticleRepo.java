package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {
    Article save(Article article);
    List<Article> findAll();
}
