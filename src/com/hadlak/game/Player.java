package com.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character implements ISaveable {

    /* this is a NEGATIVE code example <-- anti encapsulation !!!! */

    private String specialSkill;

    public Player(String name, int health, String weapon, String specialSkill) {
        super(name, health, weapon);
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
                this.setHealth(comparable.getHealth());
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
}
