package datastructure.weekdayqueue;

import java.util.Queue;

public class CalendarMain {
    public static void main(String[] args) {
        // Create a Week
        Week<String> week = new Week<>();

        // Add WeekDay objects to the Week
        week.addDay(new WeekDay<>("Monday", "1"));
        week.addDay(new WeekDay<>("Tuesday", "2"));
        week.addDay(new WeekDay<>("Wednesday", "3"));
        week.addDay(new WeekDay<>("Thursday", "4"));
        week.addDay(new WeekDay<>("Friday", "5"));
        week.addDay(new WeekDay<>("Saturday", "6"));
        week.addDay(new WeekDay<>("Sunday", "7"));

        // Display the Week
        Queue<WeekDay<String>> days = week.getDays();
        for (WeekDay<String> day : days) {
            System.out.println(day.getDay() + ": " + day.getDate());
        }
    }
}
