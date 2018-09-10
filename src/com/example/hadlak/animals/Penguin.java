package com.example.hadlak.animals;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good ad that. Can I go for a swim instead?");
    }
}
