package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc() {
        new Fact().calc(-1);
    }

    @Test
    public void whenCalcN4() {
        new Fact().calc(4);
    }
}