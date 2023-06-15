package ru.job4j.io;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("да");
        }
        if (answer == 1) {
            System.out.println("нет");
        }
        if (answer == 2) {
            System.out.println("Может быть");
            }
        }
    }