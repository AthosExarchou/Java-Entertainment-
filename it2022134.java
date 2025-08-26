package it2022134;

//it2022134
//ΕΞΑΡΧΟΥ ΑΘΩΣ

//imported libraries
import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.InputMismatchException;

public class it2022134 {

	static Scanner usrInput = new Scanner(System.in); //create static object to accept input from user

	public static int invalidInput(String message) { //function to handle exceptions

		boolean done = true;
		int userInput = 0;

		while (done) {
			try {
				System.out.print(message); //prints appropriate message
				userInput = usrInput.nextInt(); //accepts a single line of input from the user
				usrInput.nextLine(); //clears the buffer
				done = false;
			} catch (InputMismatchException IME) {
				System.out.println("Invalid input! Try again."); //informs the user their input is invalid
				usrInput.nextLine(); //clears the buffer
			}
		}
		return userInput; //returns the valid input and executes the rest of the program
	}

	public static void main(String[] args) {

		SecureRandom randomNum = new SecureRandom(); //an extension of random
		
		//Variable declaration and instantiation
		
		//contains multiple genres
		String[] genres = {"Drama", "Comedy", "Thriller", "Romance", "Horror", "Crime", "Action"};
		String genre; //contains the genre of shows
		int showType; //contains shows' types
		String countryOfOrigin; //contains movies' country of origin
		String dirFullName; //contains director's full name
		String newActor; //contains actors' full name
		boolean dirExist = false; //primitive data type to check whether a director exists(true) or not(false)
		boolean actorExist = false; //primitive data type to check whether an actor exists(true) or not(false)
		String dateOfBirth; //contains the date of birth for actors and directors
		String countryOfBirth; //contains the country of birth for actors and directors
		String websiteExist; //variable to check whether an actor/director has a website or not
		String website; //contains actors'/directors website link
		int episodes; //contains the number of episodes
		String lastYearSeason; //contains the year of the last season
		int choice; //contains the user's choice according to the different instructions presented to them
		int adminChoice; //contains the administrator's choice
		String username; //contains the user's username
		String email; //contains the user's email address
		String password; //contains the user's password
		int rating; //contains the user's rating for the shows
		
		ArrayList<Series> seriesList = new ArrayList<Series>();
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		ArrayList<Dir> directorList = new ArrayList<Dir>();
		ArrayList<Actor> actorList = new ArrayList<Actor>();
		ArrayList<UserData> userList = new ArrayList<UserData>();

		//1st movie information
		ArrayList<String> OppenheimerGenres = new ArrayList<String>();
		ArrayList<Actor> OppenheimerActors = new ArrayList<Actor>();

		Dir dir1 = new Dir("Christopher Nolan", "30/7/1970", "UK", "-",
								randomNum.nextInt(899999)+100000);
		directorList.add(dir1);

		Actor actor1 = new Actor("Cillian Murphy", "25/5/1976", "USA",
							"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor1);
		Actor actor2 = new Actor("Robert Downey Jr.", "4/4/1965", "US",
							"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor2);

		OppenheimerActors.add(actor1);
		OppenheimerActors.add(actor2);
		OppenheimerGenres.add("Drama");

		Movie movie1 = new Movie("Oppenheimer", 2023, OppenheimerGenres, "USA",
							"Christopher Nolan", OppenheimerActors, randomNum.nextInt(899999)+100000);
		movieList.add(movie1);

		//2nd movie information
		ArrayList<String> TheMatrixGenres = new ArrayList<String>();
		ArrayList<Actor> TheMatrixActors = new ArrayList<Actor>();

		Dir dir2 = new Dir("Lana Wachowski", "21/6/1965", "US", "-",
				randomNum.nextInt(899999)+100000);
		directorList.add(dir2);

		Actor actor3 = new Actor("Keanu Reeves", "2/9/1964", "Lebanon",
				"https://keanu-reeves.org/", randomNum.nextInt(899999)+100000);
		actorList.add(actor3);
		Actor actor4 = new Actor("Carrie-Anne Moss", "21/8/1967", "Canada",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor4);
		Actor actor5 = new Actor("Laurence Fishburne", "30/7/1961", "US",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor5);
		Actor actor6 = new Actor("Hugo Weaving", "4/4/1960", "Nigeria",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor6);

		TheMatrixActors.add(actor3);
		TheMatrixActors.add(actor4);
		TheMatrixActors.add(actor5);
		TheMatrixActors.add(actor6);
		TheMatrixGenres.add("Action");
		Movie movie2 = new Movie("The Matrix", 1999, TheMatrixGenres, "Australia",
				"Lana Wachowski", TheMatrixActors, randomNum.nextInt(899999)+100000);
		movieList.add(movie2);

		//1st series information
		ArrayList<String> HouseGenres = new ArrayList<String>();
		ArrayList<Actor> HouseActors = new ArrayList<Actor>();
		ArrayList<Integer> HouseEpisodes = new ArrayList<Integer>();

		Dir dir3 = new Dir("Deran Sarafian", "17/1/1958", "US", "https://www.deransarafian.com/",
				randomNum.nextInt(899999)+100000);
		directorList.add(dir3);

		Actor actor7 = new Actor("Hugh Laurie", "11/6/1959", "England",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor7);
		Actor actor8 = new Actor("Omar Epps", "20/7/1973", "USA",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor8);
		Actor actor9 = new Actor("Robert Sean Leonard", "28/2/1969", "USA",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor9);

		HouseActors.add(actor7);
		HouseActors.add(actor8);
		HouseActors.add(actor9);
		HouseGenres.add("Drama");
		HouseGenres.add("Comedy");
		HouseGenres.add("Crime");
		HouseEpisodes.add(22);
		HouseEpisodes.add(24);
		HouseEpisodes.add(24);
		HouseEpisodes.add(16);
		HouseEpisodes.add(24);
		HouseEpisodes.add(22);
		HouseEpisodes.add(23);
		HouseEpisodes.add(22);

		Series series1 = new Series("House", 2004, HouseGenres, "USA", "David Shore", HouseActors,
									randomNum.nextInt(899999)+100000, 8, "2012", HouseEpisodes);
		seriesList.add(series1);

		//2nd series information
		ArrayList<String> SherlockGenres = new ArrayList<String>();
		ArrayList<Actor> SherlockActors = new ArrayList<Actor>();
		ArrayList<Integer> SherlockEpisodes = new ArrayList<Integer>();

		Dir dir4 = new Dir("Mark Gatiss", "17/10/1966", "UK", "-",
				randomNum.nextInt(899999)+100000);
		directorList.add(dir4);

		Actor actor10 = new Actor("Benedict Cumberbatch", "19/7/1976", "UK",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor10);
		Actor actor11 = new Actor("Martin Freeman", "8/9/1971", "England",
				"-", randomNum.nextInt(899999)+100000);
		actorList.add(actor11);

		SherlockActors.add(actor10);
		SherlockActors.add(actor11);
		SherlockGenres.add("Crime");
		SherlockGenres.add("Drama");
		SherlockGenres.add("Thriller");
		SherlockEpisodes.add(3);
		SherlockEpisodes.add(3);
		SherlockEpisodes.add(3);
		SherlockEpisodes.add(3);

		Series series2 = new Series("Sherlock", 2010, SherlockGenres, "UK", "Mark Gatiss", SherlockActors,
									randomNum.nextInt(899999)+100000, 4, "2017", SherlockEpisodes);
		seriesList.add(series2);


		//Introduction
		System.out.println("Welcome to the Official JavaEntertainment Website,");
		System.out.println("where you can watch movies, series and do much more!");
		System.out.println("Before you, is a list of actions you can take:");

		do {
			//prints a menu to inform the user on the options available to them
			do {
				choice = invalidInput("1. Register a new show.\n2. Update a show's(series) information.\n3. Read a show's information and/or rate a show.\n" +
						"4. Read an actor's/director's information and/or add to Favourites.\n5. Quit.\nChoose from 1 to 5.\n");
				//doesn't include any brackets since only one command is executed
				if (choice < 1 || choice > 5)
					System.out.println("Enter an integer from 1 to 5:");

			} while (choice < 1 || choice > 5);

			//used the enhanced version of 'switch' instead of 'if', since it's simpler to use when dealing with multiple cases
			switch (choice) {
				case 1 -> {
					do {
						showType = invalidInput("Press '1' to register a movie, or '2' to register a series.\n");
						//doesn't include any brackets since only one command is executed
						if ((showType != 1) && (showType != 2)) //checks whether the input is invalid
							System.out.println("Invalid input! Try again."); //informs the user their input is invalid

					} while ((showType != 1) && (showType != 2));
					if (showType == 1) { //case where user's input was 1
						Movie movie = new Movie();
						movie.setMovieId(randomNum.nextInt(899999) + 100000); //creates a random 6-digit id for the movie

						//requests and sets the movie's title
						System.out.println("Enter the movie's title:");
						String movieTitle; //contains movies' title
						movieTitle = usrInput.nextLine(); //accepts a single line of input from the user
						movie.setMovieTitle(movieTitle);

						//requests and sets the movie's year of release
						int rlsYear = invalidInput("Enter the movie's year of release.\n");
						movie.setMovieYearOfRelease(rlsYear);

						//requests and sets the movie's genre(s)
						System.out.println("Available genres:");
						//doesn't include any brackets since only one command is executed
						for (String s : genres)
							System.out.println(s);

						ArrayList<String> movieTypes = new ArrayList<String>();

						int genresCounter = 0;
						System.out.println("There can only be up to 3 genres for each movie.");
						while (genresCounter < 3) { //allows up to 3 genres
							System.out.println("To signal that you've completed writing the movie's genre(s),"
									+ " you can simply enter \"QUIT\".");
							System.out.println("Write the genre(s) of the movie:");

							genre = usrInput.nextLine(); //accepts a single line of input from the user
							//inspired from: https://www.w3schools.com/java/ref_string_equalsignorecase.asp
							if (genre.equalsIgnoreCase("quit")) { //case where the user has entered "QUIT"
								System.out.println("You've entered \"QUIT\". Moving on to the next step...");
								break;
							}
							genresCounter++;
							movieTypes.add(genre);
						}
						movie.setMovieType(movieTypes);

						//requests and sets the movie's country of origin
						System.out.println("Enter the movie's country of origin:");
						countryOfOrigin = usrInput.nextLine(); //accepts a single line of input from the user
						movie.setMovieCountryOfOrigin(countryOfOrigin);

						//requests and sets the movie director's full name
						System.out.println("Enter the movie director's full name:");
						dirFullName = usrInput.nextLine(); //accepts a single line of input from the user
						movie.setDirFullName(dirFullName);
						for (Dir d : directorList) {
							//doesn't include any brackets since only one command is executed
							if (d.getDirFullName().equalsIgnoreCase(dirFullName)) {
								dirExist = true; //case where the director already exists
								break;
							}
						}
						if (!dirExist) { //case where the director doesn't already exist
							Dir dir = new Dir(); //creates new object for the director
							dir.setDirFullName(dirFullName); //sets the director's full name

							//requests and sets the director's date of birth
							System.out.println("Enter the director's date of birth(DATE/MONTH/YEAR):");
							dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
							dir.setDirDateOfBirth(dateOfBirth);

							//requests and sets the director's country of birth
							System.out.println("Enter the director's country of birth:");
							countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
							dir.setDirCountryOfBirth(countryOfBirth);

							//requests and sets the director's website(if it exists, else puts "-" as the input)
							System.out.println("Enter whether the director has a website or not(yes/no):");
							do {
								websiteExist = usrInput.nextLine(); //accepts a single line of input from the user
								if (websiteExist.equalsIgnoreCase("yes")) {
									System.out.println("Enter the director's website:");
									website = usrInput.nextLine(); //accepts a single line of input from the user
									dir.setDirWebsite(website);
								} else if (websiteExist.equalsIgnoreCase("no")) {
									//puts the space ("-") as the input to indicate that the director doesn't have a website
									dir.setDirWebsite("-");
								} else //doesn't include any brackets since only one command is executed
									//case where the input is neither "yes", nor "no"
									System.out.println("Invalid input! Try again:"); //informs the user their input is invalid

							} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));

							//done after the registration of the director, as per the instruction-manual
							//creates a random 6-digit id for the director
							dir.setDirId(randomNum.nextInt(899999) + 100000);
							directorList.add(dir);
						}
						System.out.println("Enter the names of the actors participating in the movie.");
						System.out.println("There can only be up to 10 actors.");
						System.out.println("To signal that you've completed adding the movie's actors,"
								+ " you can simply enter \"QUIT\":");

						ArrayList<Actor> movieActors = new ArrayList<Actor>();

						int counter = 0; //contains the amount of actors in a movie(starting from 0)
						do {
							System.out.println("Enter the new actor's name:");
							newActor = usrInput.nextLine(); //accepts a single line of input from the user

							if (newActor.equalsIgnoreCase("quit")) {
								System.out.println("You've entered \"QUIT\". Moving on to the next step...");
								break;
							}
							actorExist = false;

							Actor newActorObj = null;
							for (Actor a : actorList) {
								//doesn't include any brackets since only one command is executed
								if (a.getActorFullName().equalsIgnoreCase(newActor)) {
									newActorObj = a;
									actorExist = true;
									break;
								}
							}
							if (!actorExist) { //case where the actor doesn't already exist

								Actor actor = new Actor(); //creates new object for the actor
								actor.setActorFullName(newActor); //sets the actor's full name

								//requests and sets the actor's date of birth
								System.out.println("Enter the actor's date of birth(DATE/MONTH/YEAR):");
								dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
								actor.setActorDateOfBirth(dateOfBirth);

								//requests and sets the actor's country of birth
								System.out.println("Enter the actor's country of birth:");
								countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
								actor.setActorCountryOfBirth(countryOfBirth);


								//requests and sets the actor's website(if it exists, else puts "-" as the input)
								System.out.println("Enter whether the actor has a website or not(yes/no):");
								do {
									websiteExist = usrInput.nextLine(); //accepts a single line of input from the user
									if (websiteExist.equalsIgnoreCase("yes")) {
										System.out.println("Enter the actor's website:");
										website = usrInput.nextLine(); //accepts a single line of input from the user
										actor.setActorWebsite(website);
									} else if (websiteExist.equalsIgnoreCase("no")) {
										System.out.println("The actor does not have a website.");
										//puts the space ("-") as the input to indicate that the actor doesn't have a website
										actor.setActorWebsite("-");
									} else //doesn't include any brackets since only one command is executed
										//case where the input is neither "yes", nor "no"
										System.out.println("Invalid input! Try again:");
								} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));
								//done after every new registration of a new actor, as per the instruction-manual
								//creates a random 6-digit id for the actor
								actor.setActorId(randomNum.nextInt(899999) + 100000);
								actorList.add(actor);
								movieActors.add(actor);
							} else {
								movieActors.add(newActorObj);
							}
							counter++;

							if (counter == 10) {
								System.out.println("You've entered 10 actors.");
								break;
							}
						} while (true); //infinite loop until 10 actors are added or the user enters 'QUIT'
						movie.setMovieActors(movieActors);
						System.out.println(movie.toString());
						movieList.add(movie);
						System.out.println("The movie was successfully added!"); //prints appropriate message

					} else { //case where the user's input was '2'

						Series series = new Series();
						//creates a random 6-digit id for the series
						series.setSeriesId(randomNum.nextInt(899999) + 100000);

						//requests and sets the series' title
						System.out.println("Enter the series' title:");
						String seriesTitle; //contains movies' title
						seriesTitle = usrInput.nextLine(); //accepts a single line of input from the user
						series.setSeriesTitle(seriesTitle);

						//requests and sets the series' year of release
						int rlsYear = invalidInput("Enter the series' year of release.\n");
						series.setSeriesYearOfRelease(rlsYear);

						//requests and sets the series' genre(s)
						System.out.println("Available genres:");
						//doesn't include any brackets since only one command is executed
						for (String s : genres)
							System.out.println(s);

						ArrayList<String> seriesTypes = new ArrayList<String>();

						int genresCounter = 0;
						System.out.println("There can only be up to 3 genres for each series.");
						while (genresCounter < 3) { //allows up to 3 genres
							System.out.println("To signal that you've completed writing the series' genre(s),"
									+ " you can simply enter \"QUIT\".");
							System.out.println("Write the genre(s) of the movie:");

							genre = usrInput.nextLine(); //accepts a single line of input from the user
							if (genre.equalsIgnoreCase("quit")) { //case where the user has entered "QUIT"
								System.out.println("You've entered \"QUIT\". Moving on to the next step...");
								break;
							}
							genresCounter++;
							seriesTypes.add(genre);
						}
						series.setSeriesTypes(seriesTypes);

						//requests and sets the series' country of origin
						System.out.println("Enter the series' country of origin:");
						countryOfOrigin = usrInput.nextLine(); //accepts a single line of input from the user
						series.setSeriesCountryOfOrigin(countryOfOrigin);

						//requests and sets the series director's full name
						System.out.println("Enter the series director's full name:");
						dirFullName = usrInput.nextLine(); //accepts a single line of input from the user
						series.setSeriesDirFullName(dirFullName);
						dirExist = false;
						for (Dir d : directorList) {
							if (d.getSeriesDirFullName().equalsIgnoreCase(dirFullName)) {
								dirExist = true; //case where the director already exists
								break;
							}
						}
						if (!dirExist) { //case where the director doesn't already exist
							Dir dir = new Dir(); //creates new object for the director
							dir.setSeriesDirFullName(dirFullName); //sets the director's full name

							//requests and sets the director's date of birth
							System.out.println("Enter the director's date of birth(DATE/MONTH/YEAR):");
							dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
							dir.setDirDateOfBirth(dateOfBirth);

							//requests and sets the director's country of birth
							System.out.println("Enter the director's country of birth:");
							countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
							dir.setDirCountryOfBirth(countryOfBirth);

							//requests and sets the director's website(if it exists, else puts "-" as the input)
							System.out.println("Enter whether the director has a website or not(yes/no):");
							do {
								websiteExist = usrInput.nextLine(); //accepts a single line of input from the user
								if (websiteExist.equals("yes")) {
									System.out.println("Enter the director's website:");
									website = usrInput.nextLine(); //accepts a single line of input from the user
									dir.setDirWebsite(website);
								} else if (websiteExist.equalsIgnoreCase("no")) {
									//puts the space ("-") as the input to indicate that the director doesn't have a website
									dir.setDirWebsite("-");
								} else //doesn't include any brackets since only one command is executed
									//case where the input is neither "yes", nor "no"
									System.out.println("Invalid input! Try again:");

							} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));

							//done after the registration of the director, as per the instruction-manual
							//creates a random 6-digit id for the director
							dir.setDirId(randomNum.nextInt(899999) + 100000);
							directorList.add(dir);
						}
						System.out.println("Enter the names of the actors participating in the series.");
						System.out.println("There can only be up to 10 actors.");
						System.out.println("To signal that you've completed adding the series' actors,"
								+ " you can simply enter \"QUIT\":");

						ArrayList<Actor> seriesActors = new ArrayList<Actor>();

						int counter = 0; //contains the amount of actors in a series(starting from 0)
						do {
							System.out.println("Enter the new actor's name:");
							newActor = usrInput.nextLine(); //accepts a single line of input from the user

							if (newActor.equalsIgnoreCase("quit")) {
								System.out.println("You've entered \"QUIT\". Moving on to the next step...");
								break;
							}
							actorExist = false;
							Actor newActorObj = null;
							for (Actor a : actorList) {
								//doesn't include any brackets since only one command is executed
								if (a.getActorFullName().equalsIgnoreCase(newActor)) {
									newActorObj = a;
									actorExist = true;
									break;
								}
							}
							if (!actorExist) { //case where the actor doesn't already exist

								System.out.println("Enter the names of the actors participating in the movie.");

								Actor actor = new Actor(); //creates new object for the actor
								actor.setActorFullName(newActor); //sets the actor's full name

								//requests and sets the actor's date of birth
								System.out.println("Enter the actor's date of birth(DATE/MONTH/YEAR):");
								//accepts a single line of input from the user
								dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
								actor.setActorDateOfBirth(dateOfBirth);

								//requests and sets the actor's country of birth
								System.out.println("Enter the actor's country of birth:");
								//accepts a single line of input from the user
								countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
								actor.setActorCountryOfBirth(countryOfBirth);


								//requests and sets the actor's website(if it exists, else puts "-" as the input)
								System.out.println("Enter whether the actor has a website or not(yes/no):");
								do {
									websiteExist = usrInput.nextLine(); //accepts a single line of input from the user

									if (websiteExist.equalsIgnoreCase("yes")) {
										System.out.println("Enter the actor's website:");
										website = usrInput.nextLine(); //accepts a single line of input from the user
										actor.setActorWebsite(website);
									} else if (websiteExist.equalsIgnoreCase("no")) {
										System.out.println("The actor does not have a website.");
										//puts the space ("-") as the input to indicate that the actor doesn't have a website
										actor.setActorWebsite("-");
									} else //doesn't include any brackets since only one command is executed
										//case where the input is neither "yes", nor "no"
										System.out.println("Invalid input! Try again:"); //informs the user their input is invalid

								} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));
								//done after every new registration of a new actor, as per the instruction-manual
								//creates a random 6-digit id for the actor
								actor.setActorId(randomNum.nextInt(899999) + 100000);
								actorList.add(actor);
								seriesActors.add(actor);
							} else {
								seriesActors.add(newActorObj);
							}
							counter++;

							if (counter == 10) {
								System.out.println("You've entered 10 actors. Moving on to the next step...");
								break;
							}

						} while (true); //infinite loop until 10 actors are added or the user enters 'QUIT'

						series.setSeriesActors(seriesActors);

						//requests and sets the seasons of the selected series
						int seasons = invalidInput("Enter the number of seasons the series has.\n");
						series.setNumOfSeasons(seasons);

						ArrayList<Integer> episodeList = new ArrayList<Integer>();

						for (int i = 0; i < seasons; i++) {
							episodes = invalidInput("Enter the number of episodes of season: " + (i + 1) + ".\n");
							episodeList.add(episodes);
						}
						series.setEpisodes(episodeList);
						System.out.println("Enter the year of the latest season:");
						lastYearSeason = usrInput.nextLine(); //accepts a single line of input from the user

						//doesn't include any brackets since only one command is executed
						if (lastYearSeason.equals("2023"))
							series.setLastYearSeason("-");

						series.setLastYearSeason(lastYearSeason);
						System.out.println(series.toString());
						seriesList.add(series);

						System.out.println("The series was successfully added!"); //prints appropriate message
					}
				}
				case 2 -> {
					int seasons;
					do {
						adminChoice = invalidInput("Do you want to access the series' information via its title(enter '1') or id(enter '2')?\n");
						if ((adminChoice != 1) && (adminChoice != 2))
							System.out.println("The integer must be either '1', or '2'.");

					} while ((adminChoice != 1) && (adminChoice != 2));
					if (adminChoice == 1) {
						System.out.println("Enter the series' title:");
						String seriesTitle; //contains movies' title
						seriesTitle = usrInput.nextLine(); //accepts a single line of input from the user

						Series seriesExist = null;
						for (Series s : seriesList) {
							if (s.getSeriesTitle().equalsIgnoreCase(seriesTitle)) {
								seriesExist = (Series) s; //casting to avoid any unpredictability
								break;
							}
						}
						if (seriesExist == null) {
							System.out.println("No series with this title exists."); //prints appropriate message
						} else {
							do {
								adminChoice = invalidInput("1. Change the number of seasons.\n2. Change the number of episodes in a season.\n" +
										"3. Change the year of the last screening.\nChoose from 1 to 3.\n");

								if ((adminChoice != 1) && (adminChoice != 2) && (adminChoice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'.");

							} while ((adminChoice != 1) && (adminChoice != 2) && (adminChoice != 3));

							if (adminChoice == 1) {

								seasons = invalidInput("Enter the updated number of seasons.\n");
								seriesExist.setNumOfSeasons(seasons);
							}
							if (adminChoice == 2) {
								ArrayList<Integer> newEpisodes = new ArrayList<Integer>();

								seasons = invalidInput("Enter the season's number of which you want to update the episodes.\n");

								episodes = invalidInput("Enter the updated number of episodes for season " + seasons + ".\n");

								newEpisodes = seriesExist.getEpisodes();
								newEpisodes.set(--seasons, episodes);
								seriesExist.setEpisodes(newEpisodes);
							}
							if (adminChoice == 3) {
								System.out.println("Enter the updated year of the last screening:");
								lastYearSeason = usrInput.nextLine(); //accepts a single line of input from the user
								seriesExist.setLastYearSeason(lastYearSeason);
							}
							System.out.println("Do you want to add actors to the series(yes/no)?");
							newActor = usrInput.nextLine(); //accepts a single line of input from the user

							while ((!newActor.equalsIgnoreCase("yes")) && (!newActor.equalsIgnoreCase("no"))) {
								System.out.println("Invalid input! Try again:"); //informs the user their input is invalid
								newActor = usrInput.nextLine(); //accepts a single line of input from the user
							}
							int size;
							size = (seriesExist.getSeriesActors().size()) + 1;
							if (size >= 10) {
								System.out.println("There can be no more than 10 actors."); //prints appropriate message
							} else {
								if (newActor.equalsIgnoreCase("yes")) {
									do {
										System.out.println("To signal that you've completed adding the movie's actors,"
												+ " you can simply enter \"QUIT\":");
										System.out.println("Enter the new actor's name:");
										newActor = usrInput.nextLine(); //accepts a single line of input from the user
										if (newActor.equalsIgnoreCase("quit")) {
											break;
										}
										actorExist = false;
										Actor actorFound = null;
										for (Actor a : actorList) {
											if (a.getActorFullName().equalsIgnoreCase(newActor)) {
												actorExist = true;
												actorFound = a;
												break;
											}
										}
										if (actorExist) {
											ArrayList<Actor> newActorList = new ArrayList<Actor>();
											newActorList = seriesExist.getSeriesActors();
											newActorList.add(actorFound);
											seriesExist.setSeriesActors(newActorList);
										} else {
											Actor actor = new Actor();
											actor.setActorFullName(newActor);
											actor.setActorId(randomNum.nextInt(899999) + 100000);
											System.out.println("Enter the actor's date of birth(DATE/MONTH/YEAR):");
											dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
											actor.setActorDateOfBirth(dateOfBirth);
											System.out.println("Enter the actor's country of birth:");
											countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
											actor.setActorCountryOfBirth(countryOfBirth);
											System.out.println("Enter whether the actor has a website(yes) or not(no):");
											do {
												websiteExist = usrInput.nextLine(); //accepts a single line of input from the user

												if (websiteExist.equalsIgnoreCase("yes")) {
													System.out.println("Enter the actor's website:");
													website = usrInput.nextLine(); //accepts a single line of input from the user
													actor.setActorWebsite(website);
												} else if (websiteExist.equalsIgnoreCase("no")) {
													System.out.println("The actor does not have a website.");
													//puts the space ("-") as the input to indicate that the actor doesn't have a website
													actor.setActorWebsite("-");
												} else //doesn't include any brackets since only one command is executed
													//case where the input is neither "yes", nor "no"
													System.out.println("Invalid input! Try again:"); //informs the user their input is invalid

											} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));
											//done after every new registration of a new actor, as per the instruction-manual
											//creates a random 6-digit id for the actor
											actor.setActorId(randomNum.nextInt(899999) + 100000);
											actorList.add(actor);
											ArrayList<Actor> newActorList = new ArrayList<Actor>();
											newActorList = seriesExist.getSeriesActors();
											newActorList.add(actor);
											seriesExist.setSeriesActors(newActorList);
										}
										size++;
										//doesn't include any brackets since only one command is executed
										if (size == 10)
											break;

									} while (!(newActor.equalsIgnoreCase("quit")));


								}
							}
						}
					} else {

						int id = invalidInput("Enter the series' id.\n");

						Series seriesExist = null;
						for (Series s : seriesList) {
							if (s.getSeriesId() == id) {
								seriesExist = (Series) s; //casting to avoid any unpredictability
								break;
							}
						}
						if (seriesExist == null) {
							System.out.println("A series with this id does not exist."); //prints appropriate message
						} else {
							do {
								adminChoice = invalidInput("1. Change the number of seasons.\n2. Change the number of episodes in a season.\n" +
										"3. Change the year of the last screening.\nChoose from 1 to 3.\n");

								if ((adminChoice != 1) && (adminChoice != 2) && (adminChoice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'.");

							} while ((adminChoice != 1) && (adminChoice != 2) && (adminChoice != 3));

							if (adminChoice == 1) {

								seasons = invalidInput("Enter the updated number of seasons.\n");
								seriesExist.setNumOfSeasons(seasons);
							}
							if (adminChoice == 2) {
								ArrayList<Integer> newEpisodes = new ArrayList<Integer>();

								seasons = invalidInput("Enter the season's number of which you want to update the episodes.\n");

								episodes = invalidInput("Enter the updated number of episodes for season: " + seasons + ".\n");

								newEpisodes = seriesExist.getEpisodes();
								newEpisodes.set(--seasons, episodes);
								seriesExist.setEpisodes(newEpisodes);
							}
							if (adminChoice == 3) {
								System.out.println("Enter the updated year of the last screening:");
								lastYearSeason = usrInput.nextLine(); //accepts a single line of input from the user
								seriesExist.setLastYearSeason(lastYearSeason);
							}
							System.out.println("Do you want to add actors to the series(yes/no)?");
							newActor = usrInput.nextLine(); //accepts a single line of input from the user

							while ((!newActor.equalsIgnoreCase("yes")) && (!newActor.equalsIgnoreCase("no"))) {
								System.out.println("Invalid input! Try again:"); //informs the user their input is invalid
								newActor = usrInput.nextLine(); //accepts a single line of input from the user
							}
							int size;
							size = (seriesExist.getSeriesActors().size()) + 1;
							if (size >= 10) {
								System.out.println("There can be no more than 10 actors."); //prints appropriate message
							} else {
								if (newActor.equalsIgnoreCase("yes")) {
									do {
										System.out.println("To signal that you've completed adding the movie's actors,"
												+ " you can simply enter \"QUIT\":");
										System.out.println("Enter the new actor's name:");
										newActor = usrInput.nextLine(); //accepts a single line of input from the user
										if (newActor.equalsIgnoreCase("quit")) {
											break;
										}
										actorExist = false;
										Actor actorFound = null;
										for (Actor a : actorList) {
											if (a.getActorFullName().equalsIgnoreCase(newActor)) {
												actorExist = true;
												actorFound = a;
												break;
											}
										}
										if (actorExist) {
											ArrayList<Actor> newActorList = new ArrayList<Actor>();
											newActorList = seriesExist.getSeriesActors();
											newActorList.add(actorFound);
											seriesExist.setSeriesActors(newActorList);
										} else {
											Actor actor = new Actor();
											actor.setActorFullName(newActor);

											//sets a random id for the actor
											actor.setActorId(randomNum.nextInt(899999) + 100000);

											//requests and sets the actor's date of birth
											System.out.println("Enter the actor's date of birth(DATE/MONTH/YEAR):");
											dateOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
											actor.setActorDateOfBirth(dateOfBirth);

											//requests and sets the actor's country of birth
											System.out.println("Enter the actor's country of birth:");
											countryOfBirth = usrInput.nextLine(); //accepts a single line of input from the user
											actor.setActorCountryOfBirth(countryOfBirth);

											System.out.println("Enter whether the actor has a website(yes) or not(no):");
											do {
												websiteExist = usrInput.nextLine(); //accepts a single line of input from the user

												if (websiteExist.equalsIgnoreCase("yes")) {
													System.out.println("Enter the actor's website:");
													website = usrInput.nextLine(); //accepts a single line of input from the user
													actor.setActorWebsite(website);
												} else if (websiteExist.equalsIgnoreCase("no")) {
													System.out.println("The actor does not have a website.");
													//puts the space ("-") as the input to indicate that the actor doesn't have a website
													actor.setActorWebsite("-");
												} else //doesn't include any brackets since only one command is executed
													//case where the input is neither "yes", nor "no"
													System.out.println("Invalid input! Try again:"); //informs the user their input is invalid

											} while (!(websiteExist.equalsIgnoreCase("yes")) && !(websiteExist.equalsIgnoreCase("no")));
											//done after every new registration of a new actor, as per the instruction-manual
											//creates a random 6-digit id for the actor
											actor.setActorId(randomNum.nextInt(899999) + 100000);
											actorList.add(actor);
											ArrayList<Actor> newActorList = new ArrayList<Actor>();
											newActorList = seriesExist.getSeriesActors();
											newActorList.add(actor);
											seriesExist.setSeriesActors(newActorList);
										}
										size++;
										//doesn't include any brackets since only one command is executed
										if (size == 10)
											break;

									} while (!(newActor.equalsIgnoreCase("quit")));


								}
							}
						}
					}
				}
				case 3 -> {
					do {
						choice = invalidInput("Do you want to search by title(1) or by year of first screening(2)?\n");

						if ((choice != 1) && (choice != 2))
							System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

					} while ((choice != 1) && (choice != 2));
					if (choice == 1) {
						System.out.println("Enter the title of a show to view its characteristics and rate it(optional).\n");
						String title = usrInput.nextLine(); //accepts a single line of input from the user

						Series seriesExist = null;
						Movie movieExist = null;

						for (Series s : seriesList) {

							if (s.getSeriesTitle().equalsIgnoreCase(title))
								seriesExist = s;

						}
						for (Movie m : movieList) {

							if (m.getMovieTitle().equalsIgnoreCase(title))
								movieExist = m;

						}
						if (seriesExist != null) {
							System.out.println("Series id: " + seriesExist.getSeriesId());
							System.out.println("Title: " + seriesExist.getSeriesTitle());
							System.out.println("Release Year: " + seriesExist.getSeriesYearOfRelease());
							System.out.println("Series Genres: " + seriesExist.getSeriesTypes());
							System.out.println("Director Name: " + seriesExist.getSeriesDirFullName());
							if (seriesExist.getLastYearSeason().equals("2023")) {
								System.out.println("Last Season Year: - .");
							}
							System.out.println("Number of Seasons: " + seriesExist.getNumOfSeasons());

							do {
								choice = invalidInput("1. Rate the series and register.\n2. View the series ratings.\n" +
										"3. View own ratings for all series.\nChoose from '1' to '3'.\n");

								if ((choice != 1) && (choice != 2) && (choice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'."); //prints appropriate message

							} while ((choice != 1) && (choice != 2) && (choice != 3));

							if (choice == 1) {
								do {
									choice = invalidInput("Sign in to rate(1)/register(2).\n");

									if ((choice != 1) && (choice != 2))
										System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

								} while ((choice != 1) && (choice != 2));

								if (choice == 1) {
									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user

									for (UserData u : userList) {
										if (u.getEmail().equals(email)) {
											System.out.println("Enter your password:");
											password = usrInput.nextLine(); //accepts a single line of input from the user

											if (u.getPassword().equals(password)) {
												do {
													rating = invalidInput("Enter your rating(1-10).\n");

													if ((rating < 1) || (rating > 10))
														System.out.println("The rating must be between 1 and 10 inclusively.");

												} while ((rating < 1) || (rating > 10));

												ArrayList<Series> userReviewedSeries = new ArrayList<Series>();
												ArrayList<Integer> userRatingSeries = new ArrayList<Integer>();
												if (!u.getReviewedSeries().isEmpty()) {
													userReviewedSeries = u.getReviewedSeries();
													userRatingSeries = u.getRatingSeries();
												}
												userReviewedSeries.add(seriesExist);
												u.setReviewedSeries(userReviewedSeries);
												userRatingSeries.add(rating);
												u.setRatingSeries(userRatingSeries);

												//prints appropriate message
												System.out.println("The rating for the series: " + seriesExist.getSeriesTitle()
																	+ " was successfully completed.");
											}
										}
									}
								} else {
									UserData newUser = new UserData();
									System.out.println("Register/Sign-up:");
									System.out.println("Enter your username:");
									username = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setUsername(username);

									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setEmail(email);

									System.out.println("Enter your password:");
									password = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setPassword(password);
									userList.add(newUser);

									System.out.println("Account creation completed.");
								}
							} else if (choice == 2) {
								boolean seriesFound = false;
								for (UserData u : userList) {
									for (int i = 0; i < u.getReviewedSeries().size(); i++) {
										if (u.getReviewedSeries().get(i).getSeriesTitle().equals(seriesExist.getSeriesTitle())) {
											System.out.println("Username: " + u.getUsername() + " Rating: " + u.getRatingSeries().get(i));
											seriesFound = true;
										}
									}
								}
								if (!seriesFound) {
									System.out.println("This series has no ratings.");
								}
							} else {
								System.out.println("Sign in:");
								System.out.println("Enter your email:");
								email = usrInput.nextLine(); //accepts a single line of input from the user

								boolean done = false;
								for (UserData u : userList) {
									if (u.getEmail().equals(email)) {
										done = true;

										System.out.println("Enter your password:");
										password = usrInput.nextLine(); //accepts a single line of input from the user
										if (u.getPassword().equals(password)) {
											for (int i = 0; i < u.getReviewedSeries().size(); i++) {
												System.out.println("Title: " + u.getReviewedSeries().get(i).getSeriesTitle() +
																	" Review: " + u.getRatingSeries().get(i));
											}
										} else {
											System.out.println("Invalid password!"); //informs the user their input is invalid
										}
									}
								}
								if (!done) {
									System.out.println("Invalid email!"); //informs the user their input is invalid
								}
							}
						} else if (movieExist != null) {

							System.out.println("Movie id: " + movieExist.getMovieId());
							System.out.println("Title: " + movieExist.getMovieTitle());
							System.out.println("Release Year: " + movieExist.getMovieYearOfRelease());
							System.out.println("Movie Genres: " + movieExist.getMovieType());
							System.out.println("Director Name: " + movieExist.getDirFullName());

							do {
								choice = invalidInput("1. Rate a movie and register.\n2. View a movie's rating.\n3. View own ratings.\n");

								if ((choice != 1) && (choice != 2) && (choice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'."); //prints appropriate message

							} while ((choice != 1) && (choice != 2) && (choice != 3));

							if (choice == 1) {
								do {
									choice = invalidInput("1. Sign in to rate.\n2. Register your account.\n");

									if ((choice != 1) && (choice != 2))
										System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

								} while ((choice != 1) && (choice != 2));

								if (choice == 1) {
									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user
									for (UserData u : userList) {
										if (u.getEmail().equals(email)) {

											System.out.println("Enter your password:");
											password = usrInput.nextLine(); //accepts a single line of input from the user
											if (u.getPassword().equals(password)) {

												do {
													rating = invalidInput("Enter your rating(1-10).\n");

													if ((rating < 1) || (rating > 10))
														System.out.println("The rating must be between 1 and 10 inclusively."); //prints appropriate message

												} while ((rating < 1) || (rating > 10));

												ArrayList<Movie> userReviewedMovies = new ArrayList<Movie>();
												ArrayList<Integer> userRatingMovies = new ArrayList<Integer>();
												if (!u.getReviewedMovies().isEmpty()) {
													userReviewedMovies = u.getReviewedMovies();
													userRatingMovies = u.getRatingMovies();
												}
												userReviewedMovies.add(movieExist);
												u.setReviewedMovies(userReviewedMovies);
												userRatingMovies.add(rating);
												u.setRatingMovies(userRatingMovies);

												//prints appropriate message
												System.out.println("The rating of the movie: " + movieExist.getMovieTitle() +
																	" was successfully completed.");
											}
										}
									}
								} else {
									UserData newUser = new UserData();

									System.out.println("Register/Sign-up:");
									System.out.println("Enter your username:");
									username = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setUsername(username);

									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setEmail(email);

									System.out.println("Enter your password:");
									password = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setPassword(password);
									userList.add(newUser);

									System.out.println("Account creation completed."); //prints appropriate message
								}
							} else if (choice == 2) {

								boolean movieFound = false;
								for (UserData u : userList) {
									for (int i = 0; i < u.getReviewedMovies().size(); i++) {
										if (u.getReviewedMovies().get(i).getMovieTitle().equals(movieExist.getMovieTitle())) {
											System.out.println("Username: " + u.getUsername() + " Rating: " + u.getRatingMovies().get(i));
											movieFound = true;
										}
									}
								}
								if (!movieFound) {
									System.out.println("This movie has no ratings.");
								}
							} else {
								System.out.println("Sign in:");
								System.out.println("Enter your email:");
								email = usrInput.nextLine(); //accepts a single line of input from the user

								boolean done = false;
								for (UserData u : userList) {
									if (u.getEmail().equals(email)) {
										done = true;

										System.out.println("Enter your password:");
										password = usrInput.nextLine(); //accepts a single line of input from the user

										if (u.getPassword().equals(password)) {
											for (int i = 0; i < u.getReviewedMovies().size(); i++) {
												System.out.println("Title: " + u.getReviewedMovies().get(i).getMovieTitle() +
																	" Review: " + u.getRatingMovies().get(i));
											}
										} else {
											System.out.println("Invalid password!"); //informs the user their input is invalid
										}
									}
								}
								if (!done) {
									System.out.println("Invalid email!"); //informs the user their input is invalid
								}
							}
						} else if (seriesExist == null && movieExist == null) {
							System.out.println("There are no shows with this title."); //prints appropriate message
						}
					} else {

						int rlsYear = invalidInput("Enter the first year of the show's screening to view its characteristics and rate it(optional).\n");

						Series seriesExist = null;
						Movie movieExist = null;

						for (Series s : seriesList) {
							if (s.getSeriesYearOfRelease() == rlsYear) {
								seriesExist = s;
							}
						}
						for (Movie m : movieList) {
							if (m.getMovieYearOfRelease() == rlsYear) {
								movieExist = m;
							}
						}
						if (seriesExist != null) {
							System.out.println("Series id: " + seriesExist.getSeriesId());
							System.out.println("Title: " + seriesExist.getSeriesTitle());
							System.out.println("Release Year: " + seriesExist.getSeriesYearOfRelease());
							System.out.println("Series Genres: " + seriesExist.getSeriesTypes());
							System.out.println("Director Name: " + seriesExist.getSeriesDirFullName());
							if (seriesExist.getLastYearSeason().equals("2023")) {
								System.out.println("Last Season Year: -");
							}
							System.out.println("Number of Seasons: " + seriesExist.getNumOfSeasons());

							do {
								choice = invalidInput("1. Rate the series and register.\n2. View the series ratings.\n" +
										"3. View own ratings for all series.\nChoose from '1' to '3'.\n");

								if ((choice != 1) && (choice != 2) && (choice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'."); //prints appropriate message

							} while ((choice != 1) && (choice != 2) && (choice != 3));

							if (choice == 1) {
								do {
									choice = invalidInput("Sign in to rate(1)/register your account(2).\n");

									if ((choice != 1) && (choice != 2))
										System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

								} while ((choice != 1) && (choice != 2));

								if (choice == 1) {
									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user

									for (UserData u : userList) {
										if (u.getEmail().equals(email)) {
											System.out.println("Enter your password:");
											password = usrInput.nextLine(); //accepts a single line of input from the user

											if (u.getPassword().equals(password)) {
												do {
													rating = invalidInput("Enter your rating(1-10).\n");

													if ((rating < 1) || (rating > 10))
														System.out.println("The rating must be between 1 and 10 inclusively."); //prints appropriate message

												} while ((rating < 1) || (rating > 10));

												ArrayList<Series> userReviewedSeries = new ArrayList<Series>();
												ArrayList<Integer> userRatingSeries = new ArrayList<Integer>();
												if (!u.getReviewedSeries().isEmpty()) {
													userReviewedSeries = u.getReviewedSeries();
													userRatingSeries = u.getRatingSeries();
												}
												userReviewedSeries.add(seriesExist);
												u.setReviewedSeries(userReviewedSeries);
												userRatingSeries.add(rating);
												u.setRatingSeries(userRatingSeries);

												//prints appropriate message
												System.out.println("The rating for the series: " + seriesExist.getSeriesTitle() +
																	" was successfully completed.");
											}
										}
									}
								} else {
									UserData newUser = new UserData();
									System.out.println("Register/Sign-up:");
									System.out.println("Enter your username:");
									username = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setUsername(username);

									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setEmail(email);

									System.out.println("Enter your password:");
									password = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setPassword(password);
									userList.add(newUser);

									System.out.println("Account creation completed."); //prints appropriate message
								}
							} else if (choice == 2) {
								boolean seriesFound = false;
								for (UserData u : userList) {
									for (int i = 0; i < u.getReviewedSeries().size(); i++) {
										if (u.getReviewedSeries().get(i).getSeriesYearOfRelease() == seriesExist.getSeriesYearOfRelease()) {
											System.out.println("Username: " + u.getUsername() + " Rating: " + u.getRatingSeries().get(i));
											seriesFound = true;
										}
									}
								}
								if (!seriesFound) {
									System.out.println("This series has no ratings."); //prints appropriate message
								}
							} else {
								System.out.println("Sign in:");
								System.out.println("Enter your email:");
								email = usrInput.nextLine(); //accepts a single line of input from the user

								boolean done = false;
								for (UserData u : userList) {
									if (u.getEmail().equals(email)) {
										done = true;

										System.out.println("Enter your password:");
										password = usrInput.nextLine(); //accepts a single line of input from the user
										if (u.getPassword().equals(password)) {
											for (int i = 0; i < u.getReviewedSeries().size(); i++) {
												System.out.println("Title: " + u.getReviewedSeries().get(i).getSeriesTitle() +
														"Review: " + u.getRatingSeries().get(i));
											}
										} else {
											System.out.println("Invalid password!"); //informs the user their input is invalid
										}
									}
								}
								if (!done) {
									System.out.println("Invalid email!"); //informs the user their input is invalid
								}
							}
						} else if (movieExist != null) {

							System.out.println("Movie id: " + movieExist.getMovieId());
							System.out.println("Title: " + movieExist.getMovieTitle());
							System.out.println("Release Year: " + movieExist.getMovieYearOfRelease());
							System.out.println("Movie Genres: " + movieExist.getMovieType());
							System.out.println("Director Name: " + movieExist.getDirFullName());

							do {
								choice = invalidInput("1. Rate a movie and register.\n2. View a movie's rating.\n3. View own ratings.\n");

								if ((choice != 1) && (choice != 2) && (choice != 3))
									System.out.println("The integer must be either '1', or '2', or '3'."); //prints appropriate message

							} while ((choice != 1) && (choice != 2) && (choice != 3));

							if (choice == 1) {
								do {
									choice = invalidInput("1. Sign in to rate.\n2. Register/Sign-up.\n");

									if ((choice != 1) && (choice != 2))
										System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

								} while ((choice != 1) && (choice != 2));

								if (choice == 1) {
									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user

									for (UserData u : userList) {
										if (u.getEmail().equals(email)) {

											System.out.println("Enter your password:");
											password = usrInput.nextLine(); //accepts a single line of input from the user

											if (u.getPassword().equals(password)) {

												do {
													rating = invalidInput("Enter your rating(1-10).\n");

													if ((rating < 1) || (rating > 10))
														System.out.println("The rating must be between 1 and 10 inclusively."); //prints appropriate message

												} while ((rating < 1) || (rating > 10));

												ArrayList<Movie> userReviewedMovies = new ArrayList<Movie>();
												ArrayList<Integer> userRatingMovies = new ArrayList<Integer>();
												if (!u.getReviewedMovies().isEmpty()) {
													userReviewedMovies = u.getReviewedMovies();
													userRatingMovies = u.getRatingMovies();
												}
												userReviewedMovies.add(movieExist);
												u.setReviewedMovies(userReviewedMovies);
												userRatingMovies.add(rating);
												u.setRatingMovies(userRatingMovies);
												System.out.println("The rating of the movie: " + movieExist.getMovieTitle() +
																	" was successfully completed.");
											}
										}
									}
								} else {

									UserData newUser = new UserData();

									System.out.println("Register/Sign-in:");
									System.out.println("Enter your username:");
									username = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setUsername(username);

									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setEmail(email);

									System.out.println("Enter your password:");
									password = usrInput.nextLine(); //accepts a single line of input from the user
									newUser.setPassword(password);
									userList.add(newUser);

									System.out.println("Account creation completed.");
								}
							} else if (choice == 2) {
								boolean movieFound = false;
								for (UserData u : userList) {
									for (int i = 0; i < u.getReviewedMovies().size(); i++) {
										if (u.getReviewedMovies().get(i).getMovieTitle().equals(movieExist.getMovieTitle())) {
											System.out.println("Username: " + u.getUsername() + " Rating: " + u.getRatingMovies().get(i));
											movieFound = true;
										}
									}
								}
								if (!movieFound) {
									System.out.println("This movie has no ratings."); //prints appropriate message
								}
							} else {
								System.out.println("Sign in:");
								System.out.println("Enter your email:");
								email = usrInput.nextLine(); //accepts a single line of input from the user

								boolean done = false;
								for (UserData u : userList) {
									if (u.getEmail().equals(email)) {
										done = true;

										System.out.println("Enter your password:");
										password = usrInput.nextLine(); //accepts a single line of input from the user

										if (u.getPassword().equals(password)) {
											for (int i = 0; i < u.getReviewedMovies().size(); i++) {
												System.out.println("Title: " + u.getReviewedMovies().get(i).getMovieTitle() +
																" Review: " + u.getRatingMovies().get(i));
											}
										} else {
											System.out.println("Invalid password!"); //informs the user their input is invalid
										}
									}
								}
								if (!done) {
									System.out.println("Invalid email!"); //informs the user their input is invalid
								}
							}
						} else if (seriesExist == null && movieExist == null) {
							System.out.println("There are no shows with this title."); //prints appropriate message
						}
					}
				}
				case 4 -> {
					do {
						choice = invalidInput("1. Add an actor/director to \"Favourites\".\n2. View \"Favourites\".\nChoose either '1' or '2'.\n");

						if ((choice != 1) && (choice != 2))
							System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

					} while ((choice != 1) && (choice != 2));
					if (choice == 1) {

						do {
							choice = invalidInput("1. View a director's characteristics.\n2. View an actor's characteristics.\nChoose either '1' or '2'.\n");

							if ((choice != 1) && (choice != 2))
								System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

						} while ((choice != 1) && (choice != 2));

						if (choice == 1) {

							System.out.println("Enter the full name of the director you're looking for:");
							username = usrInput.nextLine(); //accepts a single line of input from the user

							String directorFoundName = null;
							int directorFoundId = 0;

							ArrayList<String> dirShows = new ArrayList<>();

							for (Movie h : movieList) {
								if (h.getDirFullName().equalsIgnoreCase(username)) {
									for (Dir i : directorList) {
										if (i.getDirFullName().equalsIgnoreCase(h.getDirFullName())) {
											directorFoundId = i.getDirId();
										}
									}
									directorFoundName = h.getDirFullName();
									dirShows.add(h.getMovieTitle());
								}
							}
							for (Series h : seriesList) {
								if (h.getDirFullName().equalsIgnoreCase(username)) {
									for (Dir i : directorList) {
										if (i.getDirFullName().equalsIgnoreCase(h.getDirFullName())) {
											directorFoundId = i.getDirId();
										}
									}
									directorFoundName = h.getDirFullName();
									dirShows.add(h.getSeriesTitle());
								}
							}
							if (dirShows.isEmpty()) {
								System.out.println("This name doesn't match any directors."); //prints appropriate message
							} else {
								System.out.println("Director: ");
								System.out.println("Id: " + directorFoundId);
								System.out.println("Full Name: " + directorFoundName);
								System.out.println("Shows:");

								for (String s : dirShows)
									System.out.println(s);

								do {
									choice = invalidInput("If you want to add this director to \"Favourites\", enter '1', if not enter '2'.\n");

									if ((choice != 1) && (choice != 2))
										System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

								} while ((choice != 1) && (choice != 2));

								if (choice == 1) {
									System.out.println("Sign in:");
									System.out.println("Enter your email:");
									email = usrInput.nextLine(); //accepts a single line of input from the user

									boolean done = false;
									for (UserData k : userList) {
										if (k.getEmail().equals(email)) {
											done = true;
											System.out.println("Enter your password:");
											password = usrInput.nextLine(); //accepts a single line of input from the user

											if (k.getPassword().equals(password)) {
												ArrayList<String> faveDirectors = new ArrayList<String>();
												if (!k.getFaveDirectors().isEmpty()) {
													faveDirectors = k.getFaveDirectors();
												}
												faveDirectors.add(directorFoundName);
												k.setFaveDirectors(faveDirectors);
												System.out.println("The director: " + directorFoundName + " has been successfully added.");
											} else {
												System.out.println("Invalid password!"); //informs the user their input is invalid
											}
										}
									}
									if (!done) {
										System.out.println("Invalid email!"); //informs the user their input is invalid
									}
								}
							}
						} else {
							System.out.println("Enter the Full Name of the actor you're looking for:");
							username = usrInput.nextLine(); //accepts a single line of input from the user

							String actorFoundName = null;
							int actorFoundId = 0;

							ArrayList<String> actorShows = new ArrayList<>();

							for (Movie h : movieList) {
								for (Actor j : h.getMovieActors()) {
									if (j.getActorFullName().equalsIgnoreCase(username)) {
										actorFoundName = j.getActorFullName();
										actorFoundId = j.getActorId();
										actorShows.add(h.getMovieTitle());
										break;
									}
								}
							}
							for (Series h : seriesList) {
								for (Actor j : h.getSeriesActors()) {
									if (j.getActorFullName().equalsIgnoreCase(username)) {
										actorFoundName = j.getActorFullName();
										actorFoundId = j.getActorId();
										actorShows.add(h.getSeriesTitle());
										break;
									}
								}
							}
							if (actorShows.isEmpty()) {
								System.out.println("This name doesn't match any actors."); //prints appropriate message
							} else {
								System.out.println("Actor: ");
								System.out.println("Id: " + actorFoundId);
								System.out.println("Full Name: " + actorFoundName);
								System.out.println("Shows:");

								for (String s : actorShows)
									System.out.println(s);

							}

							do {
								choice = invalidInput("If you want to add this actor to \"Favourites\", enter '1', if not enter '2'.\n");

								if ((choice != 1) && (choice != 2))
									System.out.println("The integer must be either '1', or '2'."); //prints appropriate message

							} while ((choice != 1) && (choice != 2));

							if (choice == 1) {

								System.out.println("Sign in:");
								System.out.println("Enter your email:");
								email = usrInput.nextLine(); //accepts a single line of input from the user

								boolean done = false;
								for (UserData l : userList) {
									if (l.getEmail().equals(email)) {
										done = true;

										System.out.println("Enter your password:");
										password = usrInput.nextLine(); //accepts a single line of input from the user

										if (l.getPassword().equals(password)) {
											ArrayList<String> faveActors = new ArrayList<String>();
											if (!l.getFaveActors().isEmpty()) {
												faveActors = l.getFaveActors();
											}
											faveActors.add(actorFoundName);
											l.setFaveActors(faveActors);
											System.out.println("The actor: " + actorFoundName + " has been successfully added.");
										} else {
											System.out.println("Invalid password!"); //informs the user their input is invalid
										}
									}
								}
								if (!done) {
									System.out.println("Invalid email!"); //informs the user their input is invalid
								}
							}
						}
					} else {
						System.out.println("Sign in:");
						System.out.println("Enter your email:");
						email = usrInput.nextLine(); //accepts a single line of input from the user

						boolean done = false;
						for (UserData k : userList) {
							if (k.getEmail().equals(email)) {
								done = true;

								System.out.println("Enter your password:");
								password = usrInput.nextLine(); //accepts a single line of input from the user

								if (k.getPassword().equals(password)) {
									System.out.println("Favourite actors:");
									if (k.getFaveActors().isEmpty()) {
										System.out.println("None have been added.");
									} else {
										for (int i = 0; i < k.getFaveActors().size(); i++) {
											System.out.println("\t" + k.getFaveActors().get(i));
										}
									}
									System.out.println("Favourite directors:");
									if (k.getFaveDirectors().isEmpty()) {
										System.out.println("None have been added.");
									} else {
										for (int i = 0; i < k.getFaveDirectors().size(); i++) {
											System.out.println("\t" + k.getFaveDirectors().get(i));
										}
									}
								} else {
									System.out.println("Invalid password!"); //informs the user their input is invalid
								}
							}
						}
						if (!done) {
							System.out.println("Invalid email!"); //informs the user their input is invalid
						}
					}
				}
				case 5 -> System.out.println("You've chosen to quit.\nExiting...");
				default -> {
					System.out.println("Invalid input!"); //informs the user their input is invalid
					System.out.println("You can only choose from 1 to 5.");
				}
			}
			
		} while (choice != 5);
		usrInput.close(); //closes the usrInput scanner to prevent any 'Resource leaks' from happening
	}
}
