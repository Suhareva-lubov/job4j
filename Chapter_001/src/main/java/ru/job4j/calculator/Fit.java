package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double heigth) {
        return (heigth - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(200);
        System.out.println("Man 200 is " + man);

        double woman = womanWeight(168);
        System.out.println("Woman 168 is " + woman);
    }

}
