package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal(){
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input,1);
        assertThat(result, is(true));
    }

    @Test
    public void whenVertial(){
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertival(input,2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical4x4False() {
        char[][] input = {
                {'X', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', 'X', 'X'},
                {' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertival(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extraDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDiagonal1() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', ' '},
        };
        char[] result = MatrixCheck.extraDiagonal(input);
        char[] expect = {'X', 'X', ' '};
        assertThat(result, is(expect));
    }
}
