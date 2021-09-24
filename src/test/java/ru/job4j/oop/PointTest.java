package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance2d() {
        double expected = 3.0;
        Point a = new Point(3, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 3.0;
        Point c = new Point(3, 3, 2);
        Point d = new Point(1, 1, 1);
        double dist = c.distance3d(d);
        Assert.assertEquals(expected, dist, 0.01);
    }
}