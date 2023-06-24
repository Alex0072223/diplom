package com.example.diplom.repositories;

import com.example.diplom.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    //TODO: ROAD TO REST
    List<Book> findByTitleStartingWith(String title);
}
