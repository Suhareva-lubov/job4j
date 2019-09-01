package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void Max1() {
        SqMax check = new SqMax();
        int result = check.max(5, 3, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void Max2() {
        SqMax check = new SqMax();
        int result = check.max(2, 1, 8, 9);
        assertThat(result, is(8));
    }

    @Test
    public void Max3() {
        SqMax check = new SqMax();
        int result = check.max(1, 7, 4, 1);
        assertThat(result, is(7));
    }

    @Test
    public void Max4() {
        SqMax check = new SqMax();
        int result = check.max(1, 3, 2, 7);
        assertThat(result, is(7));
    }
}
