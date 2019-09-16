package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        double h1 = p / (4.0 * k);
        int h = (int) Math.round(h1);
        int w = h * k;
        int s = h * w;

        return s;
    }

    public static void main(String[] args) {
        int result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

    }

}
