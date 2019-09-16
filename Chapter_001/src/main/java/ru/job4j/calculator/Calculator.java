package ru.job4j.calculator;

/**
 * Class для вычесления арифметических операций
 * @author sukhareva-lubov
 * @since 04.09.2019
 * @version 1.0
 */

public class Calculator {

    /**
     * Method add
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат сложения
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Method div
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат деления
     */

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Method multiply
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат сложения
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Method subtrack
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат вычитания
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main
     * @param args - args.
     */

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }

}
