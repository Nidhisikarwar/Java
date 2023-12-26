import java.util.Scanner;

public class FitnessTracker {

    private int totalSteps;
    private int totalMinutesActive;

    public FitnessTracker() {
        this.totalSteps = 0;
        this.totalMinutesActive = 0;
    }

    public void logActivity(int steps, int minutesActive) {
        totalSteps += steps;
        totalMinutesActive += minutesActive;
        System.out.println("Activity logged successfully!");
    }

    public void displaySummary() {
        System.out.println("Fitness Tracker Summary:");
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Total Minutes Active: " + totalMinutesActive);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessTracker fitnessTracker = new FitnessTracker();

        while (true) {
            System.out.println("\nFitness Tracker Menu:");
            System.out.println("1. Log Activity");
            System.out.println("2. Display Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of steps: ");
                    int steps = scanner.nextInt();
                    System.out.print("Enter minutes active: ");
                    int minutesActive = scanner.nextInt();
                    fitnessTracker.logActivity(steps, minutesActive);
                    break;

                case 2:
                    fitnessTracker.displaySummary();
                    break;

                case 3:
                    System.out.println("Exiting Fitness Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
