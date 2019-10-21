package ru.job4j.oop;

public class BallStory {
    public void finish () {
        System.out.println("Конец сказки.");
    }

    public static void main(String[] args) {
        BallStory skazka = new BallStory();
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();

        ball.move();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        skazka.finish();
    }
}
