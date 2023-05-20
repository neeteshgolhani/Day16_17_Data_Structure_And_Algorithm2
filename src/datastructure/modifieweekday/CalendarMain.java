package datastructure.modifieweekday;

public class CalendarMain {
    public static void main(String[] args) {
        // Create a Week
        Week<String> week = new Week<>();

        // Add WeekDay objects to the Week
        week.addDay("Monday");
        week.addDay("Tuesday");
        week.addDay("Wednesday");
        week.addDay("Thursday");
        week.addDay("Friday");
        week.addDay("Saturday");
        week.addDay("Sunday");

        // Display the Week
        while (!week.isEmpty()) {
            String day = week.removeDay();
            System.out.println(day);
        }
    }
}
