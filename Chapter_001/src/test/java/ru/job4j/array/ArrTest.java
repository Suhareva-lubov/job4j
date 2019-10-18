package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrTest {
    @Test
    public void when2 () {
        Arr rsl = new Arr();
        int[] expect = {2, 3};
        int[] result = rsl.sort(
                new int[] {1, 2, 3},
                new int[] {2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}