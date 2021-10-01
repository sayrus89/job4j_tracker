package ru.job4j.inheritance;

public class Patient extends Doctor {
    private double height;
    private double weight;

    public Patient() {
    }

    public Patient(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}