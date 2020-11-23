package system.dal;


import system.be.Movie;
import system.gui.control.MainController;

import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MovieDB {

    private final static String DB_PATH = "jdbc:sqlite:C:\\Users\\adamo\\IdeaProjects\\DB_MRS\\moviesys.db";

    public void addMovie(String name, int year) {

        try(Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();){

            statement.execute("INSERT INTO movie (name, year) VALUES ('"+ name +"', '"+ year +"')");

        }catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println(throwables.getMessage());
        }
    }

    public List<Movie> getAllMovies() {

        List<Movie> allMovies = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();) {

            statement.execute("SELECT name, year FROM movie");
            ResultSet results = statement.getResultSet();

                while (results.next()) {

                    try
                    {
                        int id = results.getInt("id");
                        String name = results.getString("name");
                        int year = results.getInt("year");

                        Movie movie = stringArrayToMovie(id,name,year);
                        allMovies.add(movie);

                    } catch (Exception ex)
                    {
                        //Do nothing we simply do not accept malformed lines of data.
                        //In a perfect world you should at least log the incident.
                    }

                }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return allMovies;

    }

    public Movie stringArrayToMovie(int id, String title, int year)
    {
        try{
            Movie movie = new Movie(id,title,year);
            return movie;

        }catch (Exception e){
            System.out.println("No movie");
        }
        return null;

    }
}
