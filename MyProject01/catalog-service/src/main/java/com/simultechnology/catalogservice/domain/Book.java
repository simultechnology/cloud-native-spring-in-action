package com.simultechnology.catalogservice.domain;

public record Book(
    String isbn,
    String title,
    String author,
    Double price,
    String language
) {}
