package system.gui.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import system.gui.model.LogInModel;
import system.gui.model.RegisterModel;

import java.io.IOException;
import java.util.EventObject;

public class LogCotroller {
    @FXML
    TextField nameTxt;

    @FXML
    TextField passTxt;

    @FXML
    Button registerBtn;

    Stage window = new Stage();

    public LogInModel logInModel = new LogInModel();
    public RegisterUser registerUser = new RegisterUser();
    public RegisterModel registerModel = new RegisterModel();

    public void registerBtn() {
        registerBtn.setOnAction(e -> {
            String[] result = registerUser.display("Register New User","Fill the fields to register");
            if(result != null){
                String userName = result[0];
                String userPass = result[1];
                registerModel.addUser(userName,userPass);
            }

        });

    }

    public void logInBtn() {
        if(nameTxt.getText() != null && passTxt.getText() != null &&  nameTxt.getText() != "" && passTxt.getText() != ""){
            if(logInModel.checkLog(nameTxt.getText(), passTxt.getText())) {
                System.out.println("True");


                try {

                    Parent root = FXMLLoader.load(getClass().getResource("/system/gui/view/main.fxml"));
                    window.setTitle("Movie Recommendation system");
                    window.setScene(new Scene(root, 400, 400));
                    window.show();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }else {
                System.out.println("False");
            }


        }else{
            System.out.println("Fill all the fields");
        }

//        if((userName != "" && userPass != "")){
//            System.out.println("Hi");
//            logInModel.checkLog(userName, userPass);
//        }else{
//            System.out.println("Empty input");
//        }

    }
}
