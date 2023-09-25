package com.simultechnology.catalogservice.persistence;

import com.simultechnology.catalogservice.domain.Book;
import com.simultechnology.catalogservice.domain.BookRepository;

import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.empty();
    }

    @Override
    public boolean existsByIsbn(String isbn) {
        return false;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public void deleteByIsbn(String isbn) {

    }
}
