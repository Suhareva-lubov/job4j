package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void WomanWeight (){

        double in = 168.0;
        double expected = 66.69 ;
        double out = Fit.WomanWeight(in);
        Assert.assertEquals (expected, out, 0.01); //delta до какой цифры после точки сравнивать
    }

    @Test
    public void ManWeight(){

        double in = 178;
        double expected = 89.7;
        double out = Fit.ManWeight(in);
        Assert.assertEquals (expected, out, 0.1);
    }
}
