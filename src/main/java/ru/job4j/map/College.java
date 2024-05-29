package ru.job4j.map;

import java.util.Map;
import java.util.Set;
import java.util.Optional;

public class College {

    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl;
        rsl = students.keySet()
                .stream()
                .filter(student -> student.account().equals(account))
                .findFirst();
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> option = findByAccount(account);
        if (option.isPresent()) {
            Student student = option.get();
            rsl = students.get(student)
                    .stream()
                    .filter(subject -> subject.name().equals(name))
                    .findFirst();
        }
        return rsl;
    }
}