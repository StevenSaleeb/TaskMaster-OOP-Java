/**
 * Represents a single task in the to-do list.
 * Each task has a name, due date, and completion status.
 * @author Steven Saleeb
 */
public class Task {

    /** The name or description of the task. */
    private String name;

    /** The due date of the task in YYYY-MM-DD format. */
    private String dueDate;

    /** Flag indicating whether the task has been completed. */
    private boolean isDone;

    /**
     * Creates a new task with the given name and due date.
     * The task is initially marked as not done.
     * @param name The name or title of the task.
     * @param dueDate The due date for the task.
     */
    public Task(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.isDone = false;
    }

    /**
     * Marks this task as completed.
     */
    public void markDone() {
        isDone = true;
    }

    /**
     * Returns the name of the task.
     * 
     * @return The task's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the due date of the task.
     * 
     * @return The task's due date.
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Returns whether the task is completed.
     * @return true if the task is done, false otherwise.
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Returns a string representation of the task,
     * showing whether it's completed and the due date.
     * @return A formatted string describing the task.
     */
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + name + " (Due: " + dueDate + ")";
    }

}
