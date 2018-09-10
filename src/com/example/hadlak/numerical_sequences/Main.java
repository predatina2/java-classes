package com.example.hadlak.numerical_sequences;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println("nSum von " + i + ": " + Series.nSum(i));
            System.out.println("factorial von " + i + ": " + Series.factorial(i));
            System.out.println("fibonacci von " + i + ": " + Series.fibonacci(i));
        }

    }
}
