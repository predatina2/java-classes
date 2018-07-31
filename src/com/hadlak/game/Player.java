package com.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character implements ISaveable {

    /* this is a NEGATIVE code example <-- anti encapsulation !!!! */

    private String specialSkill;

    public Player(String name, int hitPoints, int strength, String specialSkill) {
        super(name, hitPoints, strength);
        this.specialSkill = specialSkill;
    }

    @Override
    public List<Character> saveToList(List<Character> list) {
        for (int i = 0; i < list.size(); i++){
            var comparable = list.get(i).toString();
            if (comparable.equals(this.toString())){
                list.set(i, this);
                return list;
            }
        }
        list.add(this);
        return list;
    }

    @Override
    public boolean updateFromList(List<Character> list) {
        for (int i = 0; i < list.size(); i++){
            Player comparable = (Player) list.get(i);
            if (comparable.toString().equals(this.toString())){
                this.setStrength(comparable.getStrength());
                this.setWeapon(comparable.getWeapon());
                this.setSpecialSkill(comparable.getSpecialSkill());
                return true;
            }
        }
        return false;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + super.getName() +'\"' +
                "hitPoints='" + super.getHitPoints() +'\"' +
                "strength='" + super.getStrength() +'\"' +
                "weapon='" + super.getWeapon() +'\"' +
                "specialSkill='" + specialSkill + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        var values = new ArrayList<String>();
        values.add(0, super.getName());
        values.add(1, String.valueOf(super.getHitPoints()));
        values.add(2, String.valueOf(super.getStrength()));
        values.add(3, super.getWeapon());
        values.add(4, this.specialSkill);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() == 5){
            super.setName(savedValues.get(0));
            super.setHitPoints(Integer.valueOf(savedValues.get(1)).intValue());
            super.setStrength(Integer.valueOf(savedValues.get(2)).intValue());
            super.setWeapon(savedValues.get(3));
            this.specialSkill = savedValues.get(4);
        }
    }
}
