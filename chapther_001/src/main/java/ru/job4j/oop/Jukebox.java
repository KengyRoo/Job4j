package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args){
       Jukebox petya = new Jukebox();
       petya.music(1);
       petya.music(2);
       petya.music(3);
    }

    public void music(int position){
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжие");
        } else if (position == 2){
            System.out.println("Спокойной ночи малыши");
        } else {
            System.out.println("Песня не найдена");
        }

    }
}
