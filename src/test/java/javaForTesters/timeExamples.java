package javaForTesters;

import org.junit.Test;

public class timeExamples {

    @Test
    public void currentTimeMills() {
        long startTime = System.nanoTime();

        System.out.println("Start time " + startTime);

        for (int x = 0; x < 10; x++) {
            System.out.println("Current time " + System.nanoTime());
        }

        long endTime = System.nanoTime();

        System.out.println("End time " + (endTime - startTime));
    }

}
