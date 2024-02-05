package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (key, value) -> map.put(key, value);
        /*
            Замените вставку элементов в карту на использование BiConsumer, он уже объявлен, требуется его реализовать.
         */
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPredicate = (key, value) -> key % 2 == 0 || value.length() == 4;
            for (Integer key : map.keySet()) {
                System.out.println("key: " + key + " value: " + map.get(key));
            /*
                Замените проверку в if() на использование BiPredicate, он объявлен выше, требуется его реализовать.
             */
            }
        /*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        Consumer<String> consumer = System.out::println;
        Function<String, String> function = String::toUpperCase;
        for (String string : supplier.get()) {
            consumer.accept(function.apply(string));
            System.out.println(string);
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
        }
    }
}