import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the TaskManager class.
 * Ensures correctness of adding, deleting, marking, and managing tasks.
 * @author Steven Saleeb
 */
public class TaskManagerTest {

    /**
     * Tests adding a single task.
     */
    @Test
    public void testAddTaskOne() {
        TaskManager manager = new TaskManager();
        manager.addTask("Read book", "2025-09-01");
        assertEquals(1, manager.getTasks().size());
        assertEquals("Read book", manager.getTasks().get(0).getName());
    }

    /**
     * Tests adding multiple tasks.
     */
    @Test
    public void testAddMultipleTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task A", "2025-01-01");
        manager.addTask("Task B", "2025-02-01");
        assertEquals(2, manager.getTasks().size());
    }

    /**
     * Tests deleting a valid task index.
     */
    @Test
    public void testDeleteValidIndex() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task A", "2025-01-01");
        manager.addTask("Task B", "2025-01-02");
        manager.deleteTask(0);
        assertEquals("Task B", manager.getTasks().get(0).getName());
    }

    /**
     * Tests deleting with an invalid index.
     */
    @Test
    public void testDeleteInvalidIndex() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task 1", "2025-01-01");
        manager.deleteTask(5); // Should not crash
        assertEquals(1, manager.getTasks().size());
    }

    /**
     * Tests marking a task as done with a valid index.
     */
    @Test
    public void testMarkTaskDoneValid() {
        TaskManager manager = new TaskManager();
        manager.addTask("Finish project", "2025-12-31");
        manager.markTaskDone(0);
        assertTrue(manager.getTasks().get(0).isDone());
    }

    /**
     * Tests marking a task with invalid index does nothing.
     */
    @Test
    public void testMarkTaskDoneInvalid() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task 1", "2025-01-01");
        manager.markTaskDone(99); // Out of bounds
        assertFalse(manager.getTasks().get(0).isDone());
    }

    /**
     * Tests listTasks with an empty list (visual check).
     */
    @Test
    public void testListTasksEmpty() {
        TaskManager manager = new TaskManager();
        assertDoesNotThrow(manager::listTasks); // Should not crash
    }

    /**
     * Tests listTasks after adding tasks (visual check).
     */
    @Test
    public void testListTasksNonEmpty() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test 1", "2025-08-07");
        manager.addTask("Test 2", "2025-08-08");
        assertDoesNotThrow(manager::listTasks); // Should still not crash
    }
}