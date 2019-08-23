package ru.job4j.calculator;

public class Fit {

    public static double ManWeight(double heigth){
        return (heigth-100)*1.15;
    }

    public static double WomanWeight(double height){
        return (height-110)*1.15 ;
    }

    public static void main (String [] args){
        double man = ManWeight(200);
        System.out.println("Man 200 is "+ man);

        double woman = WomanWeight(168);
        System.out.println("Woman 168 is "+ woman);
    }

}
