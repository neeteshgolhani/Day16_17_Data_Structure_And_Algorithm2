package datastructure.calander;
public class Calendar<T> {
    private static final String[] DAYS_OF_WEEK = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    private T[][] calendar;

    public Calendar(int weeks, int days) {
        calendar = (T[][]) new Object[weeks][days];
    }

    public void setDay(int week, int day, T value) {
        calendar[week][day] = value;
    }

    public T getDay(int week, int day) {
        return calendar[week][day];
    }

    public void printCalendar() {
        // Print days of the week
        for (String dayOfWeek : DAYS_OF_WEEK) {
            System.out.printf("%4s", dayOfWeek);
        }
        System.out.println();

        // Print calendar data
        for (T[] week : calendar) {
            for (T day : week) {
                System.out.printf("%4s", day);
            }
            System.out.println();
        }
    }
}
