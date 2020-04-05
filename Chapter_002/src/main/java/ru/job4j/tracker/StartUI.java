package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Введите имя заявки:  ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItem(Input input, Tracker tracker) {
        System.out.println("=== Найти все заявки ====");
        Item[] result = tracker.findAll();
        if (result.length < 0) {
            System.out.println("Заявок нет");
        } else {
            int num = 1;
            for (int index = 0; index < result.length; index++) {
                System.out.println(num + ". Название заявки = " + result[index].getName() + "    id = " + result[index].getId());
                num++;
            }
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Заменить заявку ====");
        String id = input.askStr("Введите Id заявки, которую хотите изменить");
        String name = input.askStr("Введите имя новой заявки:  ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка отредактирована");
        } else {
            System.out.println("Заявок с таким id нет");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удалить заявку ====");
        String id = input.askStr("Введите Id заявки, которую хотите удалить");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявок с таким id нет");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Найти заявку по Id ====");
        String id = input.askStr("Введите Id заявки, которую хотите найти");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Имя заявки = " + result.getName() + "  id заявки = " + result.getId());
        } else {
            System.out.println("Заявки с таким id нет");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("=== Найти заявку по имени ====");
        String name = input.askStr("Введите Имя заявки, которую хотите найти");
        Item[] result = tracker.findByName(name);
        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                System.out.println("Имя заявки = " + result[i].getName() + "  id заявки = " + result[i].getId());
            }
        } else {
            System.out.println("Заявок с таким именем нет");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Введите пункт меню "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else  if (select == 6) {
                System.out.println("=== Выйти из программы ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Добавить новую заявку ");
        System.out.println("1. Найти все заявки ");
        System.out.println("2. Заменить заявку");
        System.out.println("3. Удалить заявку");
        System.out.println("4. Найти заявку по Id");
        System.out.println("5. Найти заявку по имени");
        System.out.println("6. Выйти из программы");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}