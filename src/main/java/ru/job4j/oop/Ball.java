package ru.job4j.oop;

public class Ball {

    public Ball tryRun(boolean condition) {
        if (condition) {
            System.out.println("колобок съеден");
        } else {
            System.out.println("колобок сбежал");
        }
        return null;
    }
}
