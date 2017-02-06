package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.EntityService;

import java.util.Set;


public class MovieServiceImpl implements EntityService<Movie> {
    @Override
    public void addEntity(Movie movie) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        EntityDAO<Movie> movieDAO = daoObjectFactory.getMovieDAO();
        movieDAO.addEntity(movie);
    }

    @Override
    public Set<Book> findEntity(String searchCriterion) {
        return null;
    }


}
