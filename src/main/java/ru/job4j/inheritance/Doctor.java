package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Diagnosis hale;
    private Patient patient;

    public Diagnosis hale(Patient patient) {
        return hale;
    }
}
