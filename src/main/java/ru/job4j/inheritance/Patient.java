package ru.job4j.inheritance;

public class Patient extends Doctor {
    private double height;

    public Patient(String name, String surname, String education, String birthday,
                   Diagnosis hale, Patient patient, double height) {
        super(name, surname, education, birthday, hale, patient);
        this.height = height;
    }
}