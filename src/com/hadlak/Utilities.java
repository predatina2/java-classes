package com.hadlak;

public final class Utilities {

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        sortedArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 0; j--){
                if (j == 0) {
                    sortedArray[j] = array[i];
                } else if (sortedArray[j-1] > array[i]) {
                    sortedArray[j] = array[i];
                     break;
                } else {
                    sortedArray[j] = sortedArray[j-1];
                }
            }
        }
        return sortedArray;
    }
}
