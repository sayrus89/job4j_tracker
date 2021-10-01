package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon() {
    }

    public Surgeon(String operation) {
        this.operation = operation;
    }
}
