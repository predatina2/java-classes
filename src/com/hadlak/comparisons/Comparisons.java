package com.hadlak.comparisons;

public class Comparisons {

    public Comparisons() {

//        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(Comparisons.areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        int leftBorder = 13;
        int rightBorder = 19;
        if (age1 >= leftBorder && age1 <= rightBorder) return true;
        if (age2 >= leftBorder && age2 <= rightBorder) return true;
        if (age3 >= leftBorder && age3 <= rightBorder) return true;

        return false;
    }

//    public static boolean hasTeen(int val1, int val2, int val3){
//        if (inRange(13,19,val1)) return true;
//        if (inRange(13,19,val2)) return true;
//        if (inRange(13,19,val3)) return true;
//        return false;
//    }

    public static boolean inRange(int leftBorder, int rightBorder, int val) {
        return (val >= leftBorder && val <= rightBorder) ? true : false;
    }


    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        int val1 = (int) (value1 * 1000d);
        int val2 = (int) (value2 * 1000d);
        boolean isEqual = (val1 == val2) ? true : false;
        return isEqual;
    }

    public static boolean hasEqualSum(int op1, int op2, int sum) {
        return (op1 + op2 == sum) ? true : false;
    }
}
