package ru.job4j.calculator;

/**
 * Class Calculate создан для тренировки.
 * Method main
 * @param args - args.
 */

public class Calculator {
    public double add(double first, double second){
        return  first + second;
    }

    public double add(double first, double second, double third){
        return add(
                first,
                add(second,third)
        );
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + " = " + result);

    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    public static void substract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + " = " + result);
    }


    public static void main(String[] args){
        div(4,2);
        multiply(2,1);
        substract(10,5);
    }
}
