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

public class normalPrizeController implements Initializable {

    @FXML
    private Button exit;

    @FXML
    private Text loser;

    @FXML
    private Text uploser;

    @FXML
    private Text upwinner;

    @FXML
    private Text winner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                gameController.HostFinalCards.clear();
                gameController.GuestFinalCards.clear();
                if(gameController.HostHp <= 0)
                {
                    winner.setText("Player 2 has won 150 coins & 200 xp!");
                    loser.setText("Player 1 has won 50 xp");
                    User.users.get(User.Log2).setXp(User.users.get(User.Log2).getXp() + 200);
                    User.users.get(User.Log2).coins += 150;
                    User.users.get(User.logged).setXp(User.users.get(User.logged).getXp() + 50);
                }
                else{
                    winner.setText("Player 1 has won 150 coins & 200 xp!");
                    loser.setText("Player 2 has won 50 xp");
                    User.users.get(User.logged).setXp(User.users.get(User.logged).getXp() + 200);
                    User.users.get(User.logged).coins += 150;
                    User.users.get(User.Log2).setXp(User.users.get(User.Log2).getXp() + 50);
                }
                if(User.users.get(User.logged).getLevel() * User.users.get(User.logged).getLevel() * 100 < User.users.get(User.logged).getXp())
                {
                    User.users.get(User.logged).setLevel(User.users.get(User.logged).getLevel() + 1);
                    upwinner.setText("Player 1 has level up to level: " + User.users.get(User.logged).getLevel());
                }
                if(User.users.get(User.Log2).getLevel() * User.users.get(User.Log2).getLevel() * 100 < User.users.get(User.Log2).getXp())
                {
                    User.users.get(User.Log2).setLevel(User.users.get(User.Log2).getLevel() + 1);
                    uploser.setText("Player 1 has level up to level: " + User.users.get(User.Log2).getLevel());
                }
                User.Log2 = -1;
                gameController.HostDamage = 0;
                gameController.GuestDamage = 0;

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
            Stage stage = (Stage) exit.getScene().getWindow();

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
