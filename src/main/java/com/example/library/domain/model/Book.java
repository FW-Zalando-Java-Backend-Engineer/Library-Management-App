package com.example.library.domain.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
// In Spring Boot:
// jakarta.validation.*: this is a package from Oracle, we used the dependency to access it.

/**
 * Core domain entity representing a Book.
 */
public class Book {
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, message = "Title must have at least 2 characters")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;
}
