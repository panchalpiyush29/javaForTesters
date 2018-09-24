package javaForTesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void hexValue() {
        assertEquals("that 11 becomes b: ", Integer.toHexString(11), "b");
        assertEquals("that 10 becomes a:", Integer.toHexString(10), "a");
        assertEquals("that 3 becomes", Integer.toHexString(3), "3");
        assertEquals("that 21 becomes", Integer.toHexString(21), "15");

    }

    @Test
    public void maxMinIntegerSizes() {
        assertEquals("Integer.MIN_VALUE equals -2147483648 ", Integer.MIN_VALUE, -2147483648);
        assertEquals("Integer.MIN_VALUE equals 2147483647 ", Integer.MAX_VALUE, 2147483647);
    }
}
