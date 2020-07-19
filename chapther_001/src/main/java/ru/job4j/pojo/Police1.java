package ru.job4j.pojo;

import java.util.Date;

public class Police1 {
    public static void main(String[] args){
        License1 license = new License1();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
