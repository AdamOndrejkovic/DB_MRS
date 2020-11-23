package system.bll;

import system.be.Movie;
import system.dal.MovieDB;

import java.util.List;

public class MovieManager {
    private MovieDB movieDB = new MovieDB();
    public void addMovie(String name, int year) {
        movieDB.addMovie(name, year);
    }



    public List<Movie> getAllMovies() {

       return movieDB.getAllMovies();
    }
}
