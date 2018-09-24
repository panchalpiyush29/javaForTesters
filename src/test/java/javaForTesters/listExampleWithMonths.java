package javaForTesters;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class listExampleWithMonths {

    @Test
    public void monthOfTheYear() {
        List<String> summer = new ArrayList<>();
        List<String> winter = new ArrayList<>();
        List<String> spring = new ArrayList<>();
        List<String> autumn = new ArrayList<>();

        Collection<String> year = new ArrayList<>();

        summer.add("DECEMBER");
        summer.add("JANUARY");
        summer.add("FEBRUARY");

        autumn.add("MARCH");
        autumn.add("APRIL");
        autumn.add("MAY");

        winter.add("JUNE");
        winter.add("JULY");
        winter.add("AUGUST");

        spring.add("SEPTEMBER");
        spring.add("OCTOBER");
        spring.add("NOVEMBER");

        year.addAll(summer);
        year.addAll(winter);
        year.addAll(spring);
        year.addAll(autumn);

        assertEquals(summer.size() + winter.size() + spring.size() + autumn.size(), year.size());

        for (String monthsOfYear : year) {
            System.out.println(monthsOfYear);
        }

    }
}
