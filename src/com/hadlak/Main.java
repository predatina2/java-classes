package com.hadlak;

import com.hadlak.animals.Cat;
import com.hadlak.calculations.Calculator;
import com.hadlak.comparisons.Comparisons;

public class Main {

    static int count = 0;
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(Calculator.sumFirstAndLastDigit(252));
        System.out.println(Calculator.sumFirstAndLastDigit(257));
        System.out.println(Calculator.sumFirstAndLastDigit(0));
        System.out.println(Calculator.sumFirstAndLastDigit(5));
        System.out.println(Calculator.sumFirstAndLastDigit(-10));
    }

}
