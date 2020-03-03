package ru.job4j.stragery;

public class Paint {
    Shape shape;

    public void draw(Shape shape){
        System.out.print(shape.draw());
    }

    public static void main(String[] args){
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());

    }



}
