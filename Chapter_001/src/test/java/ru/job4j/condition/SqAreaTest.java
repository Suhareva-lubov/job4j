package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {

        int p = 6, k = 1;
        int expected = 4;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }
}
