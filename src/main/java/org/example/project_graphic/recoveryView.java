package org.example.project_graphic;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class recoveryView {
    @FXML
    TextField answer;
    @FXML
    TextField question = new TextField();
    @FXML
    Text showPass;
    @FXML
    Button okButton;
    String pass = null;


    @FXML
    public void checkAnswer() {
        if (answer.textProperty().getValue().equals(loginController.secA)) {
            showPass.textProperty().setValue("Correct! your password is: " + pass);
        }
        else {
            showPass.textProperty().setValue("Incorrect! try again.");
        }
    }
    @FXML
    Button backB;
    @FXML
    public void backBA() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) answer.getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    Text help;
    @FXML
    public void okButtonF() {
        String newQ = loginController.theQ;
        question.textProperty().setValue(newQ);
        pass = loginController.theA;
        help.setVisible(false);
        okButton.setVisible(false);
    }
}
