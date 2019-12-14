package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxFirst() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxThird() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 6, 6);
        assertThat(result, is(6));
    }
}