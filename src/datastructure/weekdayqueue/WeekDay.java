package datastructure.weekdayqueue;

// Class representing a WeekDay
class WeekDay<T> {
    private T day;
    private T date;

    public WeekDay(T day, T date) {
        this.day = day;
        this.date = date;
    }

    public T getDay() {
        return day;
    }

    public T getDate() {
        return date;
    }
}