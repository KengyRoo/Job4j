package ru.job4j.pojo;

import java.util.Date;

public class College1 {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setName("Aleksandr Kostyuk");
        student.setGroup("Job4j");
        student.setDay(new Date());

        System.out.println(student.getName() + " lerning - " + student.getGroup() + " : " + student.getDay());
    }
}
