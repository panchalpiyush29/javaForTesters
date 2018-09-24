package javaForTesters;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class stringTests {

    @Test
    public void stringTestsExamples() {
        String aString = "abcdef";
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(aString.contains("ef"));
        assertTrue(aString.startsWith("ab"));
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }

    @Test
    public void stingExamples() {
        System.out.println("Hi there \nhow are you");
        System.out.println("Hi there\b");

        String x = "This is ";
        String y = x.concat("It");

        assertEquals(y, "This is It");
    }
}
