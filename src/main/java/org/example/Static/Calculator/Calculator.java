package org.example.Static.Calculator;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void printResult(double result) {
        if (result == (int) result) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}
