package com.epam.catalog.dao;


import com.epam.catalog.bean.Book;

import java.util.Set;


// возможно следует сделать один интерфес Object тк однотипные действия
public interface BookDAO {
    void addBook(Book book);
    Set findBook(Book book);
}
