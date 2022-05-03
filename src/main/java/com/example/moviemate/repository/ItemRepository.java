package com.example.moviemate.repository;

import com.example.moviemate.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<Movie, String> {

    @Query("{title:'?0'}")
    Movie findItemByName(String title);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Movie> findAll(String category);

    public long count();
}
