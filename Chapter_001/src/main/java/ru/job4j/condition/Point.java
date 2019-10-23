package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        double a = Math.pow(that.x - this.x, 2);
        double b = Math.pow(that.y - this.y, 2);
        double d = Math.sqrt(a + b);
        return d;
    }

    /*public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("Return (0.0) to (2.0) " + result);

        double result1 = distance(1, 0, 2, 3);
        System.out.println("Return (1.0) to (2.3) " + result1);

        double result2 = distance(3, 1, 1, 2);
        System.out.println("Return (3.1) to (1.2) " + result2);
    }*/

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
