package ru.job4j.oop;

public class DummyDic {
    public String engToRus (String eng) {
        String str = "Неизвестное слово" + " " + eng;
        return str;
    }

    public static void main(String[] args) {
        DummyDic wordbook = new DummyDic();
        String word = "Hello";
        System.out.println(wordbook.engToRus(word));
    }
}
