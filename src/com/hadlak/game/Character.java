package com.hadlak.game;

public class Character {

    private String name;
    private int strength;
    private String weapon;
    private int hitPoints;

    public Character(String name, int hitPoints, int strength) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = "stick";

    }

    public void loseHealth(int damage) {
        this.hitPoints += damage;
        if (this.hitPoints >= this.strength){
            this.hitPoints = this.strength;
            System.out.println(name + "knocked out");
        }
    }

    public int getRemainingHealth() {
        return this.strength - this.hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
