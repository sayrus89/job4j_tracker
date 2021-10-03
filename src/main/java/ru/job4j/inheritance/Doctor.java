package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Diagnosis hale;
    private Patient patient;

    public Doctor(String name, String surname, String education,
                  String birthday, Diagnosis hale, Patient patient) {
        super(name, surname, education, birthday);
        this.hale = hale;
        this.patient = patient;
    }

    public Diagnosis hale(Patient patient) {
        return hale;
    }
}
