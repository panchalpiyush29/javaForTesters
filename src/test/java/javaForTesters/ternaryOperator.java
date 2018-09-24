package javaForTesters;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ternaryOperator {

    //condition ? operand1:operand2

    @Test
    public void ternaryOperatorExplored() {
        int x;
        x = 4 > 3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5 > 4 ? true : false);
    }
}
