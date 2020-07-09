package ru.job4j.oop;

import java.util.Arrays;

public class Sort {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price){
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int index = 0; index < COINS.length; index++) {
            while ((money - COINS[index]) >= 0) {
                money = money - COINS[index];
                //money -= COINS[index]:
                rsl[size++] = COINS[index];
            }
     }
        return Arrays.copyOf(rsl, size);
    }
}
