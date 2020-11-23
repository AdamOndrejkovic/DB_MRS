package system.gui.control;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RegisterUser{

    //variable to store the answer

    static String[] text = new String[2];

    public static String[] display(String title, String message){
        Stage window = new Stage();

        //blocking other windows usage if this window is open
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle(title);

        Label label = new Label();
        label.setText(message);

        //two buttons

        Label label1 = new Label("Enter user name");
        TextField userName = new TextField();
        Label label2 = new Label("Enter password");
        TextField userPass = new TextField();

        Button add = new Button("Add");

        add.setOnAction(e -> {

            if(userName.getText() != null && userPass.getText() != null &&  userName.getText() != "" && userPass.getText() != ""){
                text[0] = userName.getText();
                text[1] = userPass.getText();
            }else{
                text[0] = "Empty";
                text[1] = null;
            }



            window.close();

        });



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(label,label1,userName,label2,userPass,add);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

        return text;
    }
}

