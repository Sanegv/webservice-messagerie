package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Article;
import com.ynov.messagerie.services.ArticleServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleServices articleServices;

    @GetMapping
    @Operation(summary = "get all articles", description = "Returns a list of all the articles in the database")
    public ResponseEntity<List<Article>> getAllArticles(){
        return new ResponseEntity<>(
                articleServices.getAllArticles(),
                HttpStatus.OK
        );
    }

    @PostMapping
    @Operation(summary = "create article", description = "Create a new article in the database")
    public ResponseEntity<Article> createArticle(@RequestBody Article article){
        return new ResponseEntity<>(
                articleServices.createArticle(article),
                HttpStatus.CREATED
        );
    }
}
