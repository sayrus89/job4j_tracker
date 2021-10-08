package ru.job4j.poly;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() +  " flies through the air.");
    }

    @Override
    public void speed() {
        System.out.println("Speed " + getClass().getSimpleName() +  " 850 km/h");
    }
}
