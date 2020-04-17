package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertival(char[][] board, int column){
        boolean result = true;
        for (int j = 0; j < board[column].length; j++){
            if (board[j][column] != 'X'){
                result = false;
                break;
            }
        }
        return result;
    }
}
