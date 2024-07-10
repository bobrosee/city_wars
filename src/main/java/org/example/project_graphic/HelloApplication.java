package org.example.project_graphic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class HelloApplication extends Application {
    static Connection connection;
    public static void upgrades(ArrayList<Cards> cards, ArrayList<Integer> ints)
    {
        for (Cards card : cards) {
            for(Integer int1 : ints)
            {
                if(int1 == card.number)
                {
                    card.damage = (int) (1.2 * card.damage);
                    card.att_def = (int) (1.2 * card.att_def);
                    break;
                }
            }
        }
    }
    public static void readUserTableCards(int n) throws SQLException {
        Connect.connectToDatabase();
        String sql = "SELECT * FROM users";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getString("username").equals(User.users.get(n).getUsername()) && User.users.get(n).cards.isEmpty()) {
                    String cards = rs.getString("ownedCards");
                    String[] splitCards = cards.split("-");
                    for (int i = 0; i < splitCards.length; i++) {
                        int intI = Integer.parseInt(splitCards[i]);
                        User.users.get(n).cards.add(Cards.cards.get(intI-1));
                    }
                }
                if(rs.getString("username").equals(User.users.get(n).getUsername()) && User.users.get(n).UpgradeCards.isEmpty())
                {
                    String upcards = rs.getString("UpgradedCards");
                    if(upcards!= null)
                    {
                        String[] splitUpCards = upcards.split("-");
                        for (int i = 0; i < splitUpCards.length; i++) {
                            int intI = Integer.parseInt(splitUpCards[i]);
                            User.users.get(n).UpgradeCards.add(Cards.cards.get(intI-1).number);
                        }
                    }
                }
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            connection.close();
        }

    }
    @Override
    public void start(Stage stage) throws IOException, SQLException {
//        User user = new User("a@r.com","ali","1234","1","a","ali","123","",100,12,1);
//        User.users.add(user);
        Connect.readUsers();
        Connect.readCards();
        for (int i = 0; i < User.users.size(); i++) {
            readUserTableCards(i);
        }
        for(User user : User.users)
        {
            upgrades(user.cards,user.UpgradeCards);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("City Wars");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
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
        public static void InsertCard(int number, String name, int att_def, int duration,int damage, int upgrade_level, int upgrade_cost, int price,int colour) throws SQLException {
            connectToDatabase();
            String sql = "INSERT INTO cards(number, name, att_def, damage, duration, colour, price, upgrade_level, upgrade_cost) VALUES(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1, number);
                pstmt.setString(2, name);
                pstmt.setInt(3, att_def);
                pstmt.setInt(4, damage);
                pstmt.setInt(5, duration);
                pstmt.setInt(6, colour);
                pstmt.setInt(7, price);
                pstmt.setInt(8, upgrade_level);
                pstmt.setInt(9, upgrade_cost);

                pstmt.executeUpdate();
                //System.out.println("user has been added to the database.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }
        }
        //////changing profile
        public static void UpdateUsername(String OldUsername, String NewUsername)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET username = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,NewUsername);
                pstmt.setString(2,OldUsername);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateNickname(String Username, String Nickname)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET nickname = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,Nickname);
                pstmt.setString(2,Username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateMail(String Username, String mail)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET mail = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,mail);
                pstmt.setString(2,Username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdatePass(String Username, String pass)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET password = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,pass);
                pstmt.setString(2,Username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateUserCards(String username, String OwnedCards)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET ownedCards = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,OwnedCards);
                pstmt.setString(2,username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateUserUpgradedCards(String username, String UpgradedCards)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET UpgradedCards = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,UpgradedCards);
                pstmt.setString(2,username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }

        /////////////changing cards

        public static void DeleteCard(int cardNumber) throws SQLException {
            connectToDatabase();
            String sql = "DELETE FROM cards WHERE number = ?";
            String sql2 = "DELETE FROM UmaCards WHERE number = ?";
            String sql3 = "DELETE FROM StevenCards WHERE number = ?";
            String sql4 = "DELETE FROM MaxCards WHERE number = ?";
            String sql5 = "DELETE FROM LauraCards WHERE number = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,cardNumber);
                pstmt.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,cardNumber);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,cardNumber);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,cardNumber);
                pstmt4.executeUpdate();
                PreparedStatement pstmt5 = connection.prepareStatement(sql5);
                pstmt5.setInt(1,cardNumber);
                pstmt5.executeUpdate();
                for (User user : User.users) {
                    for (Cards card : user.cards) {
                        if (card.number == cardNumber) {
                            user.cards.remove(card);
                        }
                    }
                    String[] OwnedCardsSet = user.ownedCards.split("-");
                    String newOwnedCards = "";
                    for (int i = 0; i < OwnedCardsSet.length; i++) {
                        if (!OwnedCardsSet[i].equals(String.valueOf(cardNumber))) {
                            newOwnedCards += OwnedCardsSet[i] + "-";
                        }
                    }
                    if (newOwnedCards.charAt(newOwnedCards.length() - 1) == '-') {
                        newOwnedCards = newOwnedCards.substring(0, newOwnedCards.length() - 1);
                        user.ownedCards = newOwnedCards;
                    }
                }
            }
            catch (SQLException e) {

            }
            finally{
                connection.close();
            }

        }

        public static void UpdateCardName(String Oldname, String Newname)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET name = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET name = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET name = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET name = ? WHERE name = ?";
            String sql4 = "UPDATE Uma SET name = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,Newname);
                pstmt.setString(2,Oldname);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setString(1,Newname);
                pstmt1.setString(2,Oldname);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setString(1,Newname);
                pstmt2.setString(2,Oldname);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setString(1,Newname);
                pstmt3.setString(2,Oldname);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setString(1,Newname);
                pstmt4.setString(2,Oldname);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardAtt_def(String name, int att_def)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET att_def = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET att_def = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET att_def = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET att_def = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET att_def = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,att_def);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,att_def);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,att_def);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,att_def);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,att_def);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardDuration(String name, int duration)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET duration = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET duration = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET duration = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET duration = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET duration = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,duration);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,duration);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,duration);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,duration);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,duration);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardDamage(String name, int damage)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET damage = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET damage = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET damage = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET damage = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET damage = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,damage);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,damage);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,damage);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,damage);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,damage);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardUpLevel(String name, int upgrade_level)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET upgrade_level = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET upgrade_level = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET upgrade_level = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET upgrade_level = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET upgrade_level = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,upgrade_level);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,upgrade_level);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,upgrade_level);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,upgrade_level);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,upgrade_level);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                //System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardUpCost(String name, int upgrade_cost)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET upgrade_cost = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET upgrade_cost = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET upgrade_cost = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET upgrade_cost = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET upgrade_cost = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,upgrade_cost);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,upgrade_cost);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,upgrade_cost);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,upgrade_cost);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,upgrade_cost);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }

        }
        public static void UpdateCardPrice(String name, int price)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE cards SET price = ? WHERE name = ?";
            String sql1 = "UPDATE LauraCards SET price = ? WHERE name = ?";
            String sql2 = "UPDATE MaxCards SET price = ? WHERE name = ?";
            String sql3 = "UPDATE StevenCards SET price = ? WHERE name = ?";
            String sql4 = "UPDATE UmaCards SET price = ? WHERE name = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,price);
                pstmt.setString(2,name);
                pstmt.executeUpdate();
                PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                pstmt1.setInt(1,price);
                pstmt1.setString(2,name);
                pstmt1.executeUpdate();
                PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                pstmt2.setInt(1,price);
                pstmt2.setString(2,name);
                pstmt2.executeUpdate();
                PreparedStatement pstmt3 = connection.prepareStatement(sql3);
                pstmt3.setInt(1,price);
                pstmt3.setString(2,name);
                pstmt3.executeUpdate();
                PreparedStatement pstmt4 = connection.prepareStatement(sql4);
                pstmt4.setInt(1,price);
                pstmt4.setString(2,name);
                pstmt4.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }
        }
        ////level xp coins
        public static void UpdateWallet(String Username, int level, int coins, int xp)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET level = ?, coins = ?, xp = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1,level);
                pstmt.setInt(2,coins);
                pstmt.setInt(3,xp);
                pstmt.setString(4,Username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally{
                connection.close();
            }
        }
        public static void UpdateSecurityAnswer(String Username, String sec)throws SQLException
        {
            connectToDatabase();
            String sql = "UPDATE users SET sec_answer = ? WHERE username = ?";
            try{
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,sec);
                pstmt.setString(2,Username);
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
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
                    User user = new User(rs.getString("mail"),rs.getString("username"),
                            rs.getString("password"),rs.getString("sec_question"),rs.getString("sec_answer"),
                            rs.getString("nickname"),rs.getString("ownedCards"),rs.getString("UpgradedCards"),
                            rs.getInt("level"),rs.getInt("xp"),rs.getInt("coins"));
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
        public static void readCards() throws SQLException {
            connectToDatabase();
            String sql = "SELECT * FROM cards";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    Cards card = new Cards(rs.getInt("number"),rs.getString("name"),rs.getInt("att_def"),rs.getInt("duration"),rs.getInt("damage"),rs.getInt("upgrade_level"),rs.getInt("upgrade_cost"),rs.getInt("price"),rs.getInt("colour"));
                    Cards.cards.add(card);
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
}