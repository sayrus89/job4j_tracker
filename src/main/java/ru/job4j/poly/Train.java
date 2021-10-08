package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " moves on the rails.");
    }

    @Override
    public void speed() {
        System.out.println("Speed " + getClass().getSimpleName() + " 120 km/h");
    }
}
