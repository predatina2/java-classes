package com.hadlak;

import com.hadlak.comparisons.Comparisons;

public class Main {

    public static void main(String[] args) {
        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(Comparisons.hasEqualSum(1,1,1));
        System.out.println(Comparisons.hasEqualSum(1,1,2));
        System.out.println(Comparisons.hasEqualSum(1,-1,0));
        System.out.println(Comparisons.hasTeen(9,99,19));
        System.out.println(Comparisons.hasTeen(23,15,42));
        System.out.println(Comparisons.hasTeen(22,23,34));
    }
}
