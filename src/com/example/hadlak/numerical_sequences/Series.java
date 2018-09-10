package com.example.hadlak.numerical_sequences;

public class Series {

    public static long nSum(int n) {
        if (n < 0) {
            return -1;
        }
        return n * (n + 1) / 2;
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static long fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            return fibonacci(n - 2) + fibonacci(n - 1);

        }
    }
}
