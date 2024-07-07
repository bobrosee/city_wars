package org.example.project_graphic;

import java.util.*;
import java.io.*;
public class User {
    private int xp;
    private int level;
    private String mail;
    private String username;
    private String password;
    private String sec_question;
    private String sec_answer;
    private String nickname;
    public ArrayList<Cards> cards = new ArrayList<Cards>();
    public ArrayList<Integer> UpgradeCards = new ArrayList<>();
    int coins;
    public Boolean login = false;
    String ownedCards = "";
    String UpgradedCards="";
    static ArrayList<User> users = new ArrayList<>();
    static int logged = -1;
    static int Log2 = -1;
    public User(String mail, String username, String password, String sec_question, String sec_answer,String nickname, String ownedCards, String UpgradedCards, int level, int xp, int coins) {
        this.mail = mail;
        this.ownedCards = ownedCards;
        this.username = username;
        this.password = password;
        this.sec_question = sec_question;
        this.sec_answer = sec_answer;
        this.nickname = nickname;
        this.level = level;
        this.coins = coins;
        this.xp = xp;
        this.UpgradedCards = UpgradedCards;
    }

    public String getMail() {
        return mail;
    }
    public String getOwnedCards() {return this.ownedCards;}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSec_question() {
        return sec_question;
    }

    public String getSec_answer() {
        return sec_answer;
    }

    public int getLevel() {
        return level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSec_question(String sec_question) {
        this.sec_question = sec_question;
    }

    public void setSec_answer(String sec_answer) {
        this.sec_answer = sec_answer;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
