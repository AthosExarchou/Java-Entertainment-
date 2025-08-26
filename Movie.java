package it2022134;

import java.util.ArrayList;

public class Movie {

	private String movieTitle;
	private ArrayList<String> movieType;
	private String dirFullName;
	private int movieYear1;
	private int movieId;
	private String countryOfOrigin;
	private ArrayList<Actor> actors;

	public Movie() {

	}

	public Movie (String movieTitle, int movieYear1, ArrayList<String> movieType, String countryOfOrigin, String dirFullName, ArrayList<Actor> actors, int movieId) {
		this.movieTitle = movieTitle;
		this.movieYear1 = movieYear1;
		this.movieType = movieType;
		this.countryOfOrigin = countryOfOrigin;
		this.dirFullName = dirFullName;
		this.actors = actors;
		this.movieId = movieId;
	}
	
	//setters and getters methods
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public ArrayList<String> getMovieType() {
		return movieType;
	}
	public void setMovieType(ArrayList<String> movieType) {
		this.movieType = movieType;
	}
	public String getDirFullName() {
        return dirFullName;
    }
	public void setDirFullName(String dirFullName) {
        this.dirFullName = dirFullName;
    }
	public int getMovieYearOfRelease() { //gets a movie's year of release
		return movieYear1;
	}
	public void setMovieYearOfRelease(int movieYear1) { //sets a movie's year of release
		this.movieYear1 = movieYear1;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	/*public String getMovieCountryOfOrigin() {
		return countryOfOrigin;
	}*/

	public void setMovieCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public ArrayList<Actor> getMovieActors() {
        return actors;
    }
    public void setMovieActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
    
    @Override
    public String toString() {
        return  "Id: " + this.movieId + "\nTitle: " + this.movieTitle + "\nGenre: " + this.movieType+ "\nType: Movie" + "\nDirector name: " + this.dirFullName;
    }
}
