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

}
