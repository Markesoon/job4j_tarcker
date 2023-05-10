package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String lenguage = eng;
        return lenguage;
    }

    public static void main(String[] args) {
        DummyDic rus = new DummyDic();
        String eng = rus.engToRus("eng");
        System.out.println("Неизвестное слово. " + eng);
    }
}
