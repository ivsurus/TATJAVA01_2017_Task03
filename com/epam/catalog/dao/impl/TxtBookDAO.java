package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.database.DataBaseWriter;




public class TxtBookDAO implements BookDAO{

    DataBaseWriter dbWriter = DataBaseWriter.getInstance();


    @Override
    public void addBook(Book book) {
      dbWriter.writeToDB("!b" + book.getTitle() + book.getAuthor() + book.getYear()+"\n");
        System.out.println(1);
    }

    @Override
    public void findBook(Book book) {

    }
}
