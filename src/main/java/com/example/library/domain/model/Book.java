//  Domain Layer (Core Logic - innermost)
package com.example.library.domain.model;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
// Developer tool:
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// In Spring Boot:
// jakarta.validation.*: this is a package from Oracle, we used the dependency to access it.

/**
 * Core domain entity representing a Book.
 */

@Data // generates getters, setters, toString, equals and hashCode
@NoArgsConstructor // required by JPA
@AllArgsConstructor // optional, but useful

public class Book {
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, message = "Title must have at least 2 characters")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;
}
