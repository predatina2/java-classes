package com.hadlak.game;

import java.util.ArrayList;

public class GameApp {

    public static void main(String[] args) {

        var players = new ArrayList<Player>();
        var monsters = new ArrayList<Monster>();

        var player1 = new Player("Tom TikTak", 10,30, "Singing");
        var player2 = new Player("Anja Haudrauf", 0,20, "Slashing");
        var player3 = new Player("Tritt Mich", 0,80, "Stopping hard units");
        var player4 = new Player("Melodie Pea", 0,15, "Jumping high");

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        var monster1 = new Monster("Hard Peter",0 ,300, "very Big");
        var monster2 = new Monster("little Spider", 0,60, "comes around you");
        var monster3 = new Monster("Magician",0 ,40, "invisible");
        var monster4 = new Monster("Birdy",0 ,80, "can attack from air");

        monsters.add(monster1);
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

    public static void saveObject(ISaveable objectToSave){

    }

    public static void loadObject(ISaveable objectToLoad){

    }


}
