package com.epam.catalog.service;

import com.epam.catalog.bean.Book;

import java.util.Set;


public interface BookService {
    void addBook(Book book);
    Set<Book> findBook(String searchCriterion);
}
