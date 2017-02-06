package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.tools.DataBaseTools;

import java.util.Set;

//реализация интерфейсов для слоя DAO
public class TxtMovieDAO implements EntityDAO<Movie> {

    private DataBaseTools dbTools = DataBaseTools.getInstance();
    private final char IDENTIFIER = 'm';
    private final String DELIMITER = "$%$";

    @Override
    public void addEntity(Movie movie) {
        dbTools.writeToDB(IDENTIFIER+DELIMITER+movie.getTitle()+DELIMITER+movie.getAuthor()+DELIMITER+movie.getYear()+"\n");
        System.out.println(3);
    }

    @Override
    public Set<String> findEntity(String searchCriterion) {
        return dbTools.delUnnecessaryData(dbTools.readFromDB(),IDENTIFIER);
    }
}



