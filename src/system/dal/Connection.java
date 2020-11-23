package system.dal;

import java.sql.*;

public class Connection {


    public void connDB(){
        try{
            java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\adamo\\IdeaProjects\\ConsoleDBM\\mrs.db");
            System.out.println("Connection succesful");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    private void connDB(){
//        try{
//            //connect
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\adamo\\IdeaProjects\\ConsoleDBM\\warehouse.db");
//            System.out.println("Connection succesful");
//
//        }catch (SQLException e){
//            System.out.println("Something went wrong + " + " " + e.getMessage());
//        }
//    }
}
