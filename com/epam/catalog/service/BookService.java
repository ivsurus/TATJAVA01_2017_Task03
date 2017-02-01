package com.epam.catalog.service;

import com.epam.catalog.bean.Book;


public interface BookService {
    void addBook(Book book);
    void findBook(Book book);
}
