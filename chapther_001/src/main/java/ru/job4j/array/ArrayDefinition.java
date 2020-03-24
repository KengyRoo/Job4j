package ru.job4j.array;

public class ArrayDefinition {
    short[] ages = new short[10];
    String[] surnames = new String[100500];
    float[] prices = new float[40];

    public static void main(String[] args){
        String[] names = new String[4];
        names[0] = "Sasha";
        names[1] = "Aleksandr";
        names[2] = "Oleksandr";
        names[3] = "Sanek";
        for (int index = 0; index < names.length; index++){
            System.out.println(names[index]);
        }
    }

}
