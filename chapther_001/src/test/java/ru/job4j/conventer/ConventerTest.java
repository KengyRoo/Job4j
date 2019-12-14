package ru.job4j.conventer;

import org.junit.Assert;
import org.junit.Test;

public class ConventerTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Conventer.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Conventer.rubleToDollar(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void dollarToRub(){
        int in = 3;
        int expected = 180;
        int out = Conventer.dollarToRuble(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void euroToRub() {
        int in = 2;
        int expected = 140;
        int out = Conventer.euroToRuble(in);
        Assert.assertEquals(expected,out);
    }
}