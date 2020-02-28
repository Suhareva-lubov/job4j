package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", 600);
        Book book2 = new Book("Java", 574);
        Book book3 = new Book("Чужак", 400);
        Book book4 = new Book("Clean code", 10);

        Book[] list = new Book[4];
        list[0] = book1;
        list[1] = book2;
        list[2] = book3;
        list[3] = book4;

        for (int index = 0; index < list.length; index++) {
            Book i = list[index];
            System.out.println(i.getName() + " " + i.getCount());
        }

        Book change = list[0];
        list[0] = list[3];
        list[3] = change;

        System.out.println();
        for (int index = 0; index < list.length; index++) {
            Book i = list[index];
            System.out.println(i.getName() + " " + i.getCount());
        }

        System.out.println();
        for (int index = 0; index < list.length; index++) {
            Book i = list[index];
            if (i.getName().equals("Clean code")) {
                System.out.println(i.getName() + " " + i.getCount());
            }
        }
    }
}
