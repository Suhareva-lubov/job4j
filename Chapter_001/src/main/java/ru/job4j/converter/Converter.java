package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in = 180;
        int expected = 3;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("180 rubles are 3 dollar. Test result : " + passed);

        int in1 = 180;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 2 euro. Test result : " + passed1);

        int in2 = 5;
        int expected2 = 350;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("5 euro are 350 rub. Test result : " + passed2);

        int in3 = 10;
        int expected3 = 600;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("10 doll are 600 rub. Test result : " + passed3);

        System.out.println(" ");

        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int rublle = euroToRuble(8);
        int ruble = dollarToRuble(11);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("8 euro are " + rublle + " ruble.");
        System.out.println("11 dollar are " + ruble + " ruble.");


    }



}
