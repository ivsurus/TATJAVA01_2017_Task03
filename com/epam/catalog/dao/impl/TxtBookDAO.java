package com.epam.catalog.dao.impl;

//реализация интерфейсов для слоя DAO

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.exeption.DAOException;
import com.epam.catalog.dao.tools.DataBaseTools;


import java.util.Set;


public class TxtBookDAO implements EntityDAO<Book> {


    private DataBaseTools dbTools = DataBaseTools.getInstance();
    private final String IDENTIFIER = "b";
    private final String DELIMITER = "$%$";

    @Override
    public void addEntity(Book book) throws DAOException {
        dbTools.writeToDB(IDENTIFIER+DELIMITER+book.getTitle()+DELIMITER+book.getAuthor()+DELIMITER+book.getYear()+"\n");
        System.out.println(1);
    }

    @Override
    public Set<String> findEntity(String searchCriterion) throws DAOException {

        System.out.println("я тут 2");
        System.out.println("criterion " + searchCriterion);
        System.out.println(dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER).size());
        return dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER);
    }
}

