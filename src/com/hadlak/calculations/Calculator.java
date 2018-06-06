package com.hadlak.calculations;

public class Calculator {

    public static void printYearsAndDays(long minutes){

        long remainingMinutes;
        long days = 0;
        long years = 0;

        if (minutes >= 0 ){
            days = minutes / 60 / 24;
            remainingMinutes = minutes % 60 % 24;
            years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = "
                    + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
