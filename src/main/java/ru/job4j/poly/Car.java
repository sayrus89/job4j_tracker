package ru.job4j.poly;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " moves on highways.");
    }

    @Override
    public void speed() {
        System.out.println("Speed " + getClass().getSimpleName() + " 180 km/h");
    }
}
