package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Objects;
import java.time.format.DateTimeFormatter;

public class Item {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Item item = (Item) object;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
