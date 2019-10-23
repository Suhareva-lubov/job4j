package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        Max max1 = new Max();
        int result = max1.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3() {
        Max max2 = new Max();
        int result = max2.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMaxIn3() {
        Max max = new Max();
        int result = max.max(2, 5, 1);
    }

    @Test
    public void whenMaxIn4() {
        Max max = new Max();
        int result = max.max(2, 5, 1, 7);
    }

}
