package com.hadlak.house;

public class Bedroom  extends Room {

    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        super(name, wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom --> Making Bed");
    }
}
