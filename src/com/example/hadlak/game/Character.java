package com.example.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public abstract class Character implements Saveable {

    private String name;
    private int strength;
    private int hitPoints;

    public Character(String name, int hitPoints, int strength) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    public void loseHealth(int damage) {
        this.hitPoints += damage;
        if (this.hitPoints >= this.strength) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                '}';
    }

    @Override
    public List<Character> saveToList(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            var comparable = list.get(i).toString();
            if (comparable.equals(this.toString())) {
                list.set(i, this);
                return list;
            }
        }
        list.add(this);
        return list;
    }

    @Override
    public boolean updateFromList(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            var comparable = list.get(i);
            if (comparable.toString().equals(this.toString())) {
                this.name = (comparable.getName());
                this.strength = (comparable.getStrength());
                this.hitPoints = (comparable.getHitPoints());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> write() {
        var values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, String.valueOf(this.hitPoints));
        values.add(2, String.valueOf(this.strength));
        return values;
    }

    @Override
    public boolean read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() >= 3) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.valueOf(savedValues.get(1)).intValue();
            this.strength = Integer.valueOf(savedValues.get(2)).intValue();
            return true;
        }
        return false;
    } // TODO this solution is not sizable for later
}
