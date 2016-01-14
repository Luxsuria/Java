package ru.spb.herzen.ivt3;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    App app;

    public void setUp() {
        app = new App();
    }

    public void testSum()
    {
        assertEquals(app.sum(1, -1), 0);
        assertEquals(app.sum(-1, -5), -6);
        assertEquals(app.sum(1, 6), 7);

        assertEquals(app.sum("test1", "test2"), "testfin");
    }

    public void testMultiply()
    {
        assertEquals(app.multiply(0, 2), 0);

        assertEquals(app.multiply(5, 6), 30);
        assertEquals(app.multiply(-5, -6), 30);
        assertEquals(app.multiply(5, -6), -30);

        assertEquals(app.multiply(10, 0.1f), 1.0f, 0.001);
        assertEquals(app.multiply(0.1f, 10), 1.0f, 0.001);

        assertEquals(app.multiply(2.2f, 2.2f), 4.84f, 0.001);
        assertEquals(app.multiply(2.2f, -2.2f), -4.84f, 0.001);
        assertEquals(app.multiply(-2.2f, -2.2f), 4.84f, 0.001);
    }

    public void testFunction()
    {
        assertEquals(app.function(1), 0.01f, 0.001);
        assertEquals(app.function(10), 0.1f, 0.001);
        assertEquals(app.function(100), 1f, 0.001);

    }
}
