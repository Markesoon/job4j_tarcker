package ru.job4j.cast;

import java.util.Arrays;

public class VehicleName {
    public static void main(String[] args) {
        Fly fly = new Fly();
        Bus bus = new Bus();
        Train train = new Train();
        Vehicle[] vehicles = new Vehicle[]{fly, bus, train};
        for (Vehicle go : vehicles) {
            go.move();
        }
    }
}
