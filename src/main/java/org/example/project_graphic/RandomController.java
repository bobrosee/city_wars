package org.example.project_graphic;


import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class RandomController {
    @FXML
    Button signupButton;
    @FXML
    TextField UsernameField;
    @FXML
    TextField EmailField;
    @FXML
    TextField generator;
    @FXML
    Text randomPass;
    @FXML
    TextField confirmation;
    @FXML
    TextField nicknameField;
    @FXML
    Text message;
    @FXML
    public void done() throws SQLException, IOException {
        try {
            String username = UsernameField.textProperty().get();
            String email = EmailField.textProperty().get();
            String nickname = nicknameField.textProperty().get();
            String confirmationPassword = confirmation.textProperty().get();
            String password = randomPass.textProperty().get();
            if (SignupController.randomSignup(email, username, nickname, confirmationPassword, password).equals("OK")) {
                SecurityController.username = username;
                SecurityController.password = password;
                SecurityController.nickname = nickname;
                SecurityController.email = email;
                Pane root = FXMLLoader.load(getClass().getResource("securityView.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) UsernameField.getScene().getWindow();
                stage.setScene(scene);
            }
            else {
                message.textProperty().setValue(SignupController.randomSignup(email, username, nickname, confirmationPassword, password));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    @FXML
    public void generate() {
        String[] passwords = new String[5];
        passwords[0] = "K05xher4g3";
        passwords[1] = "fHn13ca01";
        passwords[2] = "ioNffvbe1";
        passwords[3] = "mBcpa2179";
        passwords[4] = "nompNgh0982";
        int indicator = (int)Math.floor(Math.random() * 5);
        String password = passwords[indicator];
        randomPass.textProperty().setValue(password);
    }
    @FXML
    public void back() throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("signupView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) nicknameField.getScene().getWindow();
        stage.setScene(scene);
    }
}