package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class player2CharController implements Initializable {
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
        gameController.character2 = 4;
    }
    @FXML
    public void setMax(){
        gameController.character2 = 3;
    }
    @FXML
    public void setSteven(){
        gameController.character2 = 1;
    }
    @FXML
    public void setUma(){
        gameController.character2 = 2;
    }
}
