package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public static int divide(int y) {
        return y / x;
    }

    public static int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int result) {
        return sum(result) + minus(result) + divide(result) + multiply(result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        result = divide(10);
        System.out.println(result);
        result = multiply(10);
        System.out.println(result);
        result = calculator.sumAllOperation(result);
        System.out.println(result);
    }
}
