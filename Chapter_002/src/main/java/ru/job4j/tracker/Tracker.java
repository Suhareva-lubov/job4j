package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item [] items = new Item[100];
    private int position = 0;

    /**
     * Добавление заявок
     * @param item
     * @return
     */
    public void add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return
     */
    public String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * редактирование заявок
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for(int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                result = true;
            }
        }
        return result;
    }

    /**
     * удаление заявок
     * @param id
     * @return
     */
    public boolean delete(String id) {
        boolean result = false;
        for(int index = 0; index < this.items.length; index++) {
            if(this.items[index].getId().equals(id)) {
                if(index == this.items.length - 1) {
                    this.items[index] = null;
                    result = true;
                    break;
                }
                System.arraycopy(this.items, index + 1, this.items, (index), (this.items.length-index - 1));
                this.items[this.items.length - 1] = null;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * получение списка всех заявок
     * @return
     */
    public Item[] findAll() {
        Item [] arr = new Item[this.items.length];
        int count = 0;
        for(int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null) {
                arr[count] = this.items[index];
                count++;
            }
        }
        Item [] result = Arrays.copyOf(arr, count);
        return result;
    }

    /**
     * получение списка по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] arr = new Item[this.items.length];
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if(this.items[index] != null) {
                if (this.items[index].getName().equals(key)) {
                    arr[count] = this.items[index];
                    count++;
                }
            }
        }
       Item [] result = Arrays.copyOf(arr, count);
        return result;
    }

    /**
     * получение заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item result = null;
        for(int index = 0; index < this.items.length; index++) {
            if(this.items[index].getId().equals(id)) {
                result = this.items[index];
                break;
            }
        }
        return result;
    }
}