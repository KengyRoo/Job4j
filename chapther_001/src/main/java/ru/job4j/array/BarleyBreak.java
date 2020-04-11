package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;
        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;

        int[][] dvm = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dvm[i][j] = i * 3 + j + 1;
                System.out.print(dvm[i][j]);
            }
            System.out.println();

        }
    }
}
