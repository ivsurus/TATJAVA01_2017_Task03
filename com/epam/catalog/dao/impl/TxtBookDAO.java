package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.database.DataBaseTools;




public class TxtBookDAO implements BookDAO{

    DataBaseTools dbTools = DataBaseTools.getInstance();


    @Override
    public void addBook(Book book) {
      dbTools.writeToDB("b$%$" + book.getTitle() + book.getAuthor() + book.getYear()+"\n");
        System.out.println(1);
    }

    @Override
    public void findBook(Book book) {

    }
}
