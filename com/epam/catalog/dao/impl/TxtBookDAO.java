package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;


public class TxtBookDAO implements BookDAO{

    //здесь реализуется сама запись книги в файл
    @Override
    public void addBook(Book book) {
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book.getTitle());
    }

    @Override
    public void findBook(Book book) {

    }
}
