package datastructure.weekdayqueue;
import java.util.*;
class Week<T> {
    private Queue<WeekDay<T>> days;

    public Week() {
        days = new LinkedList<>();
    }

    public void addDay(WeekDay<T> day) {
        days.add(day);
    }

    public Queue<WeekDay<T>> getDays() {
        return days;
    }
}