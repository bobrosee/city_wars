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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static org.example.project_graphic.HelloApplication.Connect.connectToDatabase;
import static org.example.project_graphic.HelloApplication.connection;
import static org.example.project_graphic.gameController.*;

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
        GuestFinalCards = new ArrayList<Cards>();
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
    public void setLaura() throws SQLException {
        gameController.character2 = 4;
        ArrayList<Cards> finalCards = new ArrayList<Cards>();
        connectToDatabase();
        String sql = "SELECT * FROM LauraCards";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cards card = new Cards(rs.getInt("number"),
                        rs.getString("name"),
                        rs.getInt("att_def"),
                        rs.getInt("duration"),
                        rs.getInt("damage"),
                        rs.getInt("upgrade_level"),
                        rs.getInt("upgrade_cost"),
                        rs.getInt("price"),
                        rs.getInt("colour")
                );
                for (Cards aCard : User.users.get(User.Log2).cards) {
                    if (aCard.name.equals(card.name)) {
                        Cards cardd = new Cards(aCard.number, aCard.name, (int) (1.2 * aCard.att_def), aCard.duration, (int) (1.2 * aCard.damage), aCard.upgrade_level, aCard.upgrade_cost, aCard.price, aCard.colour);
                        finalCards.add(cardd);
                        GuestFinalCards.add(cardd);
                    } else {
                        finalCards.add(card);
                        GuestFinalCards.add(card);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }
        connection.close();
        HostHp = 100 +(User.users.get(User.logged).getLevel()-1)*20;
        GuestHp = 100 +(User.users.get(User.Log2).getLevel()-1)*20;
        HostDamage = 0;
        GuestDamage = 0;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));

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
    public void setMax() throws SQLException {
        gameController.character2 = 3;
        ArrayList<Cards> finalCards = new ArrayList<Cards>();
        connectToDatabase();
        String sql = "SELECT * FROM MaxCards";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cards card = new Cards(rs.getInt("number"),
                        rs.getString("name"),
                        rs.getInt("att_def"),
                        rs.getInt("duration"),
                        rs.getInt("damage"),
                        rs.getInt("upgrade_level"),
                        rs.getInt("upgrade_cost"),
                        rs.getInt("price"),
                        rs.getInt("colour")
                );
                for (Cards aCard : User.users.get(User.Log2).cards) {
                    if (aCard.name.equals(card.name)) {
                        Cards cardd = new Cards(aCard.number, aCard.name, (int) (1.2 * aCard.att_def), aCard.duration, (int) (1.2 * aCard.damage), aCard.upgrade_level, aCard.upgrade_cost, aCard.price, aCard.colour);
                        finalCards.add(cardd);
                        GuestFinalCards.add(cardd);
                    } else {
                        finalCards.add(card);
                        GuestFinalCards.add(card);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }
        connection.close();
        HostHp = 100 +(User.users.get(User.logged).getLevel()-1)*20;
        GuestHp = 100 +(User.users.get(User.Log2).getLevel()-1)*20;
        HostDamage = 0;
        GuestDamage = 0;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));

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
    public void setSteven() throws SQLException {
        gameController.character2 = 1;
        ArrayList<Cards> finalCards = new ArrayList<Cards>();
        connectToDatabase();
        String sql = "SELECT * FROM StevenCards";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cards card = new Cards(rs.getInt("number"),
                        rs.getString("name"),
                        rs.getInt("att_def"),
                        rs.getInt("duration"),
                        rs.getInt("damage"),
                        rs.getInt("upgrade_level"),
                        rs.getInt("upgrade_cost"),
                        rs.getInt("price"),
                        rs.getInt("colour")
                );
                for (Cards aCard : User.users.get(User.Log2).cards) {
                    if (aCard.name.equals(card.name)) {
                        Cards cardd = new Cards(aCard.number, aCard.name, (int) (1.2 * aCard.att_def), aCard.duration, (int) (1.2 * aCard.damage), aCard.upgrade_level, aCard.upgrade_cost, aCard.price, aCard.colour);
                        finalCards.add(cardd);
                        GuestFinalCards.add(cardd);
                    } else {
                        finalCards.add(card);
                        GuestFinalCards.add(card);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }
        connection.close();
        HostHp = 100 +(User.users.get(User.logged).getLevel()-1)*20;
        GuestHp = 100 +(User.users.get(User.Log2).getLevel()-1)*20;
        HostDamage = 0;
        GuestDamage = 0;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));

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
    public void setUma() throws SQLException {
        gameController.character2 = 2;
        ArrayList<Cards> finalCards = new ArrayList<Cards>();
        connectToDatabase();
        String sql = "SELECT * FROM UmaCards";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cards card = new Cards(rs.getInt("number"),
                        rs.getString("name"),
                        rs.getInt("att_def"),
                        rs.getInt("duration"),
                        rs.getInt("damage"),
                        rs.getInt("upgrade_level"),
                        rs.getInt("upgrade_cost"),
                        rs.getInt("price"),
                        rs.getInt("colour")
                );
                for (Cards aCard : User.users.get(User.Log2).cards) {
                    if (aCard.name.equals(card.name)) {
                        Cards cardd = new Cards(aCard.number, aCard.name, (int) (1.2 * aCard.att_def), aCard.duration, (int) (1.2 * aCard.damage), aCard.upgrade_level, aCard.upgrade_cost, aCard.price, aCard.colour);
                        finalCards.add(cardd);
                        GuestFinalCards.add(cardd);
                    } else {
                        finalCards.add(card);
                        GuestFinalCards.add(card);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }
        connection.close();
        HostHp = 100 +(User.users.get(User.logged).getLevel()-1)*20;
        GuestHp = 100 +(User.users.get(User.Log2).getLevel()-1)*20;
        HostDamage = 0;
        GuestDamage = 0;
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));

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
