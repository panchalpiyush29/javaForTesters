package javaForTesters;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class ComputationViaMethodsTest {

    @Test
    public void addingNumbersTest() {
        assertTrue(addTwoNumbers(4, 3) == 7);
    }

    private int addTwoNumbers(int x, int y) {
        return x + y;
    }

    @Test
    public void operators() {
        assertEquals(4, 2 + 2);
        assertEquals(6, 8 - 2);
        assertEquals(3, 9 / 3);
        assertEquals(16, 4 * 4);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9 % 2);
    }

    @Test
    public void incrementDecrement() {
        int a = 3;
        assertEquals(++a, 4);
        int b = 5;
        assertEquals(--b, 4);
    }
}