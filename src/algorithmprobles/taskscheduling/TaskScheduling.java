package algorithmprobles.anagramdetection.taskscheduling;
import java.util.Scanner;
public class TaskScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tasks: ");
        int T = scanner.nextInt();

        int[] deadlines = new int[T]; // Array to store deadlines for each task
        int[] minutesRequired = new int[T]; // Array to store minutes required for each task

        for (int i = 0; i < T; i++) {
            System.out.print("Enter the deadline and minutes required for task " + (i + 1) + ": ");
            deadlines[i] = scanner.nextInt(); // Read the deadline for the task
            minutesRequired[i] = scanner.nextInt(); // Read the minutes required for the task
        }

        int[] overshoots = new int[T]; // Array to store overshoot values for each task
        int completionTime = 0; // Variable to track the completion time of tasks
        int maxOvershoot = 0; // Variable to track the maximum overshoot value

        for (int i = 0; i < T; i++) {
            completionTime += minutesRequired[i]; // Update the completion time by adding the minutes required for the current task
            overshoots[i] = Math.max(0, completionTime - deadlines[i]); // Calculate the overshoot value for the current task
            maxOvershoot = Math.max(maxOvershoot, overshoots[i]); // Update the maximum overshoot value
        }

        System.out.println("Maximum overshoots for each task:");

        for (int i = 0; i < T; i++) {
            System.out.println("Task " + (i + 1) + ": " + overshoots[i]); // Output the overshoot value for each task
        }

        System.out.println("Maximum overshoot: " + maxOvershoot); // Output the maximum overshoot value

        scanner.close();
    }
}
