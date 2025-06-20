package com.example.library.application;

import com.example.library.domain.model.Book;
import com.example.library.domain.port.BookService;
import com.example.library.infrastructure.entity.BookEntity;
import com.example.library.infrastructure.mapper.BookMapper;
import com.example.library.infrastructure.repository.BookJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // registers this with Spring's container
public class BookServiceImpl implements BookService{

    /**
     * private final BookJpaRepository repository;
     *
     * public BookServiceImpl(BookJpaRepository repository){
     *         this.repository = repository;
     *     }
     *
     *     The above is called Constructor Injection (Best Practice)
     *     Spring will inject BookJpaRepository automatically
     * */

    private final BookJpaRepository repository;

    public BookServiceImpl(BookJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public Book addBook(Book book){
        BookEntity entity = repository.save(BookMapper.toEntity(book));
        return BookMapper.toModel(entity);
    }

    @Override
    public List<Book> getAllBooks(){
        return repository.findAll().stream()
                .map(BookMapper::toModel)
                .collect(Collectors.toList());
    }
}
