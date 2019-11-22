package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int player = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Игра началась.");
        while (matches > 0) {
            if ((player % 2) ==0) {
                System.out.println("Игрок 2. Введите число от 1 до 3");
            } else System.out.println("Игрок 1. Введите число от 1 до 3");

            int move = Integer.valueOf(input.nextLine());
            if (move > 3 || move < 1) {
                System.out.println("Неверное число.");
            } else if(matches < move) {
                System.out.println("Спичек осталось " + matches + ". Вы не можете ввести число больше " + matches);
            } else {
                    matches = matches - move;
                    System.out.println("На столе осталось " + matches + " спичек.");
                    player++;
                }
        }
        if((player % 2) ==0) {
            System.out.println("Выйграл Игрок 1");
        } else System.out.println("Выйграл Игрок 2");
    }
}
