package com.example.hadlak.game;

import java.util.ArrayList;
import java.util.List;

import static com.example.hadlak.Utilities.readValues;

public class GameApp {

    public static void main(String[] args) {

        Board myBoard = new Board(8);
        myBoard.printBoard();

        var players = new ArrayList<Player>();
        var monsters = new ArrayList<Monster>();

        var player1 = new Player("Tom TikTak", 10,30, "Singing");
        var player2 = new Player("Anja Haudrauf", 0,20, "Slashing");
        var player3 = new Player("Tritt Mich", 0,80, "Stopping hard units");
        var player4 = new Player("Melodie Pea", 0,15, "Jumping high");

        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());
        System.out.println(player4.toString());

        player1.setWeapon("Stormbringer");
        saveObject(player1);
        loadObject(player1);
        System.out.println(player1);


        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        Saveable monster1 = new Monster("Werewolf",0 ,300, "very Big");
        System.out.println("strength of monster: " + ((Monster) monster1).getStrength());
        var monster2 = new Monster("little Spider", 0,60, "comes around you");
        var monster3 = new Monster("Magician",0 ,40, "invisible");
        var monster4 = new Monster("Birdy",0 ,80, "can attack from air");

        // monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
        monsters.add(monster4);

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health = " + player1.getRemainingHealth());

        damage = 11;
        player1.setStrength(200);
        player1.loseHealth(damage);
        System.out.println("Remaining health = " + player1.getRemainingHealth());



    }

    public static List<String> saveObject(Saveable objectToSave){
        List<String> values = objectToSave.write();
        for (int i= 0; i < values.size(); i++){
            System.out.println("Saving " + values.get(i) + " to storage device");
        }
        return values;
    }

    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


}
