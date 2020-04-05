package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод получения списка всех заявок, без null
     * @return массив заявок
     */
    public Item[] findAll() {
        Item[] arr = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index] != null) {
                arr[count++] = this.items[index];
            }
        }
        return Arrays.copyOf(arr, count);
    }

    /**
     * Метод получения списка заявок по имени
     * @param key - имя заявки
     */
    public Item[] findByName(String key) {
        Item[] arr = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index] != null) {
                if (items[index].getName().equals(key)) {
                    arr[count++] = this.items[index];
                }
            }
        }
        return Arrays.copyOf(arr, count);
    }

    /**
     * Получение заявки по Id
     * @param
     * @return
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * метод, который будет возвращать index по id
     * @param id
     * @return
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /***
     * Метод замены заявки.
     * @param id id заявки, которую нужно изменить
     * @param item новая заявка, которой заменим старую
     * @return Правда - если смогли изменить, Ложь если нет.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }

    /**
     * Удаление заявок
     * @param id
     * @return
     */

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, ((position -1) - index));
            items[position - 1] = null;
            position--;
            result = true;
        }
        return result;
    }

}