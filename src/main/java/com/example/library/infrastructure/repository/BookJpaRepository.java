package com.example.library.infrastructure.repository;

import com.example.library.infrastructure.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * You need BookJpaRepository to talk to the database.
 * it is your adapter that connects Spring Data JPA to your own domain model and service logic.
 * */

@Repository // Marks this interface as Spring managed bean.
public interface BookJpaRepository extends JpaRepository<BookEntity, Long>{
}
