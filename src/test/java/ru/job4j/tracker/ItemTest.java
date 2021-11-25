package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(4, "Impl task"),
                new Item(2, "Fix bugs"),
                new Item(1, "Reboot server")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Fix bugs"),
                new Item(4, "Impl task"),
                new Item(1, "Reboot server")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(4, "Impl task"),
                new Item(2, "Fix bugs")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(4, "Impl task"),
                new Item(2, "Fix bugs")
        );
        assertThat(items, is(expected));
    }
}