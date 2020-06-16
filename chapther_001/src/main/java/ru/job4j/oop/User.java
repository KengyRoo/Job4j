package ru.job4j.oop;

public class User {
    private String name; // поле объекта обявляется в области класса
    private int age; // поле объекта объявляется в области класса

    public boolean canDrive() {
        boolean can = false; // локальная переменная объявляется внутри метода
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
