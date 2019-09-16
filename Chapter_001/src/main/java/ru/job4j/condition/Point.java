package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double d = Math.sqrt(a + b);
        return d;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("Return (0.0) to (2.0) " + result);

        double result1 = distance(1, 0, 2, 3);
        System.out.println("Return (1.0) to (2.3) " + result1);

        double result2 = distance(3, 1, 1, 2);
        System.out.println("Return (3.1) to (1.2) " + result2);
    }
}
