package org.example.project_graphic;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecurityController {
    static int answer = 0;
    static boolean done = false;
    static Boolean welcome = false;
    public static String asciiMath() {
        Random random = new Random();
        boolean zeroCheck = false;
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        int c = random.nextInt(10) + 1;
        String captcha = null;
        String[] operations = {"PLUS", "MINUS", "DIVIDED BY", "TIMES"};
        int d = random.nextInt(4);
        int e = 0;
        if (d == 0) {
            e = b + c;
        }
        if (d == 1) {
            e = b - c;
        }
        if (d == 2) {
            e = b / c;
        }
        if (d == 3) {
            e = b * c;
        }
        int f = random.nextInt(4);
        int g = random.nextInt(2);
        int h = 0;
        if (f == 0) {
            h = a + e;
            captcha = Integer.toString(a) + " " + "PLUS" + " (" + Integer.toString(b) + " " +operations[d] + " " + Integer.toString(c)+") = ";
        }
        if (f == 2) {
            h = a * e;
            captcha = Integer.toString(a) + " " + "TIMES" + " (" + Integer.toString(b) + " " +operations[d] + " " + Integer.toString(c)+") = ";

        }
        if (f == 1) {
            if (g == 0) {
                h = a - e;
                captcha = Integer.toString(a) + " " + "MINUS" + " (" + Integer.toString(b) + " " +operations[d] + " " + Integer.toString(c)+") = ";
            }
            else {
                h = e - a;
                captcha ="(" + Integer.toString(b) + " " +operations[d] + " " + Integer.toString(c)+")" + " MINUS " + Integer.toString(a) + " =";
            }
        }
        if (f == 3) {
            if (g == 0) {
                if (e != 0) {
                    h = a / e;
                    captcha = Integer.toString(a) + " " + "DIVIDED BY" + " (" + Integer.toString(b) + " " + operations[d] + " " + Integer.toString(c) + ") = ";
                }
                else {
                    zeroCheck = true;
                }
            }
            else {
                if (a != 0) {
                    h = e / a;
                    captcha = "(" + Integer.toString(b) + " " + operations[d] + " " + Integer.toString(c) + ") " + "DIVIDED BY" + " " + Integer.toString(a) + " = ";
                }
                else {
                    zeroCheck = true;
                }
            }
        }
        if (zeroCheck) {
            answer = 16;
            return ("(4 TIMES 3) PLUS 4 = )");
        }
        else {
            answer = h;
            return captcha;
        }
    }
    static String cText = asciiMath();
    static String TheQuestion, TheAnswer;
    static String username, password, nickname, email;


    @FXML
    ChoiceBox comboBox;
    @FXML
    ObservableList<String> securityQuestions = FXCollections.observableArrayList("1-What is your father’s name ?",
            "2-What is your favourite color ?",
            "3-What was the name of your first pet?");
    @FXML
    Text captcha;
    @FXML
    TextField cAnswer;
    @FXML
    TextField ans;
    @FXML
    TextField confirm;
    @FXML
    Text message;
    @FXML
    public void checkAnswer() {
        try {

            int cAnswerS = Integer.parseInt(cAnswer.textProperty().get());
            if (cAnswerS == (answer)) {
                String question = comboBox.getValue().toString();
                String secAnswer = ans.textProperty().get();
                String confirmA = confirm.textProperty().get();
                if (!secAnswer.isEmpty() && !confirmA.isEmpty() && !question.isEmpty()) {
                    if (secAnswer.equals(confirmA)) {
                        TheQuestion = question;
                        TheAnswer = secAnswer;
                        SignupController.Connect.connectToDatabase();
                        List<Integer> userCards = SignupController.starterPack();
                        String userCardsList = "";
                        for (int i = 0; i < userCards.size(); i++) {
                            if (i != userCards.size() - 1) {
                                userCardsList += userCards.get(i) + "-";
                            }
                            else {
                                userCardsList += userCards.get(i);

                            }
                        }
                        User newUser = new User(email, username, password, TheQuestion, TheAnswer, nickname, userCardsList, "", 1, 0, 1000);
                        SignupController.Connect.insertUser(email, username, password, TheQuestion, TheAnswer, nickname, userCardsList, 1, 1000, 0, "");
                        User.users.add(newUser);
                        HelloApplication.readUserTableCards(User.users.size()-1);
                        User.logged = User.users.size()-1;
                        welcome = true;
                        try {
                            Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

                            // Create a new scene with the loaded parent
                            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                            // Get the current stage
                            Stage stage = (Stage) comboBox.getScene().getWindow();

                            // Set the new scene on the stage
                            stage.setScene(scene);
                        }
                        catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    else {
                        initialize();
                        message.textProperty().setValue("Fill the fields correctly.");
                    }
                }
                else {
                    initialize();
                    message.textProperty().setValue("Fill all the fields");

                }
            } else {
                cText = asciiMath();
                captcha.textProperty().setValue(asciiMath());
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void backButton() throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("signupView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) captcha.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    public void initialize() {
        cText = asciiMath();
        captcha.textProperty().setValue(cText);
        comboBox.setItems(securityQuestions);
    }
}