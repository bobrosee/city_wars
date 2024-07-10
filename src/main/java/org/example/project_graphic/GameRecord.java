package org.example.project_graphic;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class GameRecord {
    public final SimpleStringProperty date;
    public final SimpleStringProperty opponentName;
    public final SimpleStringProperty opponentLevel;
    public final SimpleStringProperty result;
    public final SimpleIntegerProperty prize;

    public GameRecord(String date, String opponentName, String opponentLevel, String result, int prize) {
        this.date = new SimpleStringProperty(date);
        this.opponentName = new SimpleStringProperty(opponentName);
        this.opponentLevel = new SimpleStringProperty(opponentLevel);
        this.result = new SimpleStringProperty(result);
        this.prize = new SimpleIntegerProperty(prize);
    }

    public String getDate() { return date.get(); }
    public String getOpponentName() { return opponentName.get(); }
    public String getOpponentLevel() { return opponentLevel.get(); }
    public String getResult() { return result.get(); }
    public int getPrize() { return prize.get(); }
}
