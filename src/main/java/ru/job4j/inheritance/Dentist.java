package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String toothTreatment;

    public Dentist(String name, String surname, String education, String birthday,
                   Diagnosis hale, Patient patient, String toothTreatment) {
        super(name, surname, education, birthday, hale, patient);
        this.toothTreatment = toothTreatment;
    }
}
