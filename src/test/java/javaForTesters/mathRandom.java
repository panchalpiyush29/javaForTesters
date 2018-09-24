package javaForTesters;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class mathRandom {

    @Test
    public void mathExample() {
        double rnd = Math.random();

        System.out.println(String.format("generated %f as random number", rnd));

        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd > 0.0d, is(true));
    }

    @Test
    public void randomExample() {
        Random generate = new Random();

        boolean randomBoolean = generate.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        int randomInt = generate.nextInt();
        System.out.println("Random Int: " + randomInt);

    }

    @Test
    public void mathExample1() {
        assertThat(Math.max(10.1, 10.0), is(10.1));
    }
}
