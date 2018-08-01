package com.hadlak;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {

    private boolean clutchIsIn;
    private List<Gear> gears;
    private int maxGears;
    private int countGear = 0;

    public Gearbox(boolean clutchIsIn, int maxGears) {
        this.clutchIsIn = clutchIsIn;
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
