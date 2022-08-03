package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieService.findMovieById(id);
    }

    @PostMapping(value = "")
    public Movie saveMovie(@Valid @RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping(value = "")
    public Movie updateMovie(@Valid @RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovieById(id);
        return "Successfully deleted";
    }

}
