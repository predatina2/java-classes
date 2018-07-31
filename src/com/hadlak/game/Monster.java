package com.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Character implements ISaveable {

    private String specialMove;

    public Monster(String name, int hitPoints, int strength, String specialMove) {
        super(name, hitPoints, strength);
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
                this.setStrength(comparable.getStrength());
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

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + super.getName() +'\"' +
                "hitPoints='" + super.getHitPoints() +'\"' +
                "strength='" + super.getStrength() +'\"' +
                "weapon='" + super.getWeapon() +'\"' +
                "specialMove='" + specialMove + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        var values = new ArrayList<String>();
        values.add(0, super.getName());
        values.add(1, String.valueOf(super.getHitPoints()));
        values.add(2, String.valueOf(super.getStrength()));
        values.add(3, super.getWeapon());
        values.add(4, this.specialMove);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() == 5){
            super.setName(savedValues.get(0));
            super.setHitPoints(Integer.valueOf(savedValues.get(1)).intValue());
            super.setStrength(Integer.valueOf(savedValues.get(2)).intValue());
            super.setWeapon(savedValues.get(3));
            this.specialMove = savedValues.get(4);
        }
    }


}
