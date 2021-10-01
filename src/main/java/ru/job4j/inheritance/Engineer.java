package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String diagnostic;
    private String building;

    public Engineer() {
    }

    public Engineer(String name, String surname,
                    String education, String birthday,
                    String diagnostic, String building) {
        super(name, surname, education, birthday);
        this.diagnostic = diagnostic;
        this.building = building;
    }
}
