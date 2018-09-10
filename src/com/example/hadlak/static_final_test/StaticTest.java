package com.example.hadlak.static_final_test;

public class StaticTest {
    private static int numInstances = 0;
    private final int INSTANCE_NUMBER;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances ++;
        INSTANCE_NUMBER = numInstances;
    }

    public int getInstance() {
        return INSTANCE_NUMBER;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
