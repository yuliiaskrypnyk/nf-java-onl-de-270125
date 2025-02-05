package org.example.Static.Calculator;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        double sum = Calculator.add(num1, num2);
        Calculator.printResult(sum);

        double sub = Calculator.subtract(num1, num2);
        Calculator.printResult(sub);

        double mul = Calculator.multiply(num1, num2);
        Calculator.printResult(mul);

        double div = Calculator.divide(num1, num2);
        Calculator.printResult(div);

        double num3 = 10.5;
        double num4 = 20.0;

        double sumDouble = Calculator.add(num3, num4);
        Calculator.printResult(sumDouble);

        double subDouble = Calculator.subtract(num3, num4);
        Calculator.printResult(subDouble);

        double mulDouble = Calculator.multiply(num3, num4);
        Calculator.printResult(mulDouble);

        double divDouble = Calculator.divide(num3, num4);
        Calculator.printResult(divDouble);
    }
}
