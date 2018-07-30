package com.hadlak.game;

public class Character {

    private String name;
    private int health;
    private String weapon;

    public Character(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println(name + "knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
