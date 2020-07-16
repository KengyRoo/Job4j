package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aleksandr Kostyuk");
        student.setGroup("Job4j");
        student.setDay(new Date());

        System.out.println(student.getName() + " lerning - " + student.getGroup() + " : " + student.getDay());
    }
}
