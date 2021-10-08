package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle car = new Car();

        Vehicle[] vehicles = new Vehicle[]{airplane, train, car};
        for (Vehicle vcs : vehicles) {
            vcs.move();
            vcs.speed();
            System.out.println();
        }
    }
}
