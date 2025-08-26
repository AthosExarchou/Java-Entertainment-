# JavaEntertainment

Developed as a project for the **object-oriented programming** course at [Harokopio University of Athens – Dept. of Informatics and Telematics](https://www.dit.hua.gr), JavaEntertainment is a simple **object-oriented Java application** that models a small-scale entertainment management system.
It allows the storage, retrieval, and evaluation of shows (movies, series, and mini-series) along with their contributors (actors and directors).  
The project was designed to practice and demonstrate core **OOP principles**, including:

- **Encapsulation** – grouping related data and methods inside classes such as `Movie`, `Series`, `Actor`, `Director`, and `User`.
- **Inheritance & Polymorphism** – modeling relationships between shows (`Series` and `MiniSeries` extending `Movie`) and enabling flexible code reuse.
- **Collections & Data Structures** – managing lists of genres, actors, episodes, and user ratings efficiently.
- **Object Interaction** – linking entities together (e.g., users rating movies, directors associated with shows, favorite actors).
- **User Interaction & Validation** – simulating administrative operations (insert/update shows) and viewer operations (search, rate, manage favorites).

## Features

- **Actors & Directors**
  - Store full name, date of birth, country of birth, and website
- **Movies**
  - Title, year of first screening, genres (drama, comedy, thriller, romance, horror, crime, etc.), country of production, director, and associated actors
- **Series & Mini-Series**
  - Inherits from `Movie`  
  - Adds seasons, episodes per season, and last aired year (or `-` if still ongoing)
- **User Management**
  - Register with name, email, password
  - Login (sign in) functionality
  - Rate movies and series (1–10)
  - View all personal ratings
  - Favorite actors and directors list
- **Admin Functions**
  - Insert new shows, actors, and directors
  - Update shows (add actors, change seasons, episodes, etc.)
- **Search Functions**
  - Search shows by title or year
  - Search actors/directors by name
  - See ratings, average scores, and favorite contributors

## Example of Use

```java
ArrayList<String> genres = new ArrayList<>();
genres.add("Drama");
genres.add("Crime");

ArrayList<Actor> actors = new ArrayList<>();
actors.add(new Actor("John Doe", "1985-06-15", "USA", "http://johndoe.com", 1));

Movie movie = new Movie(
    "The Great Mystery",
    2023,
    genres,
    "USA",
    "Jane Smith",
    actors,
    101
);

System.out.println(movie);
```

Output:
```
Id: 101
Title: The Great Mystery
Genre: [Drama, Crime]
Type: Movie
Director name: Jane Smith
```

## Areas for Improvement

- Database integration (JDBC, JPA, or Hibernate)
- REST API with Spring Boot
- Unit tests with JUnit
- Console or GUI application
- Improved authentication (password hashing, sessions)

## Author

- **Name**: Exarchou Athos
- **Student ID**: it2022134
- **Email**: it2022134@hua.gr, athosexarhou@gmail.com

## License

This project is licensed under the MIT License.
