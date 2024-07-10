package org.example.project_graphic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class gamblingController {
    @FXML
    TextField coins;
    @FXML
    Button confirm;
    @FXML
    Label message;
    static int coin;
    @FXML
    public void setConfirm(){
        coin = Integer.parseInt(coins.textProperty().get());
        if(User.users.get(User.logged).coins > coin && User.users.get(User.Log2).coins > coin)
        {
            try {
                // Load the new scene
                Parent root = FXMLLoader.load(getClass().getResource("firstPlayerCharacter.fxml"));

                // Create a new scene with the loaded parent
                Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                // Get the current stage
                Stage stage = (Stage) confirm.getScene().getWindow();

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
            message.setText("One of you is too poor!");
            message.setStyle("-fx-text-fill: red");
        }
    }
}
