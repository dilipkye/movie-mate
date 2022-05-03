package com.example.moviemate.services.impl;

import com.example.moviemate.model.Movie;
import com.example.moviemate.repository.ItemRepository;
import com.example.moviemate.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
    Author: @bharathraj on 03/05/22
*/
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Movie findByName(String name) {
        //doData();
        Movie movie = itemRepository.findItemByName(name);
        return movie;
    }




    public void doData(String... args) {

        System.out.println("-------------STARTED-------------------------------\n");

        // Clean up any previous data
        itemRepository.deleteAll(); // Doesn't delete the collection

        System.out.println("-------------CREATE MOVIES-------------------------------\n");

        createMovies();

        System.out.println("\n----------------SHOW ALL MOVIES---------------------------\n");

        showAllMovies();

        System.out.println("\n--------------GET MOVIE BY NAME-----------------------------------\n");

        getMovieByName("8");

        System.out.println("\n-----------GET MOVIE BY GENRES---------------------------------\n");

        getMovieByGenres("action");

        System.out.println("\n-----------UPDATE TITLE X OF ALL MOVIES----------------\n");

        updateMovieTitleX("New TitleX");

        System.out.println("\n----------DELETE A MOVIE----------------------------------\n");

        deleteMovie("2");

        System.out.println("\n------------FINAL COUNT OF Movies-------------------------\n");

        findCountOfMovies();

        System.out.println("\n-------------------THANK YOU---------------------------");

    }

    // CRUD operations

    //CREATE
    void createMovies() {
        System.out.println("Data creation started...");

        itemRepository.save(new Movie("0", "5","1", "6","2", "7","3", "8","4", "9","00", "05","01", "06","02", "07","03"));
        itemRepository.save(new Movie("1", "6","2", "7","3", "8","4", "9","5", "0","01", "06","02", "07","03", "08","04"));
        itemRepository.save(new Movie("2", "7","3", "8","4", "9","5", "0","6", "1","02", "07","03", "08","04", "09","05"));
        itemRepository.save(new Movie("3", "8","4", "9","5", "0","6", "1","7", "2","03", "08","04", "09","05", "00","06"));
        itemRepository.save(new Movie("4", "9","5", "0","6", "1","7", "2","8", "3","04", "09","05", "00","06", "01","07"));

        System.out.println("Data creation complete...");
    }

    // READ
    // 1. Show all the data
    public void showAllMovies() {

        List<Movie> itemList = itemRepository.findAll();

        itemList.forEach(item -> System.out.println(getItemDetails(item)));
    }

    // 2. Get item by name
    public void getMovieByName(String name) {
        System.out.println("Getting movie by name: " + name);
        Movie item = itemRepository.findItemByName(name);
        System.out.println(getItemDetails(item));
    }

    // 3. Get title and release of all movies of a particular genres
    public void getMovieByGenres(String genres) {
        System.out.println("Getting movies for the genres " + genres);
        List<Movie> list = itemRepository.findAll(genres);

        list.forEach(item -> System.out.println(
                "Title: " + item.getTitle()
                        + ", Release: " + item.getRelease_date()
                        + ", Genres: " + item.getGenres()
        ));
    }

    // 4. Get count of documents in the collection
    public void findCountOfMovies() {
        long count = itemRepository.count();
        System.out.println("Number of documents in the collection = " + count);
    }

    // UPDATE APPROACH 1: Using MongoRepository
    public void updateMovieTitleX(String titleX) {

        // Change to this new value
        String newTitleX = "Updated Title X";

        // Find all the items with the titleX
        List<Movie> list = itemRepository.findAll(titleX);

        list.forEach(item -> {
            // Update the TitleX in each document
            item.setTitle_x(newTitleX);
        });

        // Save all the items in database
        List<Movie> itemsUpdated = itemRepository.saveAll(list);

        if(itemsUpdated != null)
            System.out.println("Successfully updated " + itemsUpdated.size() + " items.");
    }

    // DELETE
    public void deleteMovie(String id) {
        itemRepository.deleteById(id);
        System.out.println("Item with id " + id + " deleted...");
    }
    // Print details in readable form

    public String getItemDetails(Movie item) {

        System.out.println(
                "IMDB ID: " + item.getImdb_id() +
                        ", \nIMDB Votes: " + item.getImdb_votes() +
                        ", \nIMDB Rating: " + item.getImdb_rating() +
                        ", \nIMDB Title: " + item.getTitle() +
                        ", \nIMDB Title X: " + item.getTitle_x() +
                        ", \nIMDB Title Y: " + item.getTitle_y() +
                        ", \nIMDB Genres: " + item.getGenres() +
                        ", \nIMDB Story: " + item.getStory() +
                        ", \nIMDB Actors: " + item.getActors() +
                        ", \nIMDB Tagline: " + item.getTagline() +
                        ", \nIMDB Summary: " + item.getSummary() +
                        ", \nIMDB Runtime: " + item.getRuntime() +
                        ", \nIMDB Adult: " + item.getIs_adult() +
                        ", \nIMDB Wiki: " + item.getLink_wiki() +
                        ", \nIMDB Poster: " + item.getLink_poster() +
                        ", \nIMDB Release: " + item.getRelease_date() +
                        ", \nIMDB Nomination: " + item.getWins_nominations()
        );

        return "";
    }
}
