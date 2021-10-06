package ru.job4j.tracker;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(14, "admin");
        System.out.println(item);
    }
}

