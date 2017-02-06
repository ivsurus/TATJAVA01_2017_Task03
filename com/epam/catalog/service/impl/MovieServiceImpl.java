package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.EntityDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.MovieService;


public class MovieServiceImpl implements MovieService {
    @Override
    public void addMovie(Movie movie) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        EntityDAO<Movie> movieDAO = daoObjectFactory.getMovieDAO();
        movieDAO.addEntity(movie);
    }

    @Override
    public void findMovie(Movie movie) {

    }
}
