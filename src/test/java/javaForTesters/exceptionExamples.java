package javaForTesters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class exceptionExamples {

    @Test
    public void throwNullPointerException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
            System.out.println("get message" + e.getMessage());
            System.out.println("get Stacktrace" + e.getStackTrace());
            System.out.println("print Stacktrace");
            e.printStackTrace();
        }

        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        String ageAsString = age.toString();
    }

    @Test
    public void tryCatchFinallyExample() {
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + age.toString() + " years old";
            assertEquals("You are 18 years old", yourAge);
        }
    }
}
