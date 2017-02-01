package com.epam.catalog.service;


import com.epam.catalog.bean.Movie;

public interface MovieService {
    void addMovie(Movie movie);
    void findMovie(Movie movie);
}
