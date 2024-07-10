package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gamblePrizeController implements Initializable {
    @FXML
    private Button Exit;

    @FXML
    private Text winner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                if(gameController.HostHp <= 0)
                {
                    User.users.get(User.Log2).coins += gamblingController.coin;
                    User.users.get(User.logged).coins -= gamblingController.coin;
                    winner.setText("Player 2 has won " + gamblingController.coin + " coins!");
                }
                else{
                    User.users.get(User.Log2).coins -= gamblingController.coin;
                    User.users.get(User.logged).coins += gamblingController.coin;
                    winner.setText("Player 1 has won " + gamblingController.coin + " coins!");
                }
                gameController.HostDamage = 0;
                gameController.GuestDamage = 0;
                gameController.HostFinalCards.clear();
                gameController.GuestFinalCards.clear();
            }
        });
    }
    @FXML
    public void setExit(){
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) Exit.getScene().getWindow();

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
