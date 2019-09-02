package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial Test1 = new Factorial();
        int result = Test1.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial Test2 = new Factorial();
        int result = Test2.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void Test () {
        Factorial Test2 = new Factorial();
        int result = Test2.calc(7);
        assertThat(result, is(5040));
    }


}