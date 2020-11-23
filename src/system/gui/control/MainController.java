package system.gui.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import system.be.Movie;
import system.dal.MovieDB;
import system.gui.model.MovieModel;

import java.io.IOException;

public class MainController {

    private MovieModel movieModel = new MovieModel();

    @FXML
    TextField addName;

    @FXML
    TextField addYear;

    @FXML
    private ListView<Movie> lstMovie;

    public ListView listOfAllMovies;


    public void addMovie() {
        movieModel.addMovie(addName.getText(), Integer.parseInt(addYear.getText()));
        addName.clear();
        addYear.clear();
        
    }

    public void updateMovie(ActionEvent event) {
    }

    public void deleteMovie(ActionEvent event) {

    }
    
    public void getAllMovies(){

            lstMovie.getItems().clear();

            try {
                MovieDB movieDB = new MovieDB();

                for(Movie movieList : movieDB.getAllMovies())
                {
                    System.out.println(movieList.getId());
                    lstMovie.getItems().add(movieList);
                    lstMovie.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
