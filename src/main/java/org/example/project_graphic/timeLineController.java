package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class timeLineController implements Initializable {
    @FXML
    private Text d1;

    @FXML
    private Text d2;

    @FXML
    private Text g1;

    @FXML
    private Text g10;

    @FXML
    private Text g11;

    @FXML
    private Text g12;

    @FXML
    private Text g13;

    @FXML
    private Text g14;

    @FXML
    private Text g15;

    @FXML
    private Text g16;

    @FXML
    private Text g17;

    @FXML
    private Text g18;

    @FXML
    private Text g19;

    @FXML
    private Text g2;

    @FXML
    private Text g20;

    @FXML
    private Text g3;

    @FXML
    private Text g4;

    @FXML
    private Text g5;

    @FXML
    private Text g6;

    @FXML
    private Text g7;

    @FXML
    private Text g8;

    @FXML
    private Text g9;

    @FXML
    private Text h1;

    @FXML
    private Text h10;

    @FXML
    private Text h11;

    @FXML
    private Text h12;

    @FXML
    private Text h13;

    @FXML
    private Text h14;

    @FXML
    private Text h15;

    @FXML
    private Text h16;

    @FXML
    private Text h17;

    @FXML
    private Text h18;

    @FXML
    private Text h19;

    @FXML
    private Text h2;

    @FXML
    private Text h20;

    @FXML
    private Text h3;

    @FXML
    private Text h4;

    @FXML
    private Text h5;

    @FXML
    private Text h6;

    @FXML
    private Text h7;

    @FXML
    private Text h8;

    @FXML
    private Text h9;

    @FXML
    private Text hp1;

    @FXML
    private Text hp2;

    @FXML
    private Text t1;

    @FXML
    private Text t10;

    @FXML
    private Text t11;

    @FXML
    private Text t12;

    @FXML
    private Text t13;

    @FXML
    private Text t14;

    @FXML
    private Text t15;

    @FXML
    private Text t16;

    @FXML
    private Text t17;

    @FXML
    private Text t18;

    @FXML
    private Text t19;

    @FXML
    private Text t2;

    @FXML
    private Text t20;

    @FXML
    private Text t3;

    @FXML
    private Text t4;

    @FXML
    private Text t5;

    @FXML
    private Text t6;

    @FXML
    private Text t7;

    @FXML
    private Text t8;

    @FXML
    private Text t9;
    Timer timer;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                h1.setText(gameController.HostTimeline.get(0).name);
                h2.setText(gameController.HostTimeline.get(1).name);
                h3.setText(gameController.HostTimeline.get(2).name);
                h4.setText(gameController.HostTimeline.get(3).name);
                h5.setText(gameController.HostTimeline.get(4).name);
                h6.setText(gameController.HostTimeline.get(5).name);
                h7.setText(gameController.HostTimeline.get(6).name);
                h8.setText(gameController.HostTimeline.get(7).name);
                h9.setText(gameController.HostTimeline.get(8).name);
                h10.setText(gameController.HostTimeline.get(9).name);
                h11.setText(gameController.HostTimeline.get(10).name);
                h12.setText(gameController.HostTimeline.get(11).name);
                h13.setText(gameController.HostTimeline.get(12).name);
                h14.setText(gameController.HostTimeline.get(13).name);
                h15.setText(gameController.HostTimeline.get(14).name);
                h16.setText(gameController.HostTimeline.get(15).name);
                h17.setText(gameController.HostTimeline.get(16).name);
                h18.setText(gameController.HostTimeline.get(17).name);
                h19.setText(gameController.HostTimeline.get(18).name);
                h20.setText(gameController.HostTimeline.get(19).name);
                /////////////////////////////////////////////////////
                g1.setText(gameController.GuestTimeline.get(0).name);
                g2.setText(gameController.GuestTimeline.get(1).name);
                g3.setText(gameController.GuestTimeline.get(2).name);
                g4.setText(gameController.GuestTimeline.get(3).name);
                g5.setText(gameController.GuestTimeline.get(4).name);
                g6.setText(gameController.GuestTimeline.get(5).name);
                g7.setText(gameController.GuestTimeline.get(6).name);
                g8.setText(gameController.GuestTimeline.get(7).name);
                g9.setText(gameController.GuestTimeline.get(8).name);
                g10.setText(gameController.GuestTimeline.get(9).name);
                g11.setText(gameController.GuestTimeline.get(10).name);
                g12.setText(gameController.GuestTimeline.get(11).name);
                g13.setText(gameController.GuestTimeline.get(12).name);
                g14.setText(gameController.GuestTimeline.get(13).name);
                g15.setText(gameController.GuestTimeline.get(14).name);
                g16.setText(gameController.GuestTimeline.get(15).name);
                g17.setText(gameController.GuestTimeline.get(16).name);
                g18.setText(gameController.GuestTimeline.get(17).name);
                g19.setText(gameController.GuestTimeline.get(18).name);
                g20.setText(gameController.GuestTimeline.get(19).name);
                /////////////////////////////////////////////////////
                hp1.setText(String.valueOf(gameController.HostHp));
                hp2.setText(String.valueOf(gameController.GuestHp));
                d1.setText(String.valueOf(gameController.HostDamage));
                d2.setText(String.valueOf(gameController.GuestDamage));
                ///////////////////////////////////////////////////////
                draw(1);
            }
        });
    }
    public void draw(int i)
    {
        if( i == 1) {
            t1.setText("+");
            if (gameController.HostTimeline.get(0).att_def > gameController.GuestTimeline.get(0).att_def) {
                gameController.GuestHp -= (gameController.HostTimeline.get(0).damage / gameController.HostTimeline.get(0).duration);
                gameController.HostHp += (gameController.HostTimeline.get(0).damage / gameController.HostTimeline.get(0).duration);
            } else if (gameController.HostTimeline.get(0).att_def < gameController.GuestTimeline.get(0).att_def) {
                gameController.HostHp -= (gameController.GuestTimeline.get(0).damage / gameController.GuestTimeline.get(0).duration);
                gameController.HostDamage += (gameController.GuestTimeline.get(0).damage / gameController.GuestTimeline.get(0).duration);
            }
            if (gameController.GuestHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            if (gameController.HostHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            hp1.setText(String.valueOf(gameController.HostHp));
            hp2.setText(String.valueOf(gameController.GuestHp));
            d1.setText(String.valueOf(gameController.HostDamage));
            d2.setText(String.valueOf(gameController.GuestDamage));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            t1.setText("");
                draw(2);
        }
        ////////////////////////////////
        else if(i==2) {
            t2.setText("+");
            if (gameController.HostTimeline.get(1).att_def > gameController.GuestTimeline.get(1).att_def) {
                gameController.GuestHp -= (gameController.HostTimeline.get(1).damage / gameController.HostTimeline.get(1).duration);
                gameController.HostHp += (gameController.HostTimeline.get(1).damage / gameController.HostTimeline.get(1).duration);
            } else if (gameController.HostTimeline.get(1).att_def < gameController.GuestTimeline.get(1).att_def) {
                gameController.HostHp -= (gameController.GuestTimeline.get(1).damage / gameController.GuestTimeline.get(1).duration);
                gameController.HostDamage += (gameController.GuestTimeline.get(1).damage / gameController.GuestTimeline.get(1).duration);
            }
            if (gameController.GuestHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            if (gameController.HostHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            hp1.setText(String.valueOf(gameController.HostHp));
            hp2.setText(String.valueOf(gameController.GuestHp));
            d1.setText(String.valueOf(gameController.HostDamage));
            d2.setText(String.valueOf(gameController.GuestDamage));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            t2.setText("");
                draw(3);
        }
        ////////////////////////////////
        else if(i == 3) {
            t3.setText("+");
            if (gameController.HostTimeline.get(2).att_def > gameController.GuestTimeline.get(2).att_def) {
                gameController.GuestHp -= (gameController.HostTimeline.get(2).damage / gameController.HostTimeline.get(2).duration);
                gameController.HostHp += (gameController.HostTimeline.get(2).damage / gameController.HostTimeline.get(2).duration);
            } else if (gameController.HostTimeline.get(2).att_def < gameController.GuestTimeline.get(2).att_def) {
                gameController.HostHp -= (gameController.GuestTimeline.get(2).damage / gameController.GuestTimeline.get(2).duration);
                gameController.HostDamage += (gameController.GuestTimeline.get(2).damage / gameController.GuestTimeline.get(2).duration);
            }
            if (gameController.GuestHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            if (gameController.HostHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            hp1.setText(String.valueOf(gameController.HostHp));
            hp2.setText(String.valueOf(gameController.GuestHp));
            d1.setText(String.valueOf(gameController.HostDamage));
            d2.setText(String.valueOf(gameController.GuestDamage));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            t3.setText("");
                draw(4);
        }
        ////////////////////////////////
        else if(i == 4) {
            t4.setText("+");
            if (gameController.HostTimeline.get(3).att_def > gameController.GuestTimeline.get(3).att_def) {
                gameController.GuestHp -= (gameController.HostTimeline.get(3).damage / gameController.HostTimeline.get(3).duration);
                gameController.HostHp += (gameController.HostTimeline.get(3).damage / gameController.HostTimeline.get(3).duration);
            } else if (gameController.HostTimeline.get(3).att_def < gameController.GuestTimeline.get(3).att_def) {
                gameController.HostHp -= (gameController.GuestTimeline.get(3).damage / gameController.GuestTimeline.get(3).duration);
                gameController.HostDamage += (gameController.GuestTimeline.get(3).damage / gameController.GuestTimeline.get(3).duration);
            }
            if (gameController.GuestHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            if (gameController.HostHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            hp1.setText(String.valueOf(gameController.HostHp));
            hp2.setText(String.valueOf(gameController.GuestHp));
            d1.setText(String.valueOf(gameController.HostDamage));
            d2.setText(String.valueOf(gameController.GuestDamage));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            t4.setText("");
            draw(5);
        }
        ////////////////////////////////
        else if(i == 5) {
            t5.setText("+");
            if (gameController.HostTimeline.get(4).att_def > gameController.GuestTimeline.get(4).att_def) {
                gameController.GuestHp -= (gameController.HostTimeline.get(4).damage / gameController.HostTimeline.get(4).duration);
                gameController.HostHp += (gameController.HostTimeline.get(4).damage / gameController.HostTimeline.get(4).duration);
            } else if (gameController.HostTimeline.get(4).att_def < gameController.GuestTimeline.get(4).att_def) {
                gameController.HostHp -= (gameController.GuestTimeline.get(4).damage / gameController.GuestTimeline.get(4).duration);
                gameController.HostDamage += (gameController.GuestTimeline.get(4).damage / gameController.GuestTimeline.get(4).duration);
            }
            if (gameController.GuestHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            if (gameController.HostHp <= 0) {
                if (gameController.mode) {

                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

                        // Set the new scene on the stage
                        stage.setScene(scene);

                        // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        // Load the new scene
                        Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                        // Create a new scene with the loaded parent
                        Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                        // Get the current stage
                        Stage stage = (Stage) d1.getScene().getWindow();

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
            hp1.setText(String.valueOf(gameController.HostHp));
            hp2.setText(String.valueOf(gameController.GuestHp));
            d1.setText(String.valueOf(gameController.HostDamage));
            d2.setText(String.valueOf(gameController.GuestDamage));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            t5.setText("");
            draw(6);
        }
        ////////////////////////////////
        t6.setText("+");
        if(gameController.HostTimeline.get(5).att_def > gameController.GuestTimeline.get(5).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(5).damage / gameController.HostTimeline.get(5).duration);
            gameController.HostHp += (gameController.HostTimeline.get(5).damage / gameController.HostTimeline.get(5).duration);
        }
        else if (gameController.HostTimeline.get(5).att_def < gameController.GuestTimeline.get(5).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(5).damage / gameController.GuestTimeline.get(5).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(5).damage / gameController.GuestTimeline.get(5).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t6.setText("");
        ////////////////////////////////
        t7.setText("+");
        if(gameController.HostTimeline.get(6).att_def > gameController.GuestTimeline.get(6).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(6).damage / gameController.HostTimeline.get(6).duration);
            gameController.HostHp += (gameController.HostTimeline.get(6).damage / gameController.HostTimeline.get(6).duration);
        }
        else if (gameController.HostTimeline.get(6).att_def < gameController.GuestTimeline.get(6).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(6).damage / gameController.GuestTimeline.get(6).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(6).damage / gameController.GuestTimeline.get(6).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t7.setText("");
        ////////////////////////////////
        t8.setText("+");
        if(gameController.HostTimeline.get(7).att_def > gameController.GuestTimeline.get(7).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(7).damage / gameController.HostTimeline.get(7).duration);
            gameController.HostHp += (gameController.HostTimeline.get(7).damage / gameController.HostTimeline.get(7).duration);
        }
        else if (gameController.HostTimeline.get(7).att_def < gameController.GuestTimeline.get(7).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(7).damage / gameController.GuestTimeline.get(7).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(7).damage / gameController.GuestTimeline.get(7).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t8.setText("");
        ////////////////////////////////
        t9.setText("+");
        if(gameController.HostTimeline.get(8).att_def > gameController.GuestTimeline.get(8).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(8).damage / gameController.HostTimeline.get(8).duration);
            gameController.HostHp += (gameController.HostTimeline.get(8).damage / gameController.HostTimeline.get(8).duration);
        }
        else if (gameController.HostTimeline.get(8).att_def < gameController.GuestTimeline.get(8).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(8).damage / gameController.GuestTimeline.get(8).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(8).damage / gameController.GuestTimeline.get(8).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t9.setText("");
        ////////////////////////////////
        t10.setText("+");
        if(gameController.HostTimeline.get(9).att_def > gameController.GuestTimeline.get(9).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(9).damage / gameController.HostTimeline.get(9).duration);
            gameController.HostHp += (gameController.HostTimeline.get(9).damage / gameController.HostTimeline.get(9).duration);
        }
        else if (gameController.HostTimeline.get(9).att_def < gameController.GuestTimeline.get(9).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(9).damage / gameController.GuestTimeline.get(9).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(9).damage / gameController.GuestTimeline.get(9).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t10.setText("");
        ////////////////////////////////
        t11.setText("+");
        if(gameController.HostTimeline.get(10).att_def > gameController.GuestTimeline.get(10).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(10).damage / gameController.HostTimeline.get(10).duration);
            gameController.HostHp += (gameController.HostTimeline.get(10).damage / gameController.HostTimeline.get(10).duration);
        }
        else if (gameController.HostTimeline.get(10).att_def < gameController.GuestTimeline.get(10).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(10).damage / gameController.GuestTimeline.get(10).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(10).damage / gameController.GuestTimeline.get(10).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t11.setText("");
        ////////////////////////////////
        t12.setText("+");
        if(gameController.HostTimeline.get(11).att_def > gameController.GuestTimeline.get(11).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(11).damage / gameController.HostTimeline.get(11).duration);
            gameController.HostHp += (gameController.HostTimeline.get(11).damage / gameController.HostTimeline.get(11).duration);
        }
        else if (gameController.HostTimeline.get(11).att_def < gameController.GuestTimeline.get(11).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(11).damage / gameController.GuestTimeline.get(11).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(11).damage / gameController.GuestTimeline.get(11).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t12.setText("");
        ////////////////////////////////
        t13.setText("+");
        if(gameController.HostTimeline.get(12).att_def > gameController.GuestTimeline.get(12).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(12).damage / gameController.HostTimeline.get(12).duration);
            gameController.HostHp += (gameController.HostTimeline.get(12).damage / gameController.HostTimeline.get(12).duration);
        }
        else if (gameController.HostTimeline.get(12).att_def < gameController.GuestTimeline.get(12).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(12).damage / gameController.GuestTimeline.get(12).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(12).damage / gameController.GuestTimeline.get(12).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t13.setText("");
        ////////////////////////////////
        t14.setText("+");
        if(gameController.HostTimeline.get(13).att_def > gameController.GuestTimeline.get(13).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(13).damage / gameController.HostTimeline.get(13).duration);
            gameController.HostHp += (gameController.HostTimeline.get(13).damage / gameController.HostTimeline.get(13).duration);
        }
        else if (gameController.HostTimeline.get(13).att_def < gameController.GuestTimeline.get(13).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(13).damage / gameController.GuestTimeline.get(13).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(13).damage / gameController.GuestTimeline.get(13).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t14.setText("");
        ////////////////////////////////
        t15.setText("+");
        if(gameController.HostTimeline.get(14).att_def > gameController.GuestTimeline.get(14).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(14).damage / gameController.HostTimeline.get(14).duration);
            gameController.HostHp += (gameController.HostTimeline.get(14).damage / gameController.HostTimeline.get(14).duration);
        }
        else if (gameController.HostTimeline.get(14).att_def < gameController.GuestTimeline.get(14).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(14).damage / gameController.GuestTimeline.get(14).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(14).damage / gameController.GuestTimeline.get(14).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t15.setText("");
        ////////////////////////////////
        t16.setText("+");
        if(gameController.HostTimeline.get(15).att_def > gameController.GuestTimeline.get(15).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(15).damage / gameController.HostTimeline.get(15).duration);
            gameController.HostHp += (gameController.HostTimeline.get(15).damage / gameController.HostTimeline.get(15).duration);
        }
        else if (gameController.HostTimeline.get(15).att_def < gameController.GuestTimeline.get(15).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(15).damage / gameController.GuestTimeline.get(15).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(15).damage / gameController.GuestTimeline.get(15).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t16.setText("");
        ////////////////////////////////
        t17.setText("+");
        if(gameController.HostTimeline.get(16).att_def > gameController.GuestTimeline.get(16).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(16).damage / gameController.HostTimeline.get(16).duration);
            gameController.HostHp += (gameController.HostTimeline.get(16).damage / gameController.HostTimeline.get(16).duration);
        }
        else if (gameController.HostTimeline.get(16).att_def < gameController.GuestTimeline.get(16).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(16).damage / gameController.GuestTimeline.get(16).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(16).damage / gameController.GuestTimeline.get(16).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t17.setText("");
        ////////////////////////////////
        t18.setText("+");
        if(gameController.HostTimeline.get(17).att_def > gameController.GuestTimeline.get(17).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(17).damage / gameController.HostTimeline.get(17).duration);
            gameController.HostHp += (gameController.HostTimeline.get(17).damage / gameController.HostTimeline.get(17).duration);
        }
        else if (gameController.HostTimeline.get(17).att_def < gameController.GuestTimeline.get(17).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(17).damage / gameController.GuestTimeline.get(17).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(17).damage / gameController.GuestTimeline.get(17).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t18.setText("");
        ////////////////////////////////
        t19.setText("+");
        if(gameController.HostTimeline.get(18).att_def > gameController.GuestTimeline.get(18).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(18).damage / gameController.HostTimeline.get(18).duration);
            gameController.HostHp += (gameController.HostTimeline.get(18).damage / gameController.HostTimeline.get(18).duration);
        }
        else if (gameController.HostTimeline.get(18).att_def < gameController.GuestTimeline.get(18).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(18).damage / gameController.GuestTimeline.get(18).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(18).damage / gameController.GuestTimeline.get(18).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) t20.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t19.setText("");
        ////////////////////////////////
        t20.setText("+");
        if(gameController.HostTimeline.get(19).att_def > gameController.GuestTimeline.get(19).att_def)
        {
            gameController.GuestHp -= (gameController.HostTimeline.get(19).damage / gameController.HostTimeline.get(19).duration);
            gameController.HostHp += (gameController.HostTimeline.get(19).damage / gameController.HostTimeline.get(19).duration);
        }
        else if (gameController.HostTimeline.get(19).att_def < gameController.GuestTimeline.get(19).att_def)
        {
            gameController.HostHp -= (gameController.GuestTimeline.get(19).damage / gameController.GuestTimeline.get(19).duration);
            gameController.HostDamage += (gameController.GuestTimeline.get(19).damage / gameController.GuestTimeline.get(19).duration);
        }
        if(gameController.GuestHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        if(gameController.HostHp <= 0)
        {
            if(gameController.mode)
            {

                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("gamblePrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

                    // Set the new scene on the stage
                    stage.setScene(scene);

                    // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    // Load the new scene
                    Parent root = FXMLLoader.load(getClass().getResource("normalPrize.fxml"));

                    // Create a new scene with the loaded parent
                    Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

                    // Get the current stage
                    Stage stage = (Stage) d1.getScene().getWindow();

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
        hp1.setText(String.valueOf(gameController.HostHp));
        hp2.setText(String.valueOf(gameController.GuestHp));
        d1.setText(String.valueOf(gameController.HostDamage));
        d2.setText(String.valueOf(gameController.GuestDamage));
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
        t20.setText("");
        ////////////////////////////////
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) d1.getScene().getWindow();

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
