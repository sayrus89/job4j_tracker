package ru.job4j.oop;

public class Max {
    public static int max(int a, int b) {
        int rsl = a > b ? a : b;
        return rsl;
    }

    public static int max(int a, int b, int c) {
        int tmp = max(b, c);
        int rsl = a > tmp ? a : tmp;
        return rsl;
    }

    public static int max(int a, int b, int c, int d) {
        int tmp = max(a, b, c);
        int rsl = tmp > d ? tmp : d;
        return rsl;
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
