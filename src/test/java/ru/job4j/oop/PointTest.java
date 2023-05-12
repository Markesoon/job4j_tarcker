package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void thenTwoPointWhen() {
        Point first = new Point(3, 4);
        Point second = new Point(4, 2);
        double expect = first.distance(second);
        assertEquals(expect, 2.23, 0.01);
    }

    @Test
    public void thenPoint3DWhen() {
        Point first = new Point(5, 1, 3);
        Point second = new Point(3, 2, 2);
        double expect = first.distance3d(second);
        assertEquals(expect, 2.44d, 0.01);
    }
}