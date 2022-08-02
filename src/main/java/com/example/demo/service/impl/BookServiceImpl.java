package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findBookById(Long id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return saveBook(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteBookById(id);
    }
}
