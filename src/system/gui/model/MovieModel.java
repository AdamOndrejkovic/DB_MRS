package system.gui.model;

import system.be.Movie;
import system.bll.MovieManager;

import java.util.List;

public class MovieModel {

    private MovieManager movieManager = new MovieManager();

    public void addMovie(String name, int year) {
        movieManager.addMovie(name, year);
    }

    public List<Movie> getAllMovies() {

        return movieManager.getAllMovies();


    }
}
