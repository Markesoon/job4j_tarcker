package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vova Popov");
        student.setGroup("№ 3");
        student.setData("1.09.2008");
        student.setCreated(new Date());

        System.out.println(student.getName() + " Group " + student.getGroup() + " : " + student.getData());
    }
}
