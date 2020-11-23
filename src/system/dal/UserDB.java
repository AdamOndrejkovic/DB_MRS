package system.dal;

import java.sql.*;
import java.sql.Connection;


public class UserDB {
    private static final String DB_PATH = "jdbc:sqlite:C:\\Users\\adamo\\IdeaProjects\\DB_MRS\\moviesys.db";


    public boolean checkUser(String userName, String userPass) {
        boolean found = false;
        try {
            Connection conn = DriverManager.getConnection(DB_PATH);
            Statement statement = conn.createStatement();

            statement.execute("SELECT * FROM user WHERE name = '"+userName+"' AND pass ='"+ userPass +"'");

            ResultSet resultSet = statement.getResultSet();
            if(resultSet != null){
                while (resultSet.next()){
                    found =  true;
                }
            }
            else{
                System.out.println("Not Found");
                found = false;
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
            found = false;
        }
        return found;
    }

    public void addUser(String user, String password) {
        try(Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();){

            statement.execute("INSERT INTO user (name, pass ) VALUES ('" + user + "', '"+ password +"')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
