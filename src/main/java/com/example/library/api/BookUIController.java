package com.example.library.api;

import com.example.library.domain.model.Book;
import com.example.library.domain.port.BookService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ui/books")
public class BookUIController {

    private final BookService service;

    public BookUIController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "index";
    }

    @PostMapping
    public String submitForm(@ModelAttribute @Valid Book book) {
        service.addBook(book);
        return "redirect:/ui/books";
    }
}
