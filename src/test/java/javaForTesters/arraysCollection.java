package javaForTesters;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class arraysCollection {
    String workdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void simpleArraysExample() {
        String[] number0123 = {"zero", "one", "two", "three"};

        for (String numberText : number0123) {
            System.out.println(numberText);
        }
        //number0123[0] access the first value from the array list
        assertEquals("zero", number0123[0]);
        assertEquals("two", number0123[2]);
    }

    @Test
    public void workDaysTest() {

        assertEquals("Monday", workdays[0]);
        assertEquals("Friday", workdays[4]);
    }

    @Test
    public void daysLoop() {
        int dayIndex = 0;
        String days = " ";

        for (String workdays : workdays) {
            days = days + "|" + workdays;
            System.out.println("found " + workdays + " at position " + dayIndex);
            dayIndex++;
        }

        assertEquals(5, workdays.length);
    }

    @Test
    public void weekEnds() {
        String[] weekEnd;
        weekEnd = Arrays.copyOf(workdays, 7);
        //weekEnd[5] = "Saturday";
        //weekEnd[6] = "Sunday";

        Arrays.fill(weekEnd, 5, 6, "Saturday");
        Arrays.fill(weekEnd, 6, 7, "Sunday");

        assertEquals("Saturday", weekEnd[5]);
        assertEquals("Sunday", weekEnd[6]);

    }

    @Test
    public void dullDaysOfTheWeek() {
        String[] dullDays;

        dullDays = Arrays.copyOfRange(workdays, 0, 2);

        assertEquals(dullDays[1], workdays[1]);
        assertEquals(dullDays[0], workdays[0]);
    }

    @Test
    public void sortArrays() {
        int[] outOfOrder = {5, 2, 3, 0, 1, 4};
        Arrays.sort(outOfOrder);

        assertEquals(0, outOfOrder[0]);
        assertEquals(1, outOfOrder[1]);
        assertEquals(2, outOfOrder[2]);
        assertEquals(3, outOfOrder[3]);
        assertEquals(4, outOfOrder[4]);
        assertEquals(5, outOfOrder[5]);
    }

    @Test
    public void sortDays() {
        Arrays.sort(workdays);
        assertEquals("Friday", workdays[0]);
    }

    @Test
    public void multiArray() {
        int[][] multi = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        assertEquals(1, multi[0][0]);
        assertEquals(7, multi[1][2]);
        assertEquals(10, multi[2][1]);
        assertEquals(15, multi[3][2]);
    }
}
