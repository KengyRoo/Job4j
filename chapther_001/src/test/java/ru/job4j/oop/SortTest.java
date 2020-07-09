package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortTest {
    @Test
    public void whenEquals(){
        Sort machine = new Sort();
        int[] expected = {};
        int[] rsl = machine.change(100,100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35(){
        Sort machine = new Sort();
        int[] expecped = {10, 5};
        int[] rsl = machine.change(50,35);
        assertThat(rsl, is(expecped));
    }

}
