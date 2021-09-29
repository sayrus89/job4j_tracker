package ru.job4j.oop;

public class Reduce {
    private int[] b;

    public void to(int[] array) {
        this.b = array;
    }

    public void print() {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
