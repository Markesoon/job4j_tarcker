package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> func = new ArrayList<>();
        for (int i = start; i < end; i++) {
            func.add(function.apply((double) i));
        }
        return func;
    }
}