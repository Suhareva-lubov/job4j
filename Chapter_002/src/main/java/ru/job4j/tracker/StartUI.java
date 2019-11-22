package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==Список всех заявок==");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("== Редактирование заявки ==");
                System.out.println("Введите имя новой заявки");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Укажите id заявки, которую хотите заменить ");
                String id = scanner.nextLine();
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("== Удаление заявки ==");
                System.out.println("Укажите id заявки");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("== Найти заявку по id ==");
                System.out.println("Укажите id заявки");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("== Найти заявки по имени ==");
                System.out.println("Укажите name заявки");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item ");
        System.out.println("1. Show all items ");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Введите пункт меню ");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
