package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.DiskDAO;
import com.epam.catalog.dao.MovieDAO;
import com.epam.catalog.dao.factory.DAOFactory;
import com.epam.catalog.service.MovieService;


public class MovieServiceImpl implements MovieService {
    @Override
    public void addMovie(Movie movie) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        MovieDAO movieDAO = daoObjectFactory.getMovieDAO();
        movieDAO.addMovie(movie);
    }

    @Override
    public void findMovie(Movie movie) {

    }
}
