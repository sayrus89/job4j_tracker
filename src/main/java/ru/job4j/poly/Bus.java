package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Go to home");
    }

    @Override
    public void passengers(int numbers) {
        System.out.println("Passengers numbers: " + numbers);
    }

    @Override
    public double refuel(double liters) {
        double gas = 48.5;
        return gas * liters;
    }
}
