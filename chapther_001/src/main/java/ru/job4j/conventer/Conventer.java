package ru.job4j.conventer;

public class Conventer {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value){
        return value/60;
    }

    public static int euroToRuble(int value){
        return value*70;
    }

    public static int dollarToRuble(int value ){
        return value*60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are "+ euro + " euro.");
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are "+ dollar + " dollar");
        int rubE = euroToRuble(2);
        System.out.println("2 euro are "+ rubE + " ruble");
        int rubD = dollarToRuble(3);
        System.out.println("3 dollar are " + rubD + " ruble");

    }
}
