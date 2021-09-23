package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxFromTwoNumbers() {
        int a = 2;
        int b = 5;
        int result = Max.max(a, b);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxFromThreeNumbers() {
        int a = 12;
        int b = 3;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxFromFourNumbers() {
        int a = 3;
        int b = 5;
        int c = 14;
        int d = 8;
        int result = Max.max(a, b, c, d);
        int expected = 14;
        Assert.assertEquals(expected, result);
    }
}