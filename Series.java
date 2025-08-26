package it2022134;

import java.util.ArrayList;

public class Series extends Movie {

	private int seriesId;
	private String seriesTitle;
	private int seriesYear1;
	private ArrayList<String> seriesTypes;
	private String dirFullName;
	private String countryOfOrigin;
	private ArrayList<Actor> actors;
	private int seasons;
	private String lastYearSeason;
	private ArrayList<Integer> episodes;

	public Series() {

	}

	public Series (String seriesTitle, int seriesYear1, ArrayList<String> seriesTypes, String countryOfOrigin, String dirFullName, ArrayList<Actor> actors, int seriesId, int seasons, String lastYearSeason, ArrayList<Integer> episodes) {
		this.seriesTitle = seriesTitle;
		this.seriesYear1 = seriesYear1;
		this.seriesTypes = seriesTypes;
		this.countryOfOrigin = countryOfOrigin;
		this.dirFullName = dirFullName;
		this.actors = actors;
		this.seriesId = seriesId;
		this.seasons = seasons;
		this.lastYearSeason = lastYearSeason;
		this.episodes = episodes;
	}

	//setters and getters methods
	public int getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}
	public String getSeriesTitle() {
		return seriesTitle;
	}
	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}
	public int getSeriesYearOfRelease() { //gets a series's year of release
		return seriesYear1;
	}
	public void setSeriesYearOfRelease(int seriesYear1) { //sets a series's year of release
		this.seriesYear1 = seriesYear1;
	}
	public ArrayList<String> getSeriesTypes() {
        return seriesTypes;
    }
    public void setSeriesTypes(ArrayList<String> seriesTypes) {
        this.seriesTypes= seriesTypes;
    }
	public ArrayList<Actor> getSeriesActors() {
		return actors;
	}
    public void setSeriesActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
	public int getNumOfSeasons() {
		return seasons;
	}
	public void setNumOfSeasons(int seasons) {
		this.seasons = seasons;
	}

	/*
	public String getSeriesCountryOfOrigin() {
		return countryOfOrigin;
	}*/

	public void setSeriesCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getLastYearSeason() {
		return lastYearSeason;
	}
	public void setLastYearSeason(String lastYearSeason) {
		this.lastYearSeason = lastYearSeason;
	}
	public ArrayList<Integer> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(ArrayList<Integer> episodes) {
		this.episodes = episodes;
	}
	public void setSeriesDirFullName(String dirFullName) {
		this.dirFullName = dirFullName;
	}
	public String getSeriesDirFullName() {
		return dirFullName;
	}

	@Override
    public String toString() {
        return "Id: " + this.seriesId + "\nTitle: " + this.seriesTitle + "\nGenre: " + this.seriesTypes+ "\nType: Series " + "\nDirector name: " + this.dirFullName;
    }

}
