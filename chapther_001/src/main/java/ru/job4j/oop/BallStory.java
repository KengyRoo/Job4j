package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball colobok = new Ball();
        Hare zaiac = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        zaiac.tryEat(colobok);
        wolf.tryEat(colobok);
        fox.tryEaat(colobok);
    }
}
