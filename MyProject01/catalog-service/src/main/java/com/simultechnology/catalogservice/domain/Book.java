package com.simultechnology.catalogservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public record Book(

        @NotBlank(message = "ISBN is mandatory")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid"
        )
        String isbn,

        @NotBlank(message = "Title is mandatory")
        String title,

        @NotBlank(message = "Author is mandatory")
        String author,

        @NotBlank(message = "Price is mandatory")
        @Positive(message = "Price must be positive")
        Double price,

        String language
) {
        // ファクトリーメソッド
        public static Book createWithDefaultLanguage(String isbn, String title, String author, Double price) {
                return new Book(isbn, title, author, price, "ja");
        }

        public static Book createWithDefaultLanguage(Book book) {
                if (book.language() == null) {
                        return new Book(book.isbn(), book.title(), book.author(), book.price(), "ja");
                }
                return book;
        }
}
