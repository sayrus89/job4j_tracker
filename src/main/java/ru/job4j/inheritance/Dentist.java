package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String toothTreatment;

    public Dentist() {
    }

    public Dentist(String toothTreatment) {
        this.toothTreatment = toothTreatment;
    }
}
