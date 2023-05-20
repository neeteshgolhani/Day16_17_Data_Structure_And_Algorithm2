package datastructure.calander;
import java.util.Calendar;

public class CalanderMain {
    public static void main(String[] args) {
        // Check if the command-line arguments contain the month and year values

        if (args.length < 2) {
            System.out.println("Please provide the month and year as command-line arguments.");
            return;
        }
        // Parse the command-line arguments into integers

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        // Determine the number of weeks and days in the month
        int weeks = calculateWeeksInMonth(month, year);
        int days = 7; // 7 days in a week
        // Create a new Calendar object with the specified number of weeks and days

        datastructure.calander.Calendar<Integer> calendar = new datastructure.calander.Calendar<>(weeks, days);

        // Fill the calendar with day numbers
        int dayNumber = 1;
        for (int week = 0; week < weeks; week++) {
            for (int day = 0; day < days; day++) {
                // Check if the day number is within the valid range for the month

                if (dayNumber <= getDaysInMonth(month, year)) {
                    calendar.setDay(week, day, dayNumber++);
                }
            }
        }

        // Print the calendar
        calendar.printCalendar();
    }
       // Method to calculate the number of weeks in the given month

    private static int calculateWeeksInMonth(int month, int year) {
        // Create a java.util.Calendar instance

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        // Set the calendar to the first day of the month

        calendar.set(year, month - 1, 1);
        // Get the actual maximum number of days in the month

        int daysInMonth = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        // Get the day of the week for the first day of the month

        int firstDayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        // Calculate the number of weeks using daysInMonth and firstDayOfWeek

        return (int) Math.ceil((daysInMonth + firstDayOfWeek - 1) / 7.0);
    }
// Method to get the number of days in the given month

    private static int getDaysInMonth(int month, int year) {
        // Array to store the number of days in each month

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // Check if it's a leap year and update the number of days in February

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        // Return the number of days for the given month

        return daysInMonth[month - 1];
    }
// Method to check if the given year is a leap year

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}