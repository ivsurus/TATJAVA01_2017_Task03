package com.epam.catalog.controller.command.impl;


import com.epam.catalog.bean.Movie;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.MovieService;
import com.epam.catalog.service.factory.ServiceFactory;

public class AddMovie implements Command {
    @Override
    public String execute(String request) {
        String delimiter = "\\$%\\$";
        Movie movie = new Movie();
        String[] parameters = request.split(delimiter);
        movie.setTitle(parameters[1]);
        movie.setAuthor(parameters[2]);
        movie.setYear(parameters[3]);
        ServiceFactory serviceObjectFactory = ServiceFactory.getInstance();
        MovieService movieService = serviceObjectFactory.getMovieService();
        movieService.addMovie(movie);
        return null;
    }
}
