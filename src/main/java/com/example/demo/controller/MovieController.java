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
    public Movie getBook(@PathVariable Long id) {
        return movieService.findMovieById(id);
    }

    @PostMapping(value = "")
    public Movie saveBook(@Valid @RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping(value = "")
    public Movie updateBook(@Valid @RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteBook(@PathVariable Long id) {
        movieService.deleteMovieById(id);
        return "Successfully deleted";
    }

}
