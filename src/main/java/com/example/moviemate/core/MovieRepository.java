package com.example.moviemate.core;

import com.example.moviemate.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/*
    Author: @bharathraj on 03/05/22
*/
public interface MovieRepository extends MongoRepository<Movie,String> {
    public Optional<Movie> findById(String id);

}