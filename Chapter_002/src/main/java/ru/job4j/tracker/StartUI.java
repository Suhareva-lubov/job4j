package ru.job4j.tracker;


public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==Список всех заявок==");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("== Редактирование заявки ==");
                System.out.println("Введите имя новой заявки");
                String name = input.askStr("");
                Item item = new Item(name);
                System.out.println("Укажите id заявки, которую хотите заменить ");
                String id = input.askStr("");
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("== Удаление заявки ==");
                System.out.println("Укажите id заявки");
                String id = input.askStr("");
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("== Найти заявку по id ==");
                System.out.println("Укажите id заявки");
                String id = input.askStr("");
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("== Найти заявки по имени ==");
                System.out.println("Укажите name заявки");
                String name = input.askStr("");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
