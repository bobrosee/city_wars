package org.example.project_graphic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;

public class gameController implements Initializable {
    @FXML
    TextField input;
    @FXML
     Button apply;

    @FXML
    Text cards1;
    @FXML
    Text cards2;

    @FXML
     ImageView char1;

    @FXML
     ImageView char2;

    @FXML
     Text damage1;

    @FXML
     Text damage2;

    @FXML
     Text hp1;

    @FXML
     Text hp2;

    @FXML
     Label message;

    @FXML
     Text time1;

    @FXML
     Text time2;
    static boolean mode = false;
    static int character1;
    static int character2;
    static int HostHp, GuestHp;
    static int HostDamage, GuestDamage;
    static ArrayList<Cards> HostFinalCards;
    static ArrayList<Cards> GuestFinalCards = new ArrayList<Cards>();
    static ArrayList<Cards> HostRoundCards = new ArrayList<Cards>();
    static ArrayList<Cards> GuestRoundCards;
    static ArrayList<Cards> HostTimeline;
    static ArrayList<Cards> GuestTimeline;
    static int roundHost, roundGuest;
    static int counterHost, counterGuest;
    static boolean player;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Collections.shuffle(HostFinalCards);
                Collections.shuffle(GuestFinalCards);
                HostRoundCards.add(HostFinalCards.get(0));
                HostRoundCards.add(HostFinalCards.get(1));
                HostRoundCards.add(HostFinalCards.get(2));
                HostRoundCards.add(HostFinalCards.get(3));
                HostRoundCards.add(HostFinalCards.get(4));

                GuestRoundCards.add(GuestFinalCards.get(0));
                GuestRoundCards.add(GuestFinalCards.get(1));
                GuestRoundCards.add(GuestFinalCards.get(2));
                GuestRoundCards.add(GuestFinalCards.get(3));
                GuestRoundCards.add(GuestFinalCards.get(4));
                for (int i = 0; i < 20; i++) {
                    Cards khali = new Cards(99,"null",0,1,0,0,0,0,0);
                    HostTimeline.add(khali);
                    Cards khali1 = new Cards(99,"null",0,1,0,0,0,0,0);
                    GuestTimeline.add(khali1);
                }
                Random rand = new Random();
                int random;
                Cards hole = new Cards(99,"Hole",0,1,0,0,0,0,0);
                random = rand.nextInt(21);
                HostTimeline.add(random,hole);
                Cards hole1 = new Cards(99,"Hole",0,1,0,0,0,0,0);
                random = rand.nextInt(21);
                GuestTimeline.add(random,hole1);
                counterGuest = 1;
                counterHost = 1;
                roundHost = 5;
                roundGuest = 5;
                String t1 = "";
                for (int i = 0; i < HostTimeline.size(); i++) {
                    t1 += HostTimeline.get(i).name + " ";
                }
                time1.setText(t1);
                String t2 = "";
                for (int i = 0; i < GuestTimeline.size(); i++) {
                    t2 += GuestTimeline.get(i).name + " ";
                }
                time2.setText(t2);
                t1 = "";
                for (int i = 0; i < HostRoundCards.size(); i++) {
                    t1 += HostRoundCards.get(i).name + " ";
                }
                cards1.setText(t1);
                t1 = "";
                for (int i = 0; i < GuestRoundCards.size(); i++) {
                    t1 += GuestRoundCards.get(i).name + " ";
                }
                cards2.setText(t1);


                if(character1 == 1)
                {
                    Image image = new Image("file:G:/characters/steven.png");
                    char1.setImage(image);
                }
                else if(character1 == 2)
                {
                    Image image = new Image("file:G:/characters/Uma.jpg");
                    char1.setImage(image);
                }
                else if(character1 == 3)
                {
                    Image image = new Image("file:G:/characters/max.jpg");
                    char1.setImage(image);
                }
                else if(character1 == 4)
                {
                    Image image = new Image("file:G:/characters/laura.jpg");
                    char1.setImage(image);
                }
                if(character2 == 1)
                {
                    Image image = new Image("file:G:/characters/steven.png");
                    char2.setImage(image);
                }
                else if(character2 == 2)
                {
                    Image image = new Image("file:G:/characters/Uma.jpg");
                    char2.setImage(image);
                }
                else if(character2 == 3)
                {
                    Image image = new Image("file:G:/characters/max.jpg");
                    char2.setImage(image);
                }
                else if(character2 == 4)
                {
                    Image image = new Image("file:G:/characters/laura.jpg");
                    char2.setImage(image);
                }
                hp1.setText("hp: " + HostHp);
                hp2.setText("hp: " + GuestHp);
                damage1.setText("damage: " + HostDamage);
                damage2.setText("damage: " + GuestDamage);
            }
        });
    }
    @FXML
    public void setApply(){
        String string = input.textProperty().get();
        if(string.matches("-Select card number \\d player \\d"))
        {
            String[] inputs = string.split(" ");
            if(inputs[5].equals("1"))
            {
                int a = Integer.parseInt(inputs[3]);
                a--;
                message.setText("att_def: " + HostRoundCards.get(a).att_def + " damage: " + HostRoundCards.get(a).damage + " duration: " + HostRoundCards.get(a).duration);
                message.setStyle("-fx-text-fill: green");
            }
            else{
                int a = Integer.parseInt(inputs[3]);
                a--;
                message.setText("att_def: " + GuestRoundCards.get(a).att_def + " damage: " + GuestRoundCards.get(a).damage + " duration: " + GuestRoundCards.get(a).duration);
                message.setStyle("-fx-text-fill: green");
            }
        }
        if(string.matches("-Placing card number \\d in block \\d player \\d"))
        {
            String[] inputs = string.split(" ");
            if(inputs[8].equals("1"))
            {
                player = true;
                int n = Integer.parseInt(inputs[3]) - 1;
                int i = Integer.parseInt(inputs[6]) - 1;
                placeCards(n,i,HostRoundCards,HostTimeline,player,GuestRoundCards,HostTimeline,GuestTimeline);
            }
            else{
                player = false;
                int n = Integer.parseInt(inputs[3]) - 1;
                int i = Integer.parseInt(inputs[6]) - 1;
                placeCards(n,i,GuestRoundCards,GuestTimeline,player,HostRoundCards,GuestTimeline,HostTimeline);
            }
        }
        if(counterHost > roundHost && counterGuest > roundGuest)
        {
            //timeline
        }
        String t1 = "";
        for (int i = 0; i < HostTimeline.size(); i++) {
            t1 += HostTimeline.get(i).name + " ";
        }
        time1.setText(t1);

        String t2 = "";
        for (int i = 0; i < GuestTimeline.size(); i++) {
            t2 += GuestTimeline.get(i).name + " ";
        }
        time2.setText(t2);
        Collections.shuffle(HostFinalCards);
        HostRoundCards.add(HostFinalCards.get(0));
        Collections.shuffle(GuestFinalCards);
        GuestRoundCards.add(GuestFinalCards.get(0));
        t1 = "";
        for (int i = 0; i < HostRoundCards.size(); i++) {
            t1 += HostRoundCards.get(i).name + " ";
        }
        cards1.setText(t1);
        t1 = "";
        for (int i = 0; i < GuestRoundCards.size(); i++) {
            t1 += GuestRoundCards.get(i).name + " ";
        }
        cards2.setText(t1);
    }
    public void placeCards(int n,int i, ArrayList<Cards> playerCards, ArrayList<Cards> deck,Boolean player, ArrayList<Cards> enemyCards,ArrayList<Cards> playerDeck,ArrayList<Cards>EnemyDeck)
    {
        int duration = playerCards.get(n).duration;
        Boolean flag = false;
        if( i + duration > deck.size())
        {
            flag = true;
        }
        else
        {
            for(int j = 0; j < duration;j++)
            {
                if(!deck.get(i+j).name.equals("null"))
                {
                    flag = true;
                    break;
                }
            }
        }
        if(playerCards.get(n).name.equals("gapAbsorber"))
        {
            Random rand = new Random();
            int a = rand.nextInt(enemyCards.size());
            enemyCards.get(a).damage = (int)(0.8 * enemyCards.get(a).damage);
            System.out.println(enemyCards.get(a).name + "'s damage was reduced to 80%");
            int b = rand.nextInt(enemyCards.size());
            enemyCards.get(b).att_def = (int)(0.8 * enemyCards.get(b).att_def);
            System.out.println(enemyCards.get(b).name + "'s att_def was reduced to 80%");
            if(player)
            {
                playerCards.remove(n);
                counterHost++;
            }
            else{
                playerCards.remove(n);
                counterGuest++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;
        }
        if(deck.get(i).name.equals("Hole") && playerCards.get(n).name.equals("gapAbsorber"))
        {
            deck.get(i).name = "null";
            if(player)
            {
                playerCards.remove(n);
                counterHost++;
            }
            else{
                playerCards.remove(n);
                counterGuest++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;

        }
        if(!deck.get(i).name.equals("Hole") && playerCards.get(n).name.equals("gapAbsorber"))
        {
            message.setText("This card cannot be placed here!");
            message.setStyle("-fx-text-fill: red");
            return;
        }
        if(playerCards.get(n).name.equals("Arnold"))
        {
            Random rand = new Random();
            int a = rand.nextInt(playerCards.size());
            playerCards.get(a).damage = (int) (1.2 * playerCards.get(a).damage);
            playerCards.get(a).att_def = (int) (1.2 * playerCards.get(a).att_def);
            if(player)
            {
                playerCards.remove(n);
                counterHost++;
            }
            else{
                playerCards.remove(n);
                counterGuest++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;
        }
        if(playerCards.get(n).name.equals("LesFerdinand"))
        {
            if(!player)
            {
                roundHost--;
                playerCards.remove(n);
                counterGuest++;
            }
            else{
                roundGuest--;
                playerCards.remove(n);
                counterHost++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;
        }
        if(playerCards.get(n).name.equals("BodySnatcher"))
        {
            Random random = new Random();
            int a = random.nextInt(enemyCards.size());
            Cards cards = new Cards(enemyCards.get(a).number,enemyCards.get(a).name,enemyCards.get(a).att_def,enemyCards.get(a).duration,enemyCards.get(a).damage,enemyCards.get(a).upgrade_level,enemyCards.get(a).upgrade_cost,enemyCards.get(a).price,enemyCards.get(a).colour);
            enemyCards.remove(a);
            playerCards.add(cards);
            playerCards.remove(n);
            if(player)
            {
                counterHost++;
            }
            else{
                counterGuest++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;
        }
        if(playerCards.get(n).name.equals("Kopy"))
        {
            Random random = new Random();
            int a = random.nextInt(enemyCards.size());
            Cards cards = new Cards(enemyCards.get(a).number,enemyCards.get(a).name,enemyCards.get(a).att_def,enemyCards.get(a).duration,enemyCards.get(a).damage,enemyCards.get(a).upgrade_level,enemyCards.get(a).upgrade_cost,enemyCards.get(a).price,enemyCards.get(a).colour);
            playerCards.add(cards);
            playerCards.remove(n);
            if(player)
            {
                counterHost++;
            }
            else{
                counterGuest++;
            }
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            return;
        }
        if(playerCards.get(n).name.equals("FracturedButWhole"))
        {
            Random random = new Random();
            int a;
            while(true)
            {
                a = random.nextInt(EnemyDeck.size());
                if(EnemyDeck.get(a).name.equals("null"))
                {
                    EnemyDeck.get(a).name ="Hole";
                    if(player)
                    {
                        counterHost++;
                    }
                    else{
                        counterGuest++;
                    }
                    message.setText("Card was placed successfully");
                    message.setStyle("-fx-text-fill: green");
                    return;
                }
            }
        }
        if(playerCards.get(n).name.equals("Blasphemous"))
        {
            for (int j = 0; j < playerDeck.size(); j++) {
                if(playerDeck.get(j).name.equals("Hole"))
                {
                    playerDeck.get(j).name = "null";
                    if(player)
                    {
                        counterHost++;
                    }
                    else{
                        counterGuest++;
                    }
                    message.setText("Card was placed successfully");
                    message.setStyle("-fx-text-fill: green");
                    return;
                }
            }
            return;
        }

        if(!flag)
        {
            for(int j = 0; j < duration;j++)
            {
                Cards card = new Cards(playerCards.get(n).number,playerCards.get(n).name,playerCards.get(n).att_def,playerCards.get(n).duration,playerCards.get(n).damage,playerCards.get(n).upgrade_level,playerCards.get(n).upgrade_cost,playerCards.get(n).price,playerCards.get(n).colour);

                deck.get(i+j).name = card.name;
                deck.get(i+j).damage = card.damage;
                deck.get(i+j).duration = card.duration;
                deck.get(i+j).att_def = card.att_def;
                deck.get(i+j).colour = card.colour;
            }
            if(deck.get(i).duration == 1)
            {
                if(deck.get(i).name.equals("HelenHealer"))
                {
                    if(player)
                    {
                        HostHp += 40;
                        message.setText("Your were healed 40 hp! Your new hp :" + HostHp);
                        message.setStyle("-fx-text-fill: green");
                    }
                    else{
                        GuestHp += 40;
                        message.setText("Your were healed 40 hp! Your new hp :" + GuestHp);
                        message.setStyle("-fx-text-fill: green");
                    }

                }
                if(deck.get(i).name.equals("Suii"))
                {
                    if(player)
                    {
                        HostHp += GuestHp/4;
                        message.setText("Your were healed 40 hp! Your new hp :" + HostHp);
                        message.setStyle("-fx-text-fill: green");
                    }
                    else{
                        GuestHp += HostHp/4;
                        message.setText("Your were healed 40 hp! Your new hp :" + GuestHp);
                        message.setStyle("-fx-text-fill: green");
                    }
                }
                if(deck.get(i).name.equals("chrisCross"))
                {
                    Boolean flag1 = false, flag2 = false;
                    Random rand = new Random();
                    int a,b;
                    for (int j = 0; j < playerDeck.size(); j++) {
                        if(playerDeck.get(j).name.equals("Hole"))
                        {
                            playerDeck.get(j).name = "null";
                            break;
                        }
                    }
                    for (int j = 0; j < EnemyDeck.size(); j++) {
                        if(EnemyDeck.get(j).name.equals("Hole"))
                        {
                            EnemyDeck.get(j).name = "null";
                            break;
                        }
                    }
                    while(!flag1 || flag2)
                    {
                        a = rand.nextInt(playerDeck.size());
                        b = rand.nextInt(EnemyDeck.size());
                        if(playerDeck.get(a).name.equals("null"))
                        {
                            playerDeck.get(a).name = "Hole";
                            flag1 = true;
                        }
                        if(EnemyDeck.get(b).name.equals("null"))
                        {
                            EnemyDeck.get(b).name = "Hole";
                            flag1 = true;
                        }
                    }

                }
            }
            playerCards.remove(n);
            message.setText("Card was placed successfully");
            message.setStyle("-fx-text-fill: green");
            if(player)
            {
                counterHost++;
            }
            else{
                counterGuest++;
            }
        }
        else{
            message.setText("Card cannot be placed there");
            message.setStyle("-fx-text-fill: red");
        }
        ////spells
    }


}
