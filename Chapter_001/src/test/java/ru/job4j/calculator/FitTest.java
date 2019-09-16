package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void womanWeight() {

        double in = 168.0;
        double expected = 66.69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01); //delta до какой цифры после точки сравнивать
    }

    @Test
    public void manWeight() {

        double in = 178;
        double expected = 89.7;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}
