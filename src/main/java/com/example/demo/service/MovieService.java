package com.example.demo.service;

import com.example.demo.entity.Movie;

public interface MovieService {

    Movie findMovieById(Long id);

    Movie saveMovie(Movie movie);

    Movie updateMovie(Movie movie);

    void deleteMovieById(Long id);

}
