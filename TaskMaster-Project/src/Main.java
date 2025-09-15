import java.util.Scanner;

/**
 * Main class for running the TaskMaster application.
 * Provides a console-based menu for users to interact with their task list.
 * @author Steven Saleeb
 */
public class Main {
    /**
     * Starts the TaskMaster program.
     * Displays a menu and processes user input in a loop.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean running = true;

        System.out.println("Welcome to TaskMaster!");
        
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark a task as done");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter due date (e.g., 2025-08-10): ");
                    String dueDate = scanner.nextLine();

                    manager.addTask(name, dueDate);
                    break;

                case "2":
                    manager.listTasks();
                    break;

                case "3":
                    System.out.print("Enter the number of the task to mark as done: ");
                    int doneIndex = parseIntInput(scanner);
                    manager.markTaskDone(doneIndex - 1); 
                    break;

                case "4":
                    System.out.print("Enter the number of the task to delete: ");
                    int delIndex = parseIntInput(scanner);
                    manager.deleteTask(delIndex - 1);
                    break;

                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static int parseIntInput(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
            return -1;
        }
    }
}