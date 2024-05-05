package ru.matveyakulo.booksearcher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.matveyakulo.booksearcher.entity.Article;
import ru.matveyakulo.booksearcher.entity.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
