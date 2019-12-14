package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conventer.Conventer;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 157;
        double expected = 54.05;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
