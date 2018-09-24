package javaForTesters;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2", 4, answer);
    }

    @Test
    public void canSubtractTwoNumbers() {
        int answer = 5 - 3;
        assertEquals("5-3", 2, answer);
    }

    @Test
    public void canDivideAndAddNumbers() {
        int answer = (4 / 2) + 1;
        assertEquals("(4 / 2) + 1", 3, answer);
    }

    @Test
    public void canMultipleAndSubtractNumbers() {
        int answer = (2 * 3) - 2;
        assertEquals("(2 * 3) - 2", 4, answer);
    }

    @Test()
    public void assertThatExample() {

        assertThat(2 + 2, is(4));
    }
}
