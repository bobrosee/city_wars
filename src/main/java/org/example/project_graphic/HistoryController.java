package org.example.project_graphic;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

import static org.example.project_graphic.HelloApplication.connection;

public class HistoryController implements Initializable {
    static ArrayList<String> dates = new ArrayList<>();
    static ArrayList<String> opponentNames = new ArrayList<>();
    static ArrayList<String> opponentLevel = new ArrayList<>();
    static ArrayList<String> results = new ArrayList<>();
    static ArrayList<Integer> prizes = new ArrayList<>();

    @FXML
    private TableView<GameRecord> tableView;
    @FXML
    private TableColumn<GameRecord, String> dateColumn;
    @FXML
    private TableColumn<GameRecord, String> opponentNameColumn;
    @FXML
    private TableColumn<GameRecord, String> opponentLevelColumn;
    @FXML
    private TableColumn<GameRecord, String> resultColumn;
    @FXML
    private TableColumn<GameRecord, Integer> prizeColumn;
    @FXML
    private Pagination pagination;

    public static final int ROWS_PER_PAGE = 10;
    public static ObservableList<GameRecord> gameRecords = FXCollections.observableArrayList();
    private SortedList<GameRecord> sortedData;

    @FXML
    Button backB;
    @FXML
    public void back() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) backB.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        prizes.clear(); dates.clear(); opponentLevel.clear(); opponentNames.clear(); results.clear();
        try {
            showHistory();
        } catch (Exception e) {
            System.out.println(e);
        }
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        opponentNameColumn.setCellValueFactory(new PropertyValueFactory<>("opponentName"));
        opponentLevelColumn.setCellValueFactory(new PropertyValueFactory<>("opponentLevel"));
        resultColumn.setCellValueFactory(new PropertyValueFactory<>("result"));
        prizeColumn.setCellValueFactory(new PropertyValueFactory<>("prize"));

        sortedData = new SortedList<>(gameRecords);
        tableView.setItems(sortedData);

        pagination.setPageFactory(this::createPage);
        updatePageCount();
    }

    private void updatePageCount() {
        int pageCount = (int) Math.ceil((double) gameRecords.size() / ROWS_PER_PAGE);
        pagination.setPageCount(pageCount);
    }

    private TableView<GameRecord> createPage(int pageIndex) {
        int fromIndex = pageIndex * ROWS_PER_PAGE;
        int toIndex = Math.min(fromIndex + ROWS_PER_PAGE, gameRecords.size());
        tableView.setItems(FXCollections.observableArrayList(sortedData.subList(fromIndex, toIndex)));
        return new TableView<>(tableView.getItems());
    }

    public static void showHistory() throws SQLException {
        HelloApplication.Connect.connectToDatabase();
        String sql = "SELECT * FROM games";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int prize = rs.getInt("prize");
                String winnerName = rs.getString("winner");
                String loserName = rs.getString("loser");
                int winnerLevel = rs.getInt("winnerLevel");
                int loserLevel = rs.getInt("loserLevel");
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                int day = rs.getInt("day");
                int hour = rs.getInt("hour");
                int minute = rs.getInt("minute");
                String dateStatus = "Date: " + year + "/" + month + "/" + day + " " + hour + ":" + minute;

                if (winnerName.equals(User.users.get(User.logged).getUsername())) {
                    opponentNames.add(loserName);
                    opponentLevel.add(Integer.toString(loserLevel));
                    results.add("Won");
                } else if(loserName.equals(User.users.get(User.logged).getUsername())){
                    opponentNames.add(winnerName);
                    opponentLevel.add(Integer.toString(winnerLevel));
                    results.add("Lost");
                }
                dates.add(dateStatus);
                prizes.add(prize);
            }

            updateGameRecords();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    private static void updateGameRecords() {
        gameRecords.clear();
        for (int i = 0; i < dates.size(); i++) {
            gameRecords.add(new GameRecord(dates.get(i), opponentNames.get(i), opponentLevel.get(i), results.get(i), prizes.get(i)));
        }
    }

    @FXML
    private void sortByDate() {
        sortedData.setComparator(Comparator.comparing(GameRecord::getDate));
        updatePageCount();
        pagination.setPageFactory(this::createPage);
    }

    @FXML
    private void sortByOpponentName() {
        sortedData.setComparator(Comparator.comparing(GameRecord::getOpponentName));
        updatePageCount();
        pagination.setPageFactory(this::createPage);
    }

    @FXML
    private void sortByOpponentLevel() {
        sortedData.setComparator(Comparator.comparing(GameRecord::getOpponentLevel));
        updatePageCount();
        pagination.setPageFactory(this::createPage);
    }

    @FXML
    private void sortByResult() {
        sortedData.setComparator(Comparator.comparing(GameRecord::getResult));
        updatePageCount();
        pagination.setPageFactory(this::createPage);
    }

    @FXML
    private void sortByPrize() {
        sortedData.setComparator(Comparator.comparingInt(GameRecord::getPrize));
        updatePageCount();
        pagination.setPageFactory(this::createPage);
    }
}
