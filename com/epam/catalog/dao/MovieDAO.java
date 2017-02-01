package com.epam.catalog.dao;


import com.epam.catalog.bean.Movie;

public interface MovieDAO {
    void addMovie(Movie movie);
    void findMovie(Movie movie);
}
