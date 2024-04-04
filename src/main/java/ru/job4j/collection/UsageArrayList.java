package ru.job4j.collection;


import java.util.ArrayList;
import java.util.Arrays;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Stepan");
        names.add("Ivan");
        names.add("Petr");
        for (String str : names) {
            System.out.println(str);
        }
    }
}
