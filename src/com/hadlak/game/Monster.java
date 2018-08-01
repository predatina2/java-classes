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
        if (!super.updateFromList(list)) return false;
        for (int i = 0; i < list.size(); i++){
            Monster comparable = (Monster) list.get(i);
            if (comparable.toString().equals(this.toString())){
                this.specialMove = comparable.getSpecialMove();
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
        var stringText = super.toString();
        stringText.replace("Character", "Monster");
        stringText = stringText.substring(0, stringText.length() - 1);
        stringText +=
                        ", specialMove='" + this.specialMove + '\'' +
                        '}';
        return stringText;
    }

    @Override
    public List<String> write() {
        var values = super.write();
        var size = values.size();

        values.add(size, this.specialMove);
        return values;
    }

    @Override
    public boolean read(List<String> savedValues) {
        if (!super.read(savedValues)) return false;
        if (savedValues != null && savedValues.size() == 4){
            this.specialMove = savedValues.get(3);
            return true;
        }
        return false;
    }


}
