package com.example.demo.repository;

import com.example.demo.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    Movie findMovieById(Long id);

    void deleteMovieById(Long id);
}
