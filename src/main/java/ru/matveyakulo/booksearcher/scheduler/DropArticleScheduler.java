package ru.matveyakulo.booksearcher.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.matveyakulo.booksearcher.service.ArticleService;

@EnableScheduling
@Component
public class DropArticleScheduler {

    private final ArticleService articleService;

    public DropArticleScheduler(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Scheduled(fixedRate = 60000)
    public void dropArticle() {
        articleService.dropOldest();
    }
}
