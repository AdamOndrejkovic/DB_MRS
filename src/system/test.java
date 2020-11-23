package system;

import system.dal.Connection;
import system.gui.model.LogInModel;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    private static Connection conn;
    private static LogInModel logInModel;


    public static void main(String[] args) {
        String userName = "Adam";
        String userPass = "1234";

        logInModel.checkLog(userName, userPass);
    }



}
