package ru.job4j.inheritance;

public class Diagnosis extends Doctor {
    private String analyzes;

    public Diagnosis() {
    }

    public Diagnosis(String analyzes) {
        this.analyzes = analyzes;
    }
}
