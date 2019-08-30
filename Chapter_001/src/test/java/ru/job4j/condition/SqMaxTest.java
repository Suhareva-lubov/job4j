package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void Max1() {
        SqMax check = new SqMax();
        int result = check.max(7, 4, 1, 2);
        assertThat(result, is(7));
    }

    @Test
    public void Max2() {
        SqMax check = new SqMax();
        int result = check.max(1, 7, 0, 1);
        assertThat(result, is(7));
    }

    @Test
    public void Max3() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 7, 4);
        assertThat(result, is(7));
    }

    @Test
    public void Max4() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 3, 7);
        assertThat(result, is(7));
    }
}
