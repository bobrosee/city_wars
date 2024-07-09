package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class storeController implements Initializable {
    @FXML
    public ImageView Arnold;

    @FXML
    public ImageView Belasphemous;

    @FXML
    public ImageView Kopy;

    @FXML
    public ImageView LesFerdinand;

    @FXML
    public ImageView ShatteredAugmentation;

    @FXML
    public ImageView ShatteredWrath;

    @FXML
    public ImageView ShockAndAwe;

    @FXML
    public ImageView ShockAttack;

    @FXML
    public ImageView Suii;

    @FXML
    public ImageView acidEvaporation;

    @FXML
    public ImageView acidicCleanser;

    @FXML
    public ImageView bikeSupport;

    @FXML
    public ImageView bodySnatcher;

    @FXML
    public ImageView bubbleBlast;

    @FXML
    public ImageView bulletFlurry;

    @FXML
    public ImageView chemicalChaos;

    @FXML
    public ImageView chrisCross;

    @FXML
    public ImageView condenserFire;

    @FXML
    public ImageView crouchingBlast;

    @FXML
    public ImageView cryoDisintegration;

    @FXML
    public ImageView cryoMeltdown;

    @FXML
    public ImageView electroBlast;

    @FXML
    public ImageView fallingVenom;

    @FXML
    public ImageView flashPellets;

    @FXML
    public ImageView fracturedButWhole;

    @FXML
    public ImageView fromTheHip;

    @FXML
    public ImageView gadgetBacklash;

    @FXML
    public ImageView gadgetBackup;

    @FXML
    public ImageView gapAbsorber;

    @FXML
    public ImageView helenHealer;

    @FXML
    public ImageView ionBlast;

    @FXML
    public Label label1;

    @FXML
    public Label label2;

    @FXML
    public Label label3;

    @FXML
    public Label label4;
    @FXML
    public Label label5;
    @FXML
    public Label label6;

    @FXML
    public ImageView medBotShield;

    @FXML
    public ImageView mercilessConatgion;

    @FXML
    public ImageView poisonDispersal;

    @FXML
    public ImageView powerBeam;

    @FXML
    public ImageView reinforcedBlitz;

    @FXML
    public ImageView shockDissolver;

    @FXML
    public ImageView shockImpairment;

    @FXML
    public ImageView sniperSupport;

    @FXML
    public ImageView sonarStrike;

    @FXML
    public ImageView sprayAndPray;

    @FXML
    public ImageView stealthSupport;

    @FXML
    public ImageView thermoExtinguisher;

    @FXML
    public ImageView vapourShockwave;
    @FXML
    public void setAcidEvaporation(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("acidEvaporation"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(24,"acidEvaporation",36,1,25,5,300,500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setAcidicCleanser(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("acidicCleanser"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(17,"acidicCleanser",29,1,33,5,600,1000,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setArnold(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("Arnold"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(39,"Arnold",99,1,0,9999,9999,1500,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setBelasphemous(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("Belasphemous"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(44,"Belasphemous",99,1,0,9999,9999,1500,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setBikeSupport(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("bikerSupport"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(34,"bikerSupport",30,3,21,8,600,1500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setBodySnatcher(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("BodySnatcher"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1200)
            {
                User.users.get(User.logged).coins -= 1200;
                Cards card = new Cards(37,"BodySnatcher",99,1,0,9999,9999,1200,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setBubbleBlast(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("bulletBlast"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(21,"bulletBlast",28,2,30,7,100,500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setBulletFlurry(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("bulletFlurry"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 150)
            {
                User.users.get(User.logged).coins -= 150;
                Cards card = new Cards(23,"bulletFlurry",26,4,36,2,50,150,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setChemicalChaos(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("chemicalChaos"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 700)
            {
                User.users.get(User.logged).coins -= 700;
                Cards card = new Cards(1,"chemicalChaos",30,2,30,7,500,700,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setChrisCross(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("chrisCross"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(36,"chrisCross",0,1,0,99,99999,1500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setCondenserFire(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("condenserFire"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 2500)
            {
                User.users.get(User.logged).coins -= 2500;
                Cards card = new Cards(7,"condenserFire",30,3,45,7,1500,2500,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setCrouchingBlast(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("crouchingBlast"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1100)
            {
                User.users.get(User.logged).coins -= 1100;
                Cards card = new Cards(13,"crouchingBlast",31,1,40,7,1000,1100,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setCryoDisintegration(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("cryoDisintegration"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 100)
            {
                User.users.get(User.logged).coins -= 100;
                Cards card = new Cards(31,"cryoDisintegration",27,1,30,5,10,100,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setCryoMeltdown(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("cryoMeltdown"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(26,"cryoMeltdown",33,1,25,7,200,750,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setElectroBlast(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("electroBlast"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(2,"electroBlast",29,2,38,7,700,1000,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setFallingVenom(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("fallingVenom"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(15,"fallingVenom",31,4,32,5,100,500,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setFlashPellets(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("flashPellets"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(22,"flashPellets",29,4,28,3,100,500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setFracturedButWhole(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("FracturedButWhole"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(42,"FracturedButWhole",99,1,0,99,99999,1000,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setFromTheHip(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("fromTheHip"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(10,"fromTheHip",28,1,28,3,350,1000,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setGadgetBacklash(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("gadgetBacklash"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1250)
            {
                User.users.get(User.logged).coins -= 1250;
                Cards card = new Cards(14,"gadgetBacklash",27,3,15,3,1000,1250,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setGadgetBackup(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("gadgetBackup"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(32,"gadgetBackup",32,2,36,7,150,500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setGapAbsorber(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("gapAbsorber"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(29,"gapAbsorber",99,1,0,99,99999,750,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setHelenHealer(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("HelenHealer"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 2000)
            {
                User.users.get(User.logged).coins -= 2000;
                Cards card = new Cards(38,"HelenHealer",0,1,0,99,99999,2000,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setIonBlast(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("ionBurst"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 150)
            {
                User.users.get(User.logged).coins -= 150;
                Cards card = new Cards(4,"ionBurst",28,3,25,3,50,150,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setKopy(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("Kopy"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1200)
            {
                User.users.get(User.logged).coins -= 1200;
                Cards card = new Cards(40,"Kopy",99,1,0,99,99999,1200,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setLesFerdinand(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("LesFerdinand"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(41,"LesFerdinand",99,1,0,99,99999,1000,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setMedBotShield(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("medBotShield"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(25,"medBotShield",99,1,0,99,99999,750,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setMercilessConatgion(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("mercilessContagion"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 2000)
            {
                User.users.get(User.logged).coins -= 2000;
                Cards card = new Cards(6,"mercilessContagion",37,3,48,10,900,2000,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setPoisonDispersal(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("poisonDispersal"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(16,"poisonDispersal",30,1,36,5,600,1000,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setPowerBeam(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("powerBeam"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 2500)
            {
                User.users.get(User.logged).coins -= 2500;
                Cards card = new Cards(12,"powerBeam",31,5,30,5,1500,2500,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setReinforcedBlitz(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("reinforcedBlitz"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(27,"reinforcedBlitz",27,4,20,5,600,1000,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShatteredAugmentation(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shatteredAugmentation"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(19,"shatteredAugmentation",25,5,40,3,1000,1000,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShatteredWrath(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shatteredWrath"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(18,"shatteredWrath",20,4,40,3,300,750,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShockAndAwe(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shockAndAwe"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1000)
            {
                User.users.get(User.logged).coins -= 1000;
                Cards card = new Cards(20,"shockAndAwe",28,4,40,5,5000,1000,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShockAttack(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shockAttack"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(28,"shockAttack",99,1,0,99,99999,500,0);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShockDissolver(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shockDissolver"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(33,"shockDissolver",27,1,39,7,800,1500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setShockImpairment(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("shockImpairment"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1700)
            {
                User.users.get(User.logged).coins -= 1700;
                Cards card = new Cards(9,"shockImpairment",37,1,25,5,700,1700,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setSniperSupport(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("sniperSupport"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 500)
            {
                User.users.get(User.logged).coins -= 500;
                Cards card = new Cards(35,"sniperSupport",27,1,20,9,200,500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setSonarStrike(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("sonarStrike"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(30,"sonarStrike",28,1,15,5,350,750,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setSprayAndPray(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("sprayAndPray"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(11,"sprayAndPray",35,5,55,15,200,750,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setStealthSupport(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("stealthSupport"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 750)
            {
                User.users.get(User.logged).coins -= 750;
                Cards card = new Cards(3,"stealthSupport",29,2,20,5,300,750,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setSuii(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("Suii"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 2500)
            {
                User.users.get(User.logged).coins -= 2500;
                Cards card = new Cards(43,"Suii",0,1,0,99,99999,2500,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setThermoExtinguisher(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("thermoExtinguisher"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(5,"thermoExtinguisher",31,1,45,10,800,1500,2);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }
    @FXML
    public void setVapourShockwave(){
        Boolean flag = false;
        for(Cards card : User.users.get(User.logged).cards)
        {
            if(card.name.equals("vapourShockwave"))
            {
                flag = true;
                if(User.users.get(User.logged).getLevel() >= card.upgrade_level && User.users.get(User.logged).coins > card.upgrade_cost)
                {
                    User.users.get(User.logged).UpgradeCards.add(card.number);
                    User.users.get(User.logged).coins -= card.upgrade_cost;
                    card.damage = (int)(1.2 * card.damage);
                    card.att_def = (int)(1.2 * card.att_def);
                    label1.setText("Card was upgraded successfully!");
                    label1.setStyle("-fx-text-fill: green");
                    label2.setText("Card was upgraded successfully!");
                    label2.setStyle("-fx-text-fill: green");
                    label3.setText("Card was upgraded successfully!");
                    label3.setStyle("-fx-text-fill: green");
                    label4.setText("Card was upgraded successfully!");
                    label4.setStyle("-fx-text-fill: green");
                    label5.setText("Card was upgraded successfully!");
                    label5.setStyle("-fx-text-fill: green");
                    label6.setText("Card was upgraded successfully!");
                    label6.setStyle("-fx-text-fill: green");
                }
                else{
                    label1.setText("You cannot upgrade this card");
                    label1.setStyle("-fx-text-fill: red");
                    label2.setText("You cannot upgrade this card");
                    label2.setStyle("-fx-text-fill: red");
                    label3.setText("You cannot upgrade this card");
                    label3.setStyle("-fx-text-fill: red");
                    label4.setText("You cannot upgrade this card");
                    label4.setStyle("-fx-text-fill: red");
                    label5.setText("You cannot upgrade this card");
                    label5.setStyle("-fx-text-fill: red");
                    label6.setText("You cannot upgrade this card");
                    label6.setStyle("-fx-text-fill: red");
                }
                break;
            }
        }
        if(!flag)
        {
            if(User.users.get(User.logged).coins > 1500)
            {
                User.users.get(User.logged).coins -= 1500;
                Cards card = new Cards(8,"vapourShockwave",35,4,40,8,800,700,1);
                User.users.get(User.logged).cards.add(card);
                label1.setText("Card was bought successfully!");
                label1.setStyle("-fx-text-fill: green");
                label2.setText("Card was bought successfully!");
                label2.setStyle("-fx-text-fill: green");
                label3.setText("Card was bought successfully!");
                label3.setStyle("-fx-text-fill: green");
                label4.setText("Card was bought successfully!");
                label4.setStyle("-fx-text-fill: green");
                label5.setText("Card was bought successfully!");
                label5.setStyle("-fx-text-fill: green");
                label6.setText("Card was bought successfully!");
                label6.setStyle("-fx-text-fill: green");
            }
            else{
                label1.setText("You cannot buy this card");
                label1.setStyle("-fx-text-fill: red");
                label2.setText("You cannot buy this card");
                label2.setStyle("-fx-text-fill: red");
                label3.setText("You cannot buy this card");
                label3.setStyle("-fx-text-fill: red");
                label4.setText("You cannot buy this card");
                label4.setStyle("-fx-text-fill: red");
                label5.setText("You cannot buy this card");
                label5.setStyle("-fx-text-fill: red");
                label6.setText("You cannot buy this card");
                label6.setStyle("-fx-text-fill: red");
            }
        }
    }


    @FXML
    public void setExit(){
        try {
            // Load the new scene
            Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

            // Create a new scene with the loaded parent
            Scene scene = new Scene(root);
//                scene.getStylesheets().add(getClass().getResource("CSS/main.css").toExternalForm());

            // Get the current stage
            Stage stage = (Stage) vapourShockwave.getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);

            // Make the stage full screen
//            stage.setFullScreen(true);
//            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Image image = new Image("file:G:/cards/chemicalChaos2.png");
                Boolean flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("chemicalChaos"))
                    {
                        flag = true;
                        chemicalChaos.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/chemicalChaos1.png");
                    chemicalChaos.setImage(image);
                }
                image = new Image("file:G:/cards/electroBlast2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("electroBlast"))
                    {
                        flag = true;
                        electroBlast.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/electroBlast1.png");
                    electroBlast.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/stealthSupport2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("stealthSupport"))
                    {
                        flag = true;
                        stealthSupport.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/stealthSupport1.png");
                    stealthSupport.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/ionBlast2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("ionBurst"))
                    {
                        flag = true;
                        ionBlast.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/ionBlast1.png");
                    ionBlast.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/thermoExtinguisher2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("thermoExtinguisher"))
                    {
                        flag = true;
                        thermoExtinguisher.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/thermoExtinguisher1.png");
                    thermoExtinguisher.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/mercilessContagion2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("mercilessContagion"))
                    {
                        flag = true;
                        mercilessConatgion.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/mercilessContagion1.png");
                    mercilessConatgion.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/condenserFire2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("condenserFire"))
                    {
                        flag = true;
                        condenserFire.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/condenserFire1.png");
                    condenserFire.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/vapourShockwave2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("vapourShockwave"))
                    {
                        flag = true;
                        vapourShockwave.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/vapourShockwave1.png");
                    vapourShockwave.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shockImpairment2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shockImpairment"))
                    {
                        flag = true;
                        shockImpairment.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shockImpairment1.png");
                    shockImpairment.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/fromTheHip2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("fromTheHip"))
                    {
                        flag = true;
                        fromTheHip.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/fromTheHip1.png");
                    fromTheHip.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/sprayAndPray2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("sprayAndPray"))
                    {
                        flag = true;
                        sprayAndPray.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/sprayAndPray1.png");
                    sprayAndPray.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/powerBeam2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("powerBeam"))
                    {
                        flag = true;
                        powerBeam.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/powerBeam1.png");
                    powerBeam.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/crouchingBlast2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("crouchingBlast"))
                    {
                        flag = true;
                        crouchingBlast.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/crouchingBlast1.png");
                    crouchingBlast.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/gadgetBacklash2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("gadgetBacklash"))
                    {
                        flag = true;
                        gadgetBacklash.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/gadgetBacklash1.png");
                    gadgetBacklash.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/fallingVenom2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("fallingVenom"))
                    {
                        flag = true;
                        fallingVenom.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/fallingVenom1.png");
                    fallingVenom.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/poisonDispersal2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("poisonDispersal"))
                    {
                        flag = true;
                        poisonDispersal.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/poisonDispersal1.png");
                    poisonDispersal.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/acidicCleanser2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("acidicCleanser"))
                    {
                        flag = true;
                        acidicCleanser.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/acidicCleanser1.png");
                    acidicCleanser.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shatteredWrath2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shatteredWrath"))
                    {
                        flag = true;
                        ShatteredWrath.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shatteredWrath1.png");
                    ShatteredWrath.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shatteredAugmentation2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shatteredAugmentation"))
                    {
                        flag = true;
                        ShatteredAugmentation.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shatteredAugmentation1.png");
                    ShatteredAugmentation.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shockAndAwe2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shockAndAwe"))
                    {
                        flag = true;
                        ShockAndAwe.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shockAndAwe1.png");
                    ShockAndAwe.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/bubbleBlast2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("bulletBlast"))
                    {
                        flag = true;
                        bubbleBlast.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/bubbleBlast1.png");
                    bubbleBlast.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/flashPellets2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("flashPellets"))
                    {
                        flag = true;
                        flashPellets.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/flashPellets1.png");
                    flashPellets.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/bulletFlurry2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("bulletFlurry"))
                    {
                        flag = true;
                        bulletFlurry.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/bulletFlurry1.png");
                    bulletFlurry.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/acidEvaporation2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("acidEvaporation"))
                    {
                        flag = true;
                        acidEvaporation.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/acidEvaporation1.png");
                    acidEvaporation.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/medBotShield2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("medBotShield"))
                    {
                        flag = true;
                        medBotShield.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/medBotShield1.png");
                    medBotShield.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/cryoMeltdown2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("cryoMeltdown"))
                    {
                        flag = true;
                        cryoMeltdown.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/cryoMeltdown1.png");
                    cryoMeltdown.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/reinforcedBlitz2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("reinforcedBlitz"))
                    {
                        flag = true;
                        reinforcedBlitz.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/reinforcedBlitz1.png");
                    reinforcedBlitz.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shockAttack2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shockAttack"))
                    {
                        flag = true;
                        ShockAttack.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shockAttack1.png");
                    ShockAttack.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/gapAbsorber2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("gapAbsorber"))
                    {
                        flag = true;
                        gapAbsorber.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/gapAbsorber1.png");
                    gapAbsorber.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/sonarStrike2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("sonarStrike"))
                    {
                        flag = true;
                        sonarStrike.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/sonarStrike1.png");
                    sonarStrike.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/cryoDisintegration2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("cryoDisintegration"))
                    {
                        flag = true;
                        cryoDisintegration.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/cryoDisintegration1.png");
                    cryoDisintegration.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/gadgetBackup2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("gadgetBackup"))
                    {
                        flag = true;
                        gadgetBackup.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/gadgetBackup1.png");
                    gadgetBackup.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/shockDissolver2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("shockDissolver"))
                    {
                        flag = true;
                        shockDissolver.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/shockDissolver1.png");
                    shockDissolver.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/bikeSupport2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("bikerSupport"))
                    {
                        flag = true;
                        bikeSupport.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/bikeSupport1.png");
                    bikeSupport.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/sniperSupport2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("sniperSupport"))
                    {
                        flag = true;
                        sniperSupport.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/sniperSupport1.png");
                    sniperSupport.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/chrisCross2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("chrisCross"))
                    {
                        flag = true;
                        chrisCross.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/chrisCross1.png");
                    chrisCross.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/bodySnatcher2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("BodySnatcher"))
                    {
                        flag = true;
                        bodySnatcher.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/bodySnatcher1.png");
                    bodySnatcher.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/helenHealer2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("HelenHealer"))
                    {
                        flag = true;
                        helenHealer.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/helenHealer1.png");
                    helenHealer.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/Arnold2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("Arnold"))
                    {
                        flag = true;
                        Arnold.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/Arnold1.png");
                    Arnold.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/Kopy2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("Kopy"))
                    {
                        flag = true;
                        Kopy.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/Kopy1.png");
                    Kopy.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/LesFerdinand2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("LesFerdinand"))
                    {
                        flag = true;
                        LesFerdinand.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/LesFerdinand1.png");
                    LesFerdinand.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/fracturedButWhole2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("FracturedButWhole"))
                    {
                        flag = true;
                        fracturedButWhole.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/fracturedButWhole1.png");
                    fracturedButWhole.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/Suii2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("Suii"))
                    {
                        flag = true;
                        Suii.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/Suii1.png");
                    Suii.setImage(image);
                }
                /////////////////////
                image = new Image("file:G:/cards/Belasphemous2.png");
                flag = false;
                for(Cards card : User.users.get(User.logged).cards)
                {
                    if(card.name.equals("Belasphemous"))
                    {
                        flag = true;
                        Belasphemous.setImage(image);
                        break;
                    }
                }
                if(!flag)
                {
                    image = new Image("file:G:/cards/Belasphemous1.png");
                    Belasphemous.setImage(image);
                }








            }
        });
    }
}
