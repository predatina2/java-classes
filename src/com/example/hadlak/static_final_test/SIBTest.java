package com.example.hadlak.static_final_test;

public class SIBTest {

    public static final String owner;

    static {
        owner = "Lin";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("second initialization block called");
    }

    public void secondMethod(){
        System.out.println("second method called");
    }
}
