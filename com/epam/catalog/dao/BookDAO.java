package com.epam.catalog.dao;


import com.epam.catalog.bean.Book;



public interface BookDAO {
    void addBook(Book book);
    void findBook(Book book);
}
