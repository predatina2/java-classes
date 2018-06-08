package com.hadlak.game;

public class Player {

    /* this is a NEGATIVE code example <-- anti encapsulation !!!! */

    public String fullName;
    public int health;
    public String weapon;

//    Player player = new Player();
//    player.fullName = "Tim";
//    player.health = 20;
//    player.weapon = "Sowrd";
//
//    int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining helth = " + player.healthRemaining());
//
//    damage = 11;
//    player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining helth = " + player.healthRemaining());

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining to the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
