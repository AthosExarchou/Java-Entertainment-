package it2022134;

public class Actor { //class for actors

	private String actorFullName;
	private int actorId;
	private String actorDateOfBirth;
	private String actorCountryOfBirth;
	private String actorWebsite;

	public Actor() {

	}

	public Actor (String actorFullName, String actorDateOfBirth, String actorCountryOfBirth, String actorWebsite, int actorId) {
		this.actorFullName = actorFullName;
		this.actorDateOfBirth = actorDateOfBirth;
		this.actorCountryOfBirth = actorCountryOfBirth;
		this.actorWebsite = actorWebsite;
		this.actorId = actorId;
	}

	//setters and getters methods
	public String getActorFullName() {
		return actorFullName;
	}
	public void setActorFullName(String actorFullName) {
		this.actorFullName = actorFullName;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	/*
	public String getActorDateOfBirth() {
		return actorDateOfBirth;
	}*/
	public void setActorDateOfBirth(String actorDateOfBirth) {
		this.actorDateOfBirth = actorDateOfBirth;
	}
	/*
	public String getActorCountryOfBirth() {
		return actorCountryOfBirth;
	}*/
	public void setActorCountryOfBirth(String actorCountryOfBirth) {
		this.actorCountryOfBirth = actorCountryOfBirth;
	}
	/*
	public String getActorWebsite() {
		return actorWebsite;
	}*/
	public void setActorWebsite(String actorWebsite) {
		this.actorWebsite = actorWebsite;
	}
}
