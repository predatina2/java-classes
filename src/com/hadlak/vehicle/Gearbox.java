package com.hadlak.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {

    private boolean clutchIsIn;
    private List<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(boolean clutchIsIn, int maxGears) {
        this.clutchIsIn = clutchIsIn;
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void addGear(int gearNumber, double ratio){
        this.gears.add(new Gear(gearNumber, ratio));
    }

    public void changeGear(int newGear){
        if (newGear >= 0 && newGear <= gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
