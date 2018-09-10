package com.example.hadlak.scope_test;

import java.util.Scanner;

public class ScopeApp {

    public static void main(String[] args) {

        System.out.println("enter the number: ");
        X x = new X(new Scanner(System.in));
        x.x();

    }
}
