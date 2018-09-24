package javaForTesters;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class collection {

    String[] someDays = {"Thursday", "Tuesday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};
    List<String> days = Arrays.asList(someDays);

    @Test
    public void collectionExample() {
        List<String> numbers0123 = new ArrayList<String>();

        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123.get(0));
        assertEquals("two", numbers0123.get(2));
    }

    @Test
    public void forCountExample() {
        int forCount = 0;

        for (String day : days) {
            if (day.equals("Monday")) {
                break;
            }
            forCount++;
        }
        assertEquals("Monday is at position 3", 3, forCount);
    }

    @Test
    public void loopCountExample() {
        int loopCount;

        for (loopCount = 0; loopCount <= days.size(); loopCount++) {
            if (days.get(loopCount).equals("Monday")) {
                break;
            }
        }
        assertEquals("Monday is at position 3", 3, loopCount);
    }

    @Test
    public void whileLoopExample() {
        int count = 0;

        while (!days.get(count).equals("Monday")) {
            count++;
        }

        assertEquals("Monday is at position 3", 3, count);
    }

    @Test
    public void doWhileExample() {
        int docount = -1;

        do {
            docount++;
        } while (!days.get(docount).equals("Monday"));
        assertEquals("Monday is at position 3", 3, docount);
    }

    @Test
    public void collectionDaysOfWeek() {
        Collection<String> workDays = new ArrayList<>();
        Collection<String> daysOfWeek = new ArrayList<>();
        Collection<String> weekEnds = new ArrayList<>();

        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");

        daysOfWeek.addAll(workDays);

        assertEquals(workDays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workDays));

        weekEnds.add("Saturday");
        weekEnds.remove("Funday");

        assertFalse(weekEnds.contains("Funday"));

        weekEnds.add("Sunday");
        assertTrue("Bug fixed Sunday is in collection now", weekEnds.contains("Sunday"));

        daysOfWeek.addAll(weekEnds);

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }

        Object[] daysOfWeekArray = daysOfWeek.toArray();

        assertEquals("Monday".length(), ((String) daysOfWeekArray[0]).length());

        String[] anotherArray = new String[daysOfWeek.size()];
        daysOfWeek.toArray(anotherArray);
        assertEquals("Monday".length(), anotherArray[0].length());

    }

    @Test
    public void getAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));

        days.add(3, "Thursday");
        days.add(4, "Friday");
        days.add(5, "Saturday");
        days.add(6, "Sunday");

        List<String> workdays = days.subList(0, 5);
        System.out.println("Work days are :");
        System.out.println(workdays);

    }

    @Test
    public void setExamples() {
        Set<String> days = new HashSet();

        days.add("Monday");
        days.add("Monday");
        days.add("Monday");
        days.add("Monday");

        assertEquals(1, days.size());
    }
}
