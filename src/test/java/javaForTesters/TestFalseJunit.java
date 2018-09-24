package javaForTesters;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestFalseJunit {

    @Test
    public void comparisionTest() {
        int number1 = 4 + 3;
        int number2 = 10 - 4;

        assertFalse(" number1 == number2", number1 == number2);
    }
}
