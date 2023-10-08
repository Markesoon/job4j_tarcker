package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("gidvar@mail.ru", "Vasya Petrov");
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("palikin@gmail.ru", "Ivan Palikin");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
