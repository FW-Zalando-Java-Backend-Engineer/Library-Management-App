package com.example.library.infrastructure.mapper;

import com.example.library.domain.model.Book;
import com.example.library.infrastructure.entity.BookEntity;

public class BookMapper {

    public static BookEntity toEntity(Book book){
        BookEntity entity =  new BookEntity();
        entity.setAuthor(book.getAuthor());
        entity.setTitle(book.getTitle());
        return entity;
    }

    public static Book toModel(BookEntity entity) {
        Book model = new Book();
        model.setAuthor(entity.getAuthor());
        model.setTitle(entity.getTitle());
        model.setId(entity.getId());
        return model;
    }

}
