import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Task class.
 * Covers task creation, completion status, and string formatting.
 * @author Steven Saleeb
 */
public class TaskTest {

    /**
     * Tests task creation with normal input.
     */
    @Test
    public void testTaskCreationValid() {
        Task task = new Task("Buy groceries", "2025-08-10");
        assertEquals("Buy groceries", task.getName());
        assertEquals("2025-08-10", task.getDueDate());
        assertFalse(task.isDone());
    }

    /**
     * Tests task creation with empty name and date.
     */
    @Test
    public void testTaskCreationEmptyFields() {
        Task task = new Task("", "");
        assertEquals("", task.getName());
        assertEquals("", task.getDueDate());
        assertFalse(task.isDone());
    }

    /**
     * Tests markDone changes isDone to true.
     */
    @Test
    public void testMarkDoneChangesState() {
        Task task = new Task("Do homework", "2025-08-15");
        task.markDone();
        assertTrue(task.isDone());
    }

    /**
     * Tests markDone on an already completed task.
     */
    @Test
    public void testMarkDoneOnAlreadyDoneTask() {
        Task task = new Task("Finish quiz", "2025-08-16");
        task.markDone();
        task.markDone(); // Call again
        assertTrue(task.isDone()); // Should remain true
    }

    /**
     * Tests toString for an incomplete task.
     */
    @Test
    public void testToStringNotDone() {
        Task task = new Task("Clean room", "2025-08-12");
        String expected = "[ ] Clean room (Due: 2025-08-12)";
        assertEquals(expected, task.toString());
    }

    /**
     * Tests toString after task is marked done.
     */
    @Test
    public void testToStringDone() {
        Task task = new Task("Call mom", "2025-08-12");
        task.markDone();
        String expected = "[X] Call mom (Due: 2025-08-12)";
        assertEquals(expected, task.toString());
    }
}