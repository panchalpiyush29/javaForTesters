package javaForTesters;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class timeExample {

    @Test
    public void displayTime() {
        Date date1 = new Date();

        Date date2 = new Date(System.currentTimeMillis());

        System.out.println(date2.toString());
    }

    @Test
    public void calendarExample() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTime().getTime());
        System.out.println(System.currentTimeMillis());
    }
}
