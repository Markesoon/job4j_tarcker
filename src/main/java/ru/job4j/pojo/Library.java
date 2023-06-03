package ru.job4j.pojo;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book code = new Book("Clean code", 10);
        Book garry = new Book("garry", 4);
        Book mythiccal = new Book("mythiccal", 19);
        Book cry = new Book("cry", 5);
        Book[] prods = new Book[4];
        prods[0] = code;
        prods[1] = garry;
        prods[2] = mythiccal;
        prods[3] = cry;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("0 and 3");
        prods[0] = cry;
        prods[3] = code;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("book name Clean code");
        for (int index = 0; index < prods.length; index++) {

            Book pr = prods[index];
            if ("Clean code".equals(pr.getName())) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
