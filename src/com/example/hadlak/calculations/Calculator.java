package com.example.hadlak.calculations;

public class Calculator {

    public static int sumFirstAndLastDigit(int number) {

        int factor = 1;
        int firstDigit = number;
        int lastDigit = number;

        if (number < 0) {
            return -1;
        }

        // check first digit
        for (int i = 10; i <= number; i *= 10) {
            factor = i;
        }
        System.out.println("factor: " + factor);
        firstDigit = number / factor;

        // check last digit
        for (int i = factor; i >= 10; i /= 10) {
            lastDigit = number % i;
        }

        return firstDigit + lastDigit;
    }

    public static void printYearsAndDays(long minutes) {

        long remainingMinutes;
        long days = 0;
        long years = 0;

        if (minutes >= 0) {
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

    public static void printDayOfTheWeek(int day) {
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 0:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid Day";
                break;
        }
        System.out.println(dayString);

    }

    // used long as type to enable two methods of same fuction just with different
    // solution ways
    public static void printDayOfTheWeek(long day) {
        String dayString;
        if (day == 0) {
            dayString = "Sunday";
        } else if (day == 1) {
            dayString = "Monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else if (day == 3) {
            dayString = "Wednesday";
        } else if (day == 4) {
            dayString = "Thursday";
        } else if (day == 5) {
            dayString = "Friday";
        } else if (day == 6) {
            dayString = "Saturday";
        } else {
            dayString = "Invalid Day";
        }
        System.out.println(dayString);
    }

}
