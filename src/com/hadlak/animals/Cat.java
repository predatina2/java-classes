package com.hadlak.animals;

public class Cat {

    private boolean isPlaying = false;

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;

        if (temperature < 25 || temperature > upperLimit) {
            return false;
        }

        return true;

    }

}
