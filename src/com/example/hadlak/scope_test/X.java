package com.example.hadlak.scope_test;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x) {
        this.x = x.nextInt();
    }

    public void x(){

        for (int x = 1; x <= 12; x++){
            System.out.println(x + " times " + this.x + " = " + x * this.x);
        }

    }
}
