package com.example.hadlak.game;

import java.util.List;

public class Player extends Character implements Saveable {

    /* this is a NEGATIVE code example <-- anti encapsulation !!!! */

    private String weapon;
    private String specialSkill;

    public Player(String name, int hitPoints, int strength, String specialSkill) {
        super(name, hitPoints, strength);
        this.specialSkill = specialSkill;
        this.weapon = "Sword";
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
            Player comparable = (Player) list.get(i);
            if (comparable.toString().equals(this.toString())){
                this.weapon = comparable.getWeapon();
                this.specialSkill = comparable.getSpecialSkill();
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        var stringText = super.toString();
        stringText = stringText.replace("Character", "Player");
        stringText = stringText.substring(0, stringText.length() - 1);
        stringText +=
                ", weapon='" + this.getWeapon() +'\'' +
                ", specialSkill='" + this.specialSkill + '\'' +
                '}';
        return stringText;
    }

    @Override
    public List<String> write() {
        var values = super.write();
        var size = values.size();

        values.add(size, this.weapon);
        values.add(size + 1, this.specialSkill);
        return values;
    }

    @Override
    public boolean read(List<String> savedValues) {
        if (!super.read(savedValues)) return false;
        if (savedValues != null && savedValues.size() == 5){
            this.weapon = savedValues.get(3);
            this.specialSkill = savedValues.get(4);
            return true;
        }
        return false;
    }
}
