package com.epam.catalog.dao.impl;


import com.epam.catalog.bean.Movie;
import com.epam.catalog.dao.MovieDAO;
import com.epam.catalog.database.DataBaseWriter;

//реализация интерфейсов для слоя DAO
public class TxtMovieDAO implements MovieDAO {

    DataBaseWriter dbWriter = DataBaseWriter.getInstance();
    @Override
    public void addMovie(Movie movie) {
        dbWriter.writeToDB("!m" + movie.getTitle() + movie.getAuthor() + movie.getYear()+"\n");
        System.out.println(3);
    }

    @Override
    public void findMovie(Movie movie) {

    }
}



