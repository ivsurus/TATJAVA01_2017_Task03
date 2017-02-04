package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.dao.tools.DataBaseTools;


import java.util.Set;


public class TxtBookDAO implements BookDAO {

    private DataBaseTools dbTools = DataBaseTools.getInstance();
    private final char IDENTIFIER = 'b';

    @Override
    public void addBook(Book book) {
        dbTools.writeToDB("b$%$" + book.getTitle() + book.getAuthor() + book.getYear() + "\n");
        System.out.println(1);
    }

    @Override
    public Set<String> findBook(String searchCriterion) {
    return dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER);
    }
}

