package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwichArrayTest {

    @Test
    public void whemSwap0to3(){
        int[] input = {1,2,3,4};
        int[] expect = {4,2,3,1};
        int[] rsl = SwitchArray.swap(input, 0, input.length -1);
        assertThat(rsl, is(expect));
    }


}
