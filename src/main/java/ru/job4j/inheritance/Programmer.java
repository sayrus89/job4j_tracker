package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String grade;

    public Programmer(String name, String surname, String education, String birthday,
                      String diagnostic, String building, String grade) {
        super(name, surname, education, birthday, diagnostic, building);
        this.grade = grade;
    }
}
