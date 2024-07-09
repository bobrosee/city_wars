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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static org.example.project_graphic.HelloApplication.connection;

public class loginController{
    static String q, answer;
    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    Button exit;
    @FXML
    Button loginbtn;
    @FXML
    Text message;
    @FXML
    Button showinfo;
    @FXML
    Button forgotPass;
    static String theQ, theA, secA;
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
        try {
            for (int i = 0; i < User.users.size(); i++) {
                if (User.users.get(i).getUsername().equals(username.textProperty().get())) {
                    if (User.users.get(i).getPassword().equals(password.textProperty().get())) {
                        User.logged = i;
                        User.users.get(i).login = true;
                        message.textProperty().setValue("Logged in successfully!");
                    }
                    else {
                        message.textProperty().setValue("Password is incorrect");
                    }
                }
            }
            if (User.logged != -1) {
                try {
                    System.out.println("HELLO");
                    // Load the new scene
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) loginbtn.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void setRecovery() {
        try {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("passRecovery.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) exit.getScene().getWindow();
                stage.setScene(scene);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            String inUsername = username.textProperty().getValue();
            HelloApplication.Connect.connectToDatabase();
            String sql = "SELECT * FROM users";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    if (rs.getString("username").equals(inUsername)) {
                        theQ = (rs.getString("sec_question"));
                        theA = (rs.getString("password"));
                        secA = (rs.getString("sec_answer"));
                    }
                }
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}