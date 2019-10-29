package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox recorder = new Jukebox();
        int button1 = 1;
        int button2 = 2;
        int button3 = 0;
        recorder.music(button1);
        recorder.music(button2);
        recorder.music(button3);

    }
}
