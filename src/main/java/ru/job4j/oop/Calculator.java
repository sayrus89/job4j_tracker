package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return a * x;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOpera(int d) {
        int sumResult = sum(d);
        int sumMultiply = multiply(d);
        int sumMinus = minus(d);
        int sumDivide = divide(d);
        return sumResult + sumMultiply + sumMinus + sumDivide;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calc = new Calculator();

        int result1 = calc.multiply(5);
        System.out.println(result1);
        int result2 = Calculator.minus(15);
        System.out.println(result2);
        int result3 = calc.divide(100);
        System.out.println(result3);
        int result4 = calc.sumAllOpera(50);
        System.out.println(result4);
    }
}
