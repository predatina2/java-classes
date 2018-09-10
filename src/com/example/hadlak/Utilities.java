package com.example.hadlak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public final class Utilities {

    private static Scanner scanner = new Scanner(System.in);

    public static void printNPerfectNumbers(int n){
        System.out.println("Print the first " + n + " perfect numbers");
        long i = 1;
        while (n >= 0){
            if (isPerfectNumber(i)){
                System.out.print(i + " ");
                n --;
            }
            i++;
        }
        System.out.println("\nfinised printing perfect numbers");
    }

    public static boolean isPerfectNumber(long number){
        if (number < 1){
            return false;
        }
        long sum = 0;
        for (long i = 1; i <= number / 2; i ++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void printFactors(int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number / 2; i ++){
                if (number % i == 0){
                    System.out.print(i + " ");
                }

            }
            System.out.println(number + "\n");
        }
//
//        Utilities.printFactors(12);
//        Utilities.printFactors(6);
//        Utilities.printFactors(32);
//        Utilities.printFactors(10);
//        Utilities.printFactors(-1);
    }

    public static int getGreatestCommonDivisor(int number1, int number2){
            if (number1 < 10 || number2 < 10){
                return -1;
            } else if (number1 == number2){
                return number1;
            }

            int min = (number1 < number2) ? number1 : number2;
            int max = (number1 > number2) ? number1 : number2;

            if (max % min == 0){
                return min;
            }

            for (int i = min / 2; i > 0; i--){
                if (min % i == 0 && max % i == 0) {
                    return i;
                }
            }

            return 1;
        }

    public static void printDoubled(ArrayList<Integer> n){
        for (int i : n){
            System.out.println( i * 2);
        }
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000
                || number3 < 10 || number3 > 1000){
            return false;
        }

        char[] digitsNumber1 = String.valueOf(number1).toCharArray();
        char[] digitsNumber2 = String.valueOf(number2).toCharArray();
        char[] digitsNumber3 = String.valueOf(number3).toCharArray();

        char lastDigitNumber1 = digitsNumber1[digitsNumber1.length - 1];
        char lastDigitNumber2 = digitsNumber2[digitsNumber2.length - 1];
        char lastDigitNumber3 = digitsNumber3[digitsNumber3.length - 1];

       if (lastDigitNumber1 == lastDigitNumber2 || lastDigitNumber1 == lastDigitNumber3
               || lastDigitNumber2 == lastDigitNumber3){
           return true;
       } else {
           return false;
       }

    }

    public static boolean hasSharedDigit(int numberFirst, int numberLast){
        if (numberFirst < 10 || numberFirst > 99 || numberLast < 10 || numberLast > 99){
            return false;
        }

        char[] numberFirstDigits = String.valueOf(numberFirst).toCharArray();
        char[] numberLastDigits = String.valueOf(numberLast).toCharArray();

        for (int i = 0; i < numberFirstDigits.length; i++){
            for (int j = 0; j < numberLastDigits.length; j++){
                if (numberFirstDigits[i] == numberLastDigits[j]){
                        return true;
                }
           }
        }

        return false;
    }

    public static int getEvenDigitSum(int number){
        if (number < 0) {return -1;}

        int sum = 0;

        while (number > 0){
            if (number % 2 == 0){
                sum += number % 10;
            }
            number /= 10;
        }

        return sum;

//        System.out.println("122: " + Utilities.getEvenDigitSum(122));
//        System.out.println("123456789: " + Utilities.getEvenDigitSum(123456789));
//        System.out.println("252: " + Utilities.getEvenDigitSum(252));
//        System.out.println("-22: " + Utilities.getEvenDigitSum(-22));
    }

    public static int sumDigits(int val){
        if (val < 10) {
            return -1;
        }

         int sum = 0;
         while (val > 0){
             sum += val % 10;
             val /= 10;
         }

         return sum;

//        System.out.println("122: " + Utilities.sumDigits(122));
//        System.out.println("125: " + Utilities.sumDigits(125));
//        System.out.println("8: " + Utilities.sumDigits(8));
//        System.out.println("9900: " + Utilities.sumDigits(9900));
    }

    public static void printEqual(int val1, int val2, int val3) {
        if (val1 < 0 || val2 < 0 || val3 < 0) {
            System.out.println("Invalid Value");
        } else if (val1 == val2 && val2 == val3) {
            System.out.println("All numbers are equal");
        } else if (val1 != val2 && val1 != val3 && val2 != val3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] sortArray(int[] array) {
        // int steps = 0;
        int[] sortedArray = new int[array.length];
        sortedArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 0; j--) {
                // steps ++;
                if (j == 0) {
                    sortedArray[j] = array[i];
                } else if (sortedArray[j - 1] > array[i]) {
                    sortedArray[j] = array[i];
                    break;
                } else {
                    sortedArray[j] = sortedArray[j - 1];
                }
            }
        }
        //System.out.println("steps: " + steps);
        return sortedArray;
    }

    public static double[] sortArray(double[] array) {
        int steps = 0;
//        double[] sortedArray = new double[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//            steps ++;
//        }
        double[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        double temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
                steps++;
            }
        }
        System.out.println("steps: " + steps);
        return sortedArray;
    }

    public static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values.\n");
        int[] values = new int[capacity];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double[] getDoubles(int capacity) {
        System.out.println("Enter " + capacity + " double values.\n");
        double[] values = new double[capacity];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextDouble();
        }

        return values;
    }

    public static int findMin(int[] values) {
        // int min = values[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    public static int findMax(int[] values) {
        // int max = values[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    public static ArrayList<String> readValues() {


        var values = new ArrayList<String>();

        var scanner = new Scanner(System.in);
        var quit = false;
        var index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "2 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.print("Enter a string: ");
                        var stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
        return values;
    }

}
