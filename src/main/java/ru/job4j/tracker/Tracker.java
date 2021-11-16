package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    //private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    // public Item[] findAll() {
    //    return Arrays.copyOf(items, size);
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    //public Item[] findByName(String key) {
    public List<Item> findByName(String key) {
        //Item[] findName = new Item[size];
        List<Item> findName = new ArrayList<>();
        //int count = 0;
        for (int index = 0; index < items.size(); index++) {
            //Item itm = items[index];
            Item item = items.get(index);
            if (item.getName().equals(key)) {
                //findName[count] = itm;
                findName.add(item);
               // count++;
            }
    }
    // return Arrays.copyOf(findName, count);
        return List.copyOf(items);
}

    public Item findById(int id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            //if (items[index].getId() == id) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            //items[index] = item;
            items.add(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            //System.arraycopy(items, index + 1, items, size, size - index - 1);
            //items[size - 1] = null;
            //size--;
            items.remove(index);
        }
        return rsl;
    }
}