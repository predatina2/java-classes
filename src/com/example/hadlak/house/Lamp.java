package com.example.hadlak.house;

public class Lamp extends Furniture {

    private boolean battery;
    private int globRating;

    public Lamp(String name, String material, String style, boolean battery, int globRating) {
        super(name, material, style);
        this.battery = battery;
        this.globRating = globRating;
    }

    public Lamp(String material, String style, boolean battery, int globRating) {
        this("Lamp", material, style, battery, globRating);
    }

    public void turnOn() {
        System.out.println("Lamp --> Turnin on");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
