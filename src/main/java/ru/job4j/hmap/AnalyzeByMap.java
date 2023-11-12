package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subjects : pupil.subjects()) {
                score += subjects.score();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subjects : pupil.subjects()) {
                score += subjects.score();
                label.add(new Label(pupil.name(), score / pupil.subjects().size()));
            }
        }
        return label;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> rsl = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subjects : pupil.subjects()) {
                double score = rsl.getOrDefault(subjects.name(), 0) + subjects.score();
                rsl.put(subjects.name(), (int) score);
            }
        }
        List<Label> label = new ArrayList<>();
        for (Map.Entry<String, Integer> map : rsl.entrySet()) {
            label.add(new Label(map.getKey(), (double) map.getValue() / pupils.size()));
        }
        return label;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subjects : pupil.subjects()) {
                score += subjects.score();
            }
            label.add(new Label(pupil.name(), score));
            score = 0;
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> label = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.putIfAbsent(subject.name(), 0);
                map.put(subject.name(), map.get(subject.name()) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> subject : map.entrySet()) {
            label.add(new Label(subject.getKey(), (double) subject.getValue()));
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }
}