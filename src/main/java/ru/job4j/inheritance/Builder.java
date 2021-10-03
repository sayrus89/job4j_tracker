package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String work;

    public Builder(String name, String surname, String education, String birthday,
                   String diagnostic, String building, String work) {
        super(name, surname, education, birthday, diagnostic, building);
        this.work = work;
    }
}
