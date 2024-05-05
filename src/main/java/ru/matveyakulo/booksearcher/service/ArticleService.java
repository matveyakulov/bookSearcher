package ru.matveyakulo.booksearcher.service;

import ru.matveyakulo.booksearcher.entity.Article;

import java.util.List;

public interface ArticleService {

    Article findByTitle(String title);

    List<Article> findAll();
}
