package ru.job4j.poly;

public class Data {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        bus.passengers(50);
        double price = bus.refuel(10);
        System.out.println("Gas price: " + price);
    }
}
