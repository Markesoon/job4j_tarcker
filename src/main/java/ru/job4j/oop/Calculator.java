package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x + y;
    }

    public static int divide(int y) {
        return x / y;
    }

    public static int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation() {
        return Calculator.sum(10) + Calculator.minus(10) + Calculator.divide(10) + Calculator.multiply(10);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sumAllOperation();
        int sum = sum(10);
        int minus = minus(10);
        int divide = divide(10);
        int multiply = multiply(10);
        System.out.println(result);
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(divide);
        System.out.println(multiply);
    }
}
