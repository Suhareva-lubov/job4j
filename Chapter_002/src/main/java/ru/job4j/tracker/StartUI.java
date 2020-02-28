package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Введите имя ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("== Редактирование заявки ==");
        String name = input.askStr("Введите имя новой заявки");
        Item item = new Item(name);
        String id = input.askStr("Укажите id заявки, которую хотите заменить");
        if (tracker.replace(id, item)) {
            System.out.println("Заявка отредактирована");
        } else {
            System.out.println("Заявок с таким id нет");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("== Удаление заявки ==");
        String id = input.askStr("Укажите id заявки");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявок с таким id нет");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("== Найти заявку по id ==");
        String id = input.askStr("Укажите id заявки");
        tracker.findById(id);
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("== Найти заявки по имени ==");
        String name = input.askStr("Укажите name заявки");
        tracker.findByName(name);
    }

    public static void findAllItem(Input input, Tracker tracker) {
        System.out.println("==Список всех заявок==");
        tracker.findAll();
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deteleItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
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
