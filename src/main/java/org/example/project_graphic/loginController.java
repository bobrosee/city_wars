package org.example.project_graphic;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController{
    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    Button exit;
    @FXML
    Button loginbtn;
    @FXML
    Label label;
    @FXML
    Button showinfo;
    @FXML
    public void setExit()throws IOException{
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) loginbtn.getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);

            // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void setLoginbtn(){
        for (int i = 0; i < User.users.size(); i++) {
            if(User.users.get(i).getUsername().equals(username.textProperty().get()))
            {
                if(User.users.get(i).getPassword().equals(password.textProperty().get()))
                {
                    User.logged = i;
                    User.users.get(i).login = true;
                    label.setText("Logged in successfully!");
                    label.setStyle("-fx-text-fill: green");
                }
                else{
                    label.setText("Password is incorrect");
                    label.setStyle("-fx-text-fill: red");
                    return;
                }
            }
        }
        if(User.logged != -1)
        {
            try {
                // Load the new scene
                Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

                // Create a new scene with the loaded parent
                Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                // Get the current stage
                Stage stage = (Stage) loginbtn.getScene().getWindow();

                // Set the new scene on the stage
                stage.setScene(scene);

                // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            label.setText("Username is incorrect");
            label.setStyle("-fx-text-fill: red");
        }
    }







}
