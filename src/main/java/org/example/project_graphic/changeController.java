package org.example.project_graphic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class changeController {
    @FXML
    Button apply;
    @FXML
    Button exit;
    @FXML
    TextField username;
    @FXML
    TextField mail;
    @FXML
    TextField password;
    @FXML
    TextField nickname;
    @FXML
    TextField sec;
    @FXML
    Label txt;
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
    @FXML
    public void setApply() throws SQLException {
        boolean u = true, p = true, m = true;
        if (!username.textProperty().isEmpty().get()) {
            for (int i = 0; i < User.users.size(); i++) {
                if(username.textProperty().get().equals(User.users.get(i).getUsername()))
                {
                    u = false;
                    break;
                }
            }
        }
        if(!u)
        {
            txt.setText("This username already exists!");
            txt.setStyle("-fx-text-fill: red;");
            return;
        }
        if(!password.textProperty().isEmpty().get())
        {
            String pass = password.textProperty().get();
            if(pass.matches("[a-zA-Z0-9]{8,}"))
            {
                p = true;
            }
            else{
                p = false;
                txt.setText("Password is too weak!");
                txt.setStyle("-fx-text-fill: red;");
                return;
            }
        }
        if(!mail.textProperty().isEmpty().get())
        {
            String mail_string = mail.textProperty().get();
            if(mail_string.matches("\\S+@\\S+.com"))
            {
                m = true;
            }
            else{
                m = false;
                txt.setText("Password is too weak!");
                txt.setStyle("-fx-text-fill: red;");
                return;
            }
        }
        if(p && m && u)
        {
            if(!username.textProperty().isEmpty().get())
            {
                HelloApplication.Connect.UpdateUsername(User.users.get(User.logged).getUsername(),username.textProperty().get());
                User.users.get(User.logged).setUsername(username.textProperty().get());
            }
            if(!password.textProperty().isEmpty().get())
            {
                User.users.get(User.logged).setPassword(password.textProperty().get());
                HelloApplication.Connect.UpdatePass(User.users.get(User.logged).getUsername(),User.users.get(User.logged).getPassword());
            }
            if(!mail.textProperty().isEmpty().get())
            {
                User.users.get(User.logged).setMail(mail.textProperty().get());
                HelloApplication.Connect.UpdateMail(User.users.get(User.logged).getUsername(),User.users.get(User.logged).getMail());

            }
            if(!nickname.textProperty().isEmpty().get())
            {
                User.users.get(User.logged).setNickname(nickname.textProperty().get());
                HelloApplication.Connect.UpdateNickname(User.users.get(User.logged).getUsername(),User.users.get(User.logged).getNickname());

            }
            if(!sec.textProperty().isEmpty().get())
            {
                User.users.get(User.logged).setSec_answer(sec.textProperty().get());
            }
            txt.setText("Changes were made successfully!");
            txt.setStyle("-fx-text-fill: green;");
        }

    }
}
