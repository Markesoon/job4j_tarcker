package ru.job4j.collection;

public class Task {
    private String numbers;
    private String descr;

    public Task(String numbers, String descr) {
        this.numbers = numbers;
        this.descr = descr;
    }

    public String getNumbers() {
        return numbers;
    }
}