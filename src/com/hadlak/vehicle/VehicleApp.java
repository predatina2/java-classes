package com.hadlak.vehicle;

public class VehicleApp {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(true,6);
        mcLaren.addGear(1,12.3);
        mcLaren.addGear(2,24.3);
        mcLaren.addGear(3,50.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
