package com.hadlak.animals;

public class Cat extends  Animal{

    private boolean isPlaying = false;

    public Cat(String name, boolean isPlaying) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;

        if (temperature < 25 || temperature > upperLimit) {
            return false;
        }

        return true;

    }

}
