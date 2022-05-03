package com.example.moviemate.controllers;

import com.example.moviemate.model.Movie;
import com.example.moviemate.services.MovieService;
import com.mongodb.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
    Author: @bharathraj on 03/05/22
*/
@RestController
@RequestMapping("v1/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{name}")
    public Movie getMovieById(@NonNull @PathVariable("name") String name){
        return movieService.findByName(name);
    }

}
