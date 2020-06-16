package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PointTest {
    @Test
    public void thenTwoPointWhen() {
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        double expected = 1.41;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);


    }

    @Test
    public void thenPoint3DWhen() {
        Point first = new Point(0, 0, 3);
        Point second = new Point(0, 2, 6);
        double expected = 2.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out,0.01);
    }
}


