import java.util.ArrayList;

/**
 * Manages a list of tasks.
 * Provides functionality to add, remove, mark, and display tasks.
 * @author Steven Saleeb
 */
public class TaskManager {

    /** The internal list of tasks. */
    private ArrayList<Task> tasks;

    /**
     * Constructs a new TaskManager with an empty task list.
     */
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a new task to the list.
     * @param name     The name of the task.
     * @param dueDate  The due date of the task.
     */
    public void addTask(String name, String dueDate) {
        Task newTask = new Task(name, dueDate);
        tasks.add(newTask);
        System.out.println("Task added successfully.");
    }

    /**
     * Deletes a task from the list based on its index.
     * @param index The index of the task to delete (0-based).
     */
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    /**
     * Marks a task as done based on its index.
     * @param index The index of the task to mark as done (0-based).
     */
    public void markTaskDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markDone();
            System.out.println("Task marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    /**
     * Prints all tasks in the list to the console.
     */
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println();
        }
    }

    /**
     * Returns the list of tasks.
     * Useful for extending the app with saving or filtering.
     * @return An ArrayList of tasks.
     */
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}