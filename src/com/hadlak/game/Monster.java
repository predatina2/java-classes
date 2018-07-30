package com.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Character implements ISaveable {

    private String specialMove;

    public Monster(String name, int health, String weapon, String specialMove) {
        super(name, health, weapon);
        this.specialMove = specialMove;
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
            Monster comparable = (Monster) list.get(i);
            if (comparable.toString().equals(this.toString())){
                this.setHealth(comparable.getHealth());
                this.setWeapon(comparable.getWeapon());
                this.setSpecialMove(comparable.getSpecialMove());
                return true;
            }
        }
        return false;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }


}
