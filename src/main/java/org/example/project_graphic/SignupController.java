package org.example.project_graphic;


import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class SignupController{
    static Connection connection;

    //connecting to SQL
    public static class Connect {
        public static void connectToDatabase() {
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
                //System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void insertUser(String mail, String username, String password, String sec_question, String sec_answer,String nickname,String ownedCards, int level, int coins, int xp, String UpgradedCards) throws SQLException {
            connectToDatabase();
            String sql = "INSERT INTO users(mail, username, password, sec_question, sec_answer, nickname,ownedCards, level, coins, xp, UpgradedCards) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, mail);
                pstmt.setString(2, username);
                pstmt.setString(3, password);
                pstmt.setString(4, sec_question);
                pstmt.setString(5, sec_answer);
                pstmt.setString(6, nickname);
                pstmt.setString(7, ownedCards);
                pstmt.setInt(8, level);
                pstmt.setInt(9, coins);
                pstmt.setInt(10, xp);
                pstmt.setString(10, UpgradedCards);
                pstmt.executeUpdate();
                //System.out.println("user has been added to the database.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }
        }


        public static void readUsers() throws SQLException {
            connectToDatabase();
            String sql = "SELECT * FROM users";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    User user = new User(rs.getString("mail"),rs.getString("username"),rs.getString("password"),rs.getString("sec_question"),rs.getString("sec_answer"),rs.getString("nickname"),rs.getString("ownedCards"),rs.getString("UpgradedCards"),rs.getInt("level"),rs.getInt("xp"),rs.getInt("coins"));
                    User.users.add(user);
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally {
                connection.close();
            }


        }

    }




    @FXML
    TextField UsernameField;
    @FXML
    TextField PasswordField;
    @FXML
    TextField PasswordConfirmationField;
    @FXML
    TextField EmailField;
    @FXML
    TextField NicknameField;
    @FXML
    Button doneButton;
    @FXML
    Button randomButton;
    @FXML
    Button backButton;
    @FXML
    Text message;

    @FXML
    public void done() throws SQLException, IOException {
        String secQuestion, secAnswer;
        secQuestion = SecurityController.TheQuestion;
        secAnswer = SecurityController.TheAnswer;
        String username = UsernameField.textProperty().get();
        String password = PasswordField.textProperty().get();
        String email = EmailField.textProperty().get();
        String nickname = NicknameField.textProperty().get();
        String confirmationPassword = PasswordConfirmationField.textProperty().get();
        System.out.println(signup(username, password, email, confirmationPassword, nickname, secQuestion, secAnswer));
        if (signup(username, password, email, confirmationPassword, nickname, secQuestion, secAnswer).equals("OK")) {
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
            message.textProperty().setValue(signup(username, password, email, confirmationPassword, nickname, secQuestion, secAnswer));
        }

    }
    @FXML
    public void random() throws IOException {
        try {
            Pane root = FXMLLoader.load(getClass().getResource("randomView.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) UsernameField.getScene().getWindow();
            stage.setScene(scene);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    @FXML
    public void back() {
        try {
            Pane root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) UsernameField.getScene().getWindow();
            stage.setScene(scene);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }












    public static String signup(String username, String password, String email, String passwordConfirmation, String nickname, String secQ, String secA) throws SQLException {
        User.users.clear();
        Connect.readUsers();
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || nickname.isEmpty() || passwordConfirmation.isEmpty()) {
            return "Fill all the fields!";
        }
        if (!username.matches("^[A-Za-z0-9_]+$")) {
            return "Invalid username!";
        }
        if (!password.equals(passwordConfirmation)) {
            System.out.println(password +  "  " + passwordConfirmation);
            return "Passwords don't match!";
        }
        Connect.connectToDatabase();

        for (User user : User.users) {
            if (user.getUsername().equals(username)) {
                return"Username is taken!";
            }
        }
        Boolean smallLetter = false;
        Boolean capitalLetter = false;
        Boolean specialCharacter = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                capitalLetter = true;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                smallLetter = true;
            }
            if (!(password.charAt(i) >= 65 && password.charAt(i) <= 90) && !(password.charAt(i) >= 97 && password.charAt(i) >= 122) && !(password.charAt(i) >= 48 && password.charAt(i) >= 57)) {
                specialCharacter = true;
            }
        }
        if (!smallLetter || !specialCharacter || !capitalLetter || password.length() < 8) {
            if (password.length() < 8) {
                return"Password is too short!";
            }
            if (!smallLetter || !capitalLetter || !specialCharacter) {
                return"Password is too simple!";
            }
        }
        if (!email.matches("\\S+@\\S+.com")) {
            return "Email is invalid!";
        }
        String result = "OK";
        return result;
        //Connect.connectToDatabase();
        //List<Integer> userCards = starterPack();
        //String userCardsList = "";
//        for (int i = 0; i < userCards.size(); i++) {
//            if (i != userCards.size() - 1) {
//                userCardsList += userCards.get(i) + "-";
//            }
//            else {
//                userCardsList += userCards.get(i);
//
//            }
//        }
    }


    public static String randomSignup(String email, String username, String nickname, String takenAnswer, String password) throws SQLException {
        if (email.isEmpty() || username.isEmpty() || nickname.isEmpty()) {
            return ("Fill all the fields!");
        }
        if (!username.matches("^[A-Za-z0-9_]+$")) {
            return ("Invalid username!");
        }
        for (User user : User.users) {
            if (user.getUsername().equals(username)) {
                return ("Username is taken!");
            }
        }

        if (!takenAnswer.equals(password)) {
            return ("Passwords don't match!");
        }
        else {
            return ("OK");
        }
//        String userCardsList = "";
//        for (int i = 0; i < userCards.size(); i++) {
//            if (i != userCards.size() - 1) {
//                userCardsList += userCards.get(i) + "-";
//            }
//            else {
//                userCardsList += userCards.get(i);
//
//            }
//        }
//        User newUser = new User(email, username, password, questionNumber, answer, nickname, userCardsList,"",1,0,1000);
//        Connect.insertUser(email, username, password, questionNumber, answer, nickname, userCardsList,1,1000,0,"");
//        User.users.add(newUser);
    }



    public static List<Integer> starterPack() {
        Random random = new Random();

        // Generate a list of 20 unique random numbers between 1 and 35
        return random.ints(1, 36)  // Generates an infinite stream of random ints between 1 (inclusive) and 36 (exclusive)
                .distinct()   // Ensure all numbers are unique
                .limit(20)    // Limit to 20 numbers
                .boxed()      // Box ints to Integer
                .collect(Collectors.toList());
    }









}