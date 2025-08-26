package it2022134;

public class Dir { //class for directors

	private String dirFullName;
	private int dirId;
	private String dirDateOfBirth;
	private String dirCountryOfBirth;
	private String dirWebsite;

	public Dir() {

	}

	public Dir (String dirFullName, String dirDateOfBirth, String dirCountryOfBirth, String dirWebsite, int dirId) {
		this.dirFullName = dirFullName;
		this.dirDateOfBirth = dirDateOfBirth;
		this.dirCountryOfBirth = dirCountryOfBirth;
		this.dirWebsite = dirWebsite;
		this.dirId = dirId;
	}
	
	//setters and getters methods
	public String getDirFullName() {
		return dirFullName;
	}
	public void setDirFullName(String dirFullName) {
		this.dirFullName = dirFullName;
	}
	public int getDirId() {
		return dirId;
	}
	public void setDirId(int dirId) {
		this.dirId = dirId;
	}
	/*
	public String getDirDateOfBirth() {
		return dirDateOfBirth;
	}*/

	public void setDirDateOfBirth(String dirDateOfBirth) {
		this.dirDateOfBirth = dirDateOfBirth;
	}
	/*
	public String getDirCountryOfBirth() {
		return dirCountryOfBirth;
	}*/

	public void setDirCountryOfBirth(String dirCountryOfBirth) {
		this.dirCountryOfBirth = dirCountryOfBirth;
	}
	/*
	public String getDirWebsite() {
		return dirWebsite;
	}*/

	public void setDirWebsite(String dirWebsite) {
		this.dirWebsite = dirWebsite;
	}
	public void setSeriesDirFullName(String dirFullName) {
		this.dirFullName = dirFullName;
	}
	public String getSeriesDirFullName() {
		return dirFullName;
	}
}
