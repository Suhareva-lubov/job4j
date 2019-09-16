package ru.job4j.loop;


//1. Вы должны, используя цикл for, пройтись по всему диапазону значений от start до finish включительно и сложить сумму всех чётных значений.
//2. Для определения, что число чётное,  используйте операцию вычисления остатка от деления (%).

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
