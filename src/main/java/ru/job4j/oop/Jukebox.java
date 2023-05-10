package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже" + position);
        }
        if (position == 2) {
            System.out.println("Спокойной ночи" + position);
        }
        if (position > 2) {
            System.out.println("Песня не найдена" + position);
        }
    }

    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        int position = 1;
        petya.music(position);
    }
}
