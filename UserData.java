package it2022134;

import java.util.ArrayList;

public class UserData { //class for storing the user's data

	private String username;
    private String email;
    private String password;
    private ArrayList<Series> reviewedSeries = new ArrayList<Series>();
    private ArrayList<Integer> ratingSeries = new ArrayList<Integer>();
    private ArrayList<Movie> reviewedMovies = new ArrayList<Movie>();
    private ArrayList<Integer> ratingMovies = new ArrayList<Integer>();
    private ArrayList<String> faveDirectors = new ArrayList<>();
    private ArrayList<String> faveActors = new ArrayList<>();

    public UserData() {

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setReviewedSeries(ArrayList<Series> reviewedSeries) {
        this.reviewedSeries = reviewedSeries;
    }
    public ArrayList<Series> getReviewedSeries() {
        return reviewedSeries;
    }
    public void setReviewedMovies(ArrayList<Movie> reviewedMovies) {
        this.reviewedMovies = reviewedMovies;
    }
    public ArrayList<Movie> getReviewedMovies() {
        return reviewedMovies;
    }
    public void setRatingSeries(ArrayList<Integer> ratingSeries) {
        this.ratingSeries = ratingSeries;
    }
    public ArrayList<Integer> getRatingSeries() {
        return ratingSeries;
    }
    public void setRatingMovies(ArrayList<Integer> ratingMovies) {
        this.ratingMovies = ratingMovies;
    }
    public ArrayList<Integer> getRatingMovies() {
        return ratingMovies;
    }
    public void setFaveDirectors(ArrayList<String> faveDirectors) {
        this.faveDirectors = faveDirectors;
    }
    public ArrayList<String> getFaveDirectors() {
        return faveDirectors;
    }
    public void setFaveActors(ArrayList<String> faveActors) {
        this.faveActors = faveActors;
    }
    public ArrayList<String> getFaveActors() {
        return faveActors;
    }
}
