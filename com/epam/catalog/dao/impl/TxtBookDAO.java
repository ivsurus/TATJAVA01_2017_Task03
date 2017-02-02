package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.database.DataBaseFactory;

import java.io.IOException;
import java.io.Writer;


public class TxtBookDAO implements BookDAO{

    DataBaseFactory dbObjectFactory = DataBaseFactory.getInstance();
    Writer writer;

    //здесь реализуется сама запись книги в файл
    @Override
    public void addBook(Book book) {
           try {
           writer = dbObjectFactory.getWriter();
           writer.write("!b" + book.getTitle() + book.getAuthor() + book.getYear()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findBook(Book book) {

    }
}
