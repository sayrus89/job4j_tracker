package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Rustam");
        student.setLastName("Saydaliev");
        student.setGroup("Elementary");
        student.setReceiptDate("27.08.2021");
        System.out.println("ФИО:" + " " + student.getLastName() + " " + student.getFirstName()
                + System.lineSeparator() + "Группа:" + " "
                + student.getGroup() + System.lineSeparator() + "Дата поступления:"
                + " " + student.getReceiptDate());
    }
}
