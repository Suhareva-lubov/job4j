package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenSecondMax4() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 8, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenSecondMax5() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 2);
        assertThat(result, is(5));
    }
}