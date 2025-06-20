package com.example.library.api;

import com.example.library.domain.model.Book;
import com.example.library.domain.port.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // @Controller + @ResponseBody -> every method returns JSON
@RequestMapping("/api/books") // base path for all endpoints (e.g. /api/books)
public class BookController {

    private final BookService service;

    public BookController ( BookService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody @Valid Book book){
       return new ResponseEntity<>(service.addBook(book), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

}
