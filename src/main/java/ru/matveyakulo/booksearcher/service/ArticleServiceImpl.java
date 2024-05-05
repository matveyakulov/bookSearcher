package ru.matveyakulo.booksearcher.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.matveyakulo.booksearcher.entity.Article;
import ru.matveyakulo.booksearcher.repository.ArticleRepository;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Transactional
    @Override
    public Article findByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Transactional
    @Override
    public void dropOldest() {
        articleRepository.dropOldest();
    }
}
