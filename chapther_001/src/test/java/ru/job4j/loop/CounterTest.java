package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenEvenFromNumbersFromOneThen30(){
        Counter sum = new Counter();
        int result = sum.add(0,30);
        assertThat(result, is(240));

    }
}
