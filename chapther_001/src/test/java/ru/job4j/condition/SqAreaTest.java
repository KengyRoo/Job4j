package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void s1(){
        int k = 1;
        int p = 4;
        int s = 1;
        int out = (int) SqArea.square(p,k);
        Assert.assertEquals(s, out);

    }
}
