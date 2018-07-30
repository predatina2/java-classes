package com.hadlak.game;

import java.util.ArrayList;

public class GameApp {

    public static void main(String[] args) {

        var players = new ArrayList<Player>();
        var monsters = new ArrayList<Monster>();

        var player1 = new Player("Tom TikTak", 30, "Sword", "Singing");
        var player2 = new Player("Anja Haudrauf", 20, "Canon", "Slashing");
        var player3 = new Player("Tritt Mich", 80, "Tank", "Stopping hard units");
        var player4 = new Player("Melodie Pea", 15, "Long Sword", "Jumping high");

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        var monster1 = new Monster("Hard Peter", 300, "Keule", "very Big");
        var monster2 = new Monster("little Spider", 60, "Silk", "comes around you");
        var monster3 = new Monster("Magician", 40, "tree", "invisible");
        var monster4 = new Monster("Birdy", 80, "Schnabel", "can attack from air");

        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
        monsters.add(monster4);

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health = " + player1.healthRemaining());

        damage = 11;
        player1.setHealth(200);
        player1.loseHealth(damage);
        System.out.println("Remaining health = " + player1.healthRemaining());



    }


}
