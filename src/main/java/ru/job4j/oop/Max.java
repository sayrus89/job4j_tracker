package ru.job4j.oop;

public class Max {
    public static int max(int a, int b) {
        int rsl = a > b ? a : b;
        return rsl;
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    public static void main(String[] args) {
        int result = Max.max(9, 14);
        System.out.println(result);
        int result1 = Max.max(32, 6, 12);
        System.out.println(result1);
        int result2 = Max.max(12, 4, 6, 18);
        System.out.println(result2);

    }
}
