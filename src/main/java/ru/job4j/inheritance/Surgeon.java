package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday,
                   Diagnosis hale, Patient patient, String operation) {
        super(name, surname, education, birthday, hale, patient);
        this.operation = operation;
    }
}
