package com.example.moviemate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Movie")
public class Movie {

    @Id
    private String imdb_id;
    private String imdb_votes;
    private String imdb_rating;
    private String title;
    private String title_x;
    private String title_y;
    private String genres;
    private String story;
    private String actors;
    private String tagline;
    private String summary;
    private String runtime;
    private String is_adult;
    private String link_wiki;
    private String link_poster;
    private String release_date;
    private String wins_nominations;

    public Movie(String imdb_id, String imdb_votes, String imdb_rating, String title, String title_x, String title_y, String genres, String story, String actors, String tagline, String summary, String runtime, String is_adult, String link_wiki, String link_poster, String release_date, String wins_nominations) {
        this.imdb_id = imdb_id;
        this.imdb_votes = imdb_votes;
        this.imdb_rating = imdb_rating;
        this.title = title;
        this.title_x = title_x;
        this.title_y = title_y;
        this.genres = genres;
        this.story = story;
        this.actors = actors;
        this.tagline = tagline;
        this.summary = summary;
        this.runtime = runtime;
        this.is_adult = is_adult;
        this.link_wiki = link_wiki;
        this.link_poster = link_poster;
        this.release_date = release_date;
        this.wins_nominations = wins_nominations;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public void setImdb_votes(String imdb_votes) {
        this.imdb_votes = imdb_votes;
    }

    public void setImdb_rating(String imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle_x(String title_x) {
        this.title_x = title_x;
    }

    public void setTitle_y(String title_y) {
        this.title_y = title_y;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setIs_adult(String is_adult) {
        this.is_adult = is_adult;
    }

    public void setLink_wiki(String link_wiki) {
        this.link_wiki = link_wiki;
    }

    public void setLink_poster(String link_poster) {
        this.link_poster = link_poster;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setWins_nominations(String wins_nominations) {
        this.wins_nominations = wins_nominations;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public String getImdb_votes() {
        return imdb_votes;
    }

    public String getImdb_rating() {
        return imdb_rating;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_x() {
        return title_x;
    }

    public String getTitle_y() {
        return title_y;
    }

    public String getGenres() {
        return genres;
    }

    public String getStory() {
        return story;
    }

    public String getActors() {
        return actors;
    }

    public String getTagline() {
        return tagline;
    }

    public String getSummary() {
        return summary;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getIs_adult() {
        return is_adult;
    }

    public String getLink_wiki() {
        return link_wiki;
    }

    public String getLink_poster() {
        return link_poster;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getWins_nominations() {
        return wins_nominations;
    }
}