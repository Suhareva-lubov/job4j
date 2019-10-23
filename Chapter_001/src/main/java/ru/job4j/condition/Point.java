package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point (int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        double a = Math.pow(that.x - this.x, 2);
        double b = Math.pow(that.y - this.y, 2);
        double d = Math.sqrt(a + b);
        return d;
    }

    public double distance3d(Point that) {
        double a = Math.pow(that.x - this.x, 2);
        double b = Math.pow(that.y - this.y, 2);
        double c = Math.pow(that.z - this.z, 2);
        return Math.sqrt(a + b + c);
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.info();
        b.info();
        double dist = a.distance(b);
        System.out.println(dist);

    }
}
