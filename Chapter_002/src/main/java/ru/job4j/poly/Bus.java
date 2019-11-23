package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Машина едет");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("В машине " + passenger + " пассажиров");
    }

    @Override
    public double fill(double fuel) {
        double price = 60.0;
        return price * fuel;
    }
}
