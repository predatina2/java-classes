package com.hadlak.animals;

public class AnimalApp {

    public static void main(String[] args) {
        Dog dog = new Dog("Hermann");
        dog.breathe();
        dog.eat();

        Animal parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        ((Parrot) parrot).fly();

        Animal penguin = new Penguin("Penguin");
        penguin.breathe();
        penguin.eat();
        ((Penguin) penguin).fly();
    }
}
