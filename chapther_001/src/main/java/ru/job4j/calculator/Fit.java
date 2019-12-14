package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double heigth){
        return (heigth - 100) * 1.15;
    }

    public static double womanWeight(double heigth){
        return (heigth - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        System.out.println("Man 175 is " + man);
        double woman = womanWeight(157);
        System.out.println("Woman 157 is " + woman);
    }
}
