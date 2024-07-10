package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class player1CharController implements Initializable {

    @FXML
     ImageView laura;

    @FXML
     ImageView max;

    @FXML
     ImageView steven;

    @FXML
     ImageView uma;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Image image = new Image("file:G:/characters/Uma.jpg");
                uma.setImage(image);
                image = new Image("file:G:/characters/steven.png");
                steven.setImage(image);
                image = new Image("file:G:/characters/max.jpg");
                max.setImage(image);
                image = new Image("file:G:/characters/laura.jpg");
                laura.setImage(image);
            }
        });
    }
    @FXML
    public void setLaura(){
        gameController.character1 = 4;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("secondPlayerCharacter.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) uma.getScene().getWindow();

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
    public void setMax(){
        gameController.character1 = 3;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("secondPlayerCharacter.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) uma.getScene().getWindow();

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
    public void setSteven(){
        gameController.character1 = 1;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("secondPlayerCharacter.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) uma.getScene().getWindow();

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
    public void setUma(){
        gameController.character1 = 2;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("secondPlayerCharacter.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) uma.getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);

            // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
