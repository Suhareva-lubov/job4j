package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//Для диапазона значений от 1 до 10 метод add должен вернуть сумму чётных чисел, равную 30 (2 + 4 + 6 + 8 + 10)

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter Test1 = new Counter ();
        int result = Test1.add(1,10);
        assertThat(result, is(30));

    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty2() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter Test1 = new Counter ();
        int result = Test1.add(2,12);
        assertThat(result, is(42));

    }
}
