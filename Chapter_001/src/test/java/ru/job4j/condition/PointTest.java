package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {

       // int x1 = 1, y1 = 5, x2 = 0, y2 = 2;
        Point x1 = new Point(1, 5);
        Point y2 = new Point(0, 2);
        double expected = 3.16;
        double out = x1.distance(y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D() {
        Point x = new Point(1, 5, 4);
        Point y = new Point(1, 2, 0);
        double expected = 5.0;
        double out = x.distance3d(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3Dtest2() {
        Point x = new Point(4, 5, 0);
        Point y = new Point(7, 2, 1);
        double expected = 4.35;
        double out = x.distance3d(y);
        Assert.assertEquals(expected, out, 0.01);
    }

}
