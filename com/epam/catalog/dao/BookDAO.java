package com.epam.catalog.dao;


import com.epam.catalog.bean.Book;


// возможно следует сделать один интерфес Object тк однотипные действия
public interface BookDAO {
    void addBook(Book book);
    void findBook(Book book);
}
