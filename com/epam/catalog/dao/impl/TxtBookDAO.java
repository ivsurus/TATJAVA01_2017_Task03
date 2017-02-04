package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDAO;
import com.epam.catalog.dao.tools.DataBaseTools;


import java.util.Set;


public class TxtBookDAO implements BookDAO {


    private DataBaseTools dbTools = DataBaseTools.getInstance();
    private final char IDENTIFIER = 'b';
    private final String DELIMITER = "$%$";

    @Override
    public void addBook(Book book) {
        dbTools.writeToDB(IDENTIFIER+DELIMITER+book.getTitle()+DELIMITER+book.getAuthor()+DELIMITER+book.getYear()+"\n");
        System.out.println(1);
    }

    @Override
    public Set<String> findBook(String searchCriterion) {
    return dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER);
    }
}

