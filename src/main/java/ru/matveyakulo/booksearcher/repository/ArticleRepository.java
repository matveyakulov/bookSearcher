package ru.matveyakulo.booksearcher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.matveyakulo.booksearcher.entity.Article;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("""
            SELECT a FROM Article a
            WHERE a.title = :title
            """)
    Article findByTitle(@Param("title") String title);

    @Query("""
            SELECT a FROM Article a
            """)
    List<Article> findAll();
}
