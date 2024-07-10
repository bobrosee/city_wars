package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloController {
    @FXML
    Button exit;
    @FXML
    Button login;
    @FXML
    Button signup;
    @FXML
    public void setExit() throws SQLException {
        Platform.exit();
        for(int i = 0; i< User.users.size();i++)
        {
            HelloApplication.Connect.UpdateWallet(User.users.get(i).getUsername(),User.users.get(i).getLevel(),User.users.get(i).coins,User.users.get(i).getXp());
        }
        for (User user : User.users) {
            String OwnedCards = "";
            for (int i = 0; i < user.cards.size();i++) {
                OwnedCards += user.cards.get(i).number;
                if(i!=(user.cards.size()-1))
                {
                    OwnedCards += "-";
                }
            }
            if(!user.cards.isEmpty()) {
                HelloApplication.Connect.UpdateUserCards(user.getUsername(), OwnedCards);
            }
        }
        for (User user : User.users) {
            String UpCards = "";
            for (int i = 0; i < user.UpgradeCards.size();i++) {
                UpCards += user.UpgradeCards.get(i);
                if(i!=(user.UpgradeCards.size()-1))
                {
                    UpCards += "-";
                }
            }
            if(!user.UpgradeCards.isEmpty()) {
                HelloApplication.Connect.UpdateUserUpgradedCards(user.getUsername(), UpCards);
            }
        }
    }
    @FXML
    public void setLogin(){
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) login.getScene().getWindow();

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
    public void setSignup(){
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("loginView.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) login.getScene().getWindow();

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