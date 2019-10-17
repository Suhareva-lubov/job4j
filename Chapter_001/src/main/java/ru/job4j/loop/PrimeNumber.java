package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            int a = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                        a++;
                }
            }
            if (a < 2) {
                count++;
            }
        }
        return count;
    }
}
