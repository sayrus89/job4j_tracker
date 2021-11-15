package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
                /** list.addAll(List.of(cell));  немодифицируемый list создаем.
                 * Какой метод я должен использовать.
                 */
            }
        }
        return list;
    }
}
