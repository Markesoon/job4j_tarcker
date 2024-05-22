package ru.job4j.search;
import java.util.function.Predicate;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> preAddress = person -> person.getAddress().contains(key);
        Predicate<Person> prePhone = person -> person.getPhone().contains(key);
        Predicate<Person> preSurname = person -> person.getSurname().contains(key);
        Predicate<Person> preName = person -> person.getName().contains(key);
        var combine = preName.or(preName).or(preAddress).or(prePhone).or(preSurname);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}