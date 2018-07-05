package com.hadlak;

import java.util.Arrays;
import java.util.Scanner;

public final class Utilities {

    private static Scanner scanner = new Scanner(System.in);

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
        int steps = 0;
        int[] sortedArray = new int[array.length];
        sortedArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 0; j--) {
                steps ++;
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
        System.out.println("steps: " + steps);
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
                steps ++;
            }
        }
        System.out.println("steps: " + steps);
        return sortedArray;
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
}
