package com.hadlak;

import com.hadlak.mobile_phone.DeskPhone;
import com.hadlak.mobile_phone.ITelephone;
import com.hadlak.mobile_phone.MobilePhone;
import com.hadlak.vehicle.Vehicle;

import java.util.Iterator;


public class Main {

    static int count = 0;
    static int sum = 0;


    public static void main(String[] args) {

        ITelephone myPhone = new DeskPhone(1234324);
        myPhone.powerOn();
        myPhone.callPhone(1234324);
        myPhone.answer();

        ITelephone myNewPhone = new MobilePhone(3423623);
        myNewPhone.powerOn();
        myNewPhone.callPhone(3423623);
        myNewPhone.answer();
    }



    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{2, 5, 3, 234, 2};
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("random number generated was: "
                + randomNumber);
        switch (randomNumber) {
            case 1:
                System.out.println("XcSara");
                return new XcSara(4, 3, 6);
            case 2:
                System.out.println("Peugeot390");
                return new Peugeot309(5, 5, 6);
            case 3:
                System.out.println("VolvoXC90");
                return new VolvoXc90(5, 7, 8);
        }
        return new Car("Failure", 3, 3, 3);
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number generated was: "
                + randomNumber);
        switch (randomNumber) {
            case 1:
                System.out.println("Jaws");
                return new Jaws();
            case 2:
                System.out.println("ID");
                return new IndependenceDay();
            case 3:
                System.out.println("MR");
                return new MazeRunner();
            case 4:
                System.out.println("SW");
                return new StarWars();
            case 5:
                System.out.println("Forgettable");
                return new Forgettable();
        }
        return new Movie("Failure");
    }


}

/* car classes */

class Car extends Vehicle {
    private int doors;
    private int engineCapacity;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int doors, int engineCapacity, int cylinders) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public int getDoors() {
        return doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Car --> Start engine");
        if (engine) {
            System.out.println("engine is already started");
        } else {
            this.engine = true;
        }
    }

    public void accelerate() {
        System.out.println("Car --> accelerate");
    }

    public void brake() {
        System.out.println("Car --> break");
    }
}

class XcSara extends Car {
    public XcSara(int doors, int engineCapacity, int cylinders) {
        super("XcSara", doors, engineCapacity, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("XCSara --> Start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("XC Sara --> can't accelerate");
    }

    @Override
    public void brake() {
        System.out.println("XC Sara --> loves braking");
    }
}

class Peugeot309 extends Car {
    public Peugeot309(int doors, int engineCapacity, int cylinders) {
        super("Peugeot 309", doors, engineCapacity, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class VolvoXc90 extends Car {
    public VolvoXc90(int doors, int engineCapacity, int cylinders) {
        super("Volvo XC90", doors, engineCapacity, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("XC 90 --> hasn't got a brake");
    }
}

/* movie classes */

class Movie {

    private String name;

    /*
    public Movie() {
        this.name = name;
    }
    */

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt tp take over earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // no plot method
}

