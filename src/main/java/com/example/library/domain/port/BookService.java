package com.example.library.domain.port;

import com.example.library.domain.model.Book;
import java.util.List;

/**
 * Port for book-related operations (Primary Port).
 */
public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
}
