package org.example.project_graphic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class secondLoginController {
    @FXML
    Button login;
    @FXML
    TextField username, password;
    @FXML
    Label message;
    @FXML
    public void setLogin(){
        for (int i = 0; i < User.users.size(); i++) {
            if (User.users.get(i).getUsername().equals(username.textProperty().get())) {
                if (User.users.get(i).getPassword().equals(password.textProperty().get())) {
                    User.Log2 = i;
                    User.users.get(i).login = true;
                    message.textProperty().setValue("Logged in successfully!");
                    message.setStyle("-fx-text-fill: green");
                }
                else {
                    message.textProperty().setValue("Password is incorrect");
                    message.setStyle("-fx-text-fill: red");
                    return;
                }
            }
        }
        if(User.Log2 != -1)
        {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("firstPlayerCharacter.fxml"));

                if(gameController.mode)
                {
                    root = FXMLLoader.load(getClass().getResource("gamblingMode.fxml"));
                }
                // Create a new scene with the loaded parent
                Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                // Get the current stage
                Stage stage = (Stage) login.getScene().getWindow();

                // Set the new scene on the stage
                stage.setScene(scene);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
            message.textProperty().setValue("Username is incorrect");
            message.setStyle("-fx-text-fill: red");
        }

    }
}
