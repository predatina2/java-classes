package com.hadlak;

import com.hadlak.animals.Cat;
import com.hadlak.calculations.Calculator;
import com.hadlak.comparisons.Comparisons;

public class Main {

    static int count = 0;
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(Cat.isCatPlaying(true, 10));
        System.out.println(Cat.isCatPlaying(false, 36));
        System.out.println(Cat.isCatPlaying(false, 35));
    }

}
