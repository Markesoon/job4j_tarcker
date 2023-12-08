package ru.job4j.bank;

import java.util.Objects;

/**
 * класс представляющий клента.
 */
public class User {
    /**
     * Поле пасспорт клиента
     */
    private String passport;
    /**
     * поле имени клиента
     */
    private String username;

    /**
     * Конструктор
     * @param passport данные паспорта клиента
     * @param username Имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Getter поля паспорта
     * @return Знаяение паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Setter поля паспортю
     * @param passport Знаяение паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Getter поля имени
     * @return Знаяение имени
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter поля имени
     * @param username Знаяение имени
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals()
     * @param o иной экземпляр класса User
     * @return true если User равны,
     * false если User не равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hashCode()
     * @return хэш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}