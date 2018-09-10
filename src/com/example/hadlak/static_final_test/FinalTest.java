package com.example.hadlak.static_final_test;

public class FinalTest {

    private static int classCounter = 0;
    public final int INSTANCE_NUMBER;
    public final String NAME;

    public FinalTest(String name) {
        this.NAME = name;
        classCounter ++;
        INSTANCE_NUMBER = classCounter;
    }

    public static int getClassCounter() {
        return classCounter;
    }
}
