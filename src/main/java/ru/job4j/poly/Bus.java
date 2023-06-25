package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Движение");
    }

    @Override
    public void passenger() {
        System.out.println("5 пассажиров");
    }

    @Override
    public int refuel(int sum, int price) {
        return sum / price;
    }
}
