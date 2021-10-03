package ru.job4j.inheritance;

public class Diagnosis extends Doctor {
    private String analyzes;

    public Diagnosis(String name, String surname, String education, String birthday,
                     Diagnosis hale, Patient patient, String analyzes) {
        super(name, surname, education, birthday, hale, patient);
        this.analyzes = analyzes;
    }
}
