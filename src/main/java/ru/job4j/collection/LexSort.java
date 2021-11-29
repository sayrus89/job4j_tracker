package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\.");
        int leftInt = Integer.parseInt(leftStr[0]);
        String[] rightStr = right.split("\\.");
        int rightInt = Integer.parseInt(rightStr[0]);
        return Integer.compare(leftInt, rightInt);
    }
}