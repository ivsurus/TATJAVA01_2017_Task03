package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.MovieDAO;
import com.epam.catalog.dao.tools.DataBaseTools;

//реализация интерфейсов для слоя DAO
public class TxtMovieDAO implements MovieDAO {

    DataBaseTools dbTools = DataBaseTools.getInstance();
    @Override
    public void addMovie(Movie movie) {
        dbTools.writeToDB("m$%$" + movie.getTitle() + movie.getAuthor() + movie.getYear()+"\n");
        System.out.println(3);
    }

    @Override
    public void findMovie(Movie movie) {

    }
}



