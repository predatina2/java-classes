package com.example.hadlak.house;

public class Bedroom extends Room {

    private Bed bed;
    private Lamp lamp;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        super("bedroom", wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
        this.lamp = lamp;
    }

    public Bedroom(Room emptyRoom, Bed bed, Lamp lamp) {
        this(emptyRoom.getWall1(), emptyRoom.getWall2(), emptyRoom.getWall3(), emptyRoom.getWall4()
                , emptyRoom.getCeiling(), bed, lamp);
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom --> Making Bed");
        bed.make();
    }
}
