package ru.job4j.oop;

import java.util.Arrays;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(30);
        Battery second = new Battery(50);
        first.exchange(second);
        System.out.println("First." + first.about());
    }
}

