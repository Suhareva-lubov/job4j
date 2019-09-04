package ru.job4j.calculator;

/**
 * Class для вычесления арифметических операций
 * @author sukhareva-lubov
 * @since 04.09.2019
 * @version 1.0
 */

public class Calculator {

    public static void add (double first, double second){
        double result = first+second;
        System.out.println(first + "+" + second + "=" + result);
    }

    public static void div (double first, double second){
        double result = first/second;
        System.out.println(first + "/" + second + "=" + result);
    }

    public static void multiply (double first, double second){
        double result = first*second;
        System.out.println(first + "*" + second + "=" + result);
    }

    public static void subtrack (double first, double second){
        double result = first-second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main
     * @param args - args.
     */

    public static void main (String[] args){
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtrack(10,5);
    }

}
