## TaskMaster
    A simple Java console-based task management application built using object-oriented programming principles. TaskMaster allows users to create, view, complete, and delete tasks in a to-do list.
## Features
    Add new tasks with a name and due date.
    View all tasks in a formatted list showing completion status and due dates.
    Mark tasks as completed.
    Delete tasks from the list.
    Handles invalid input gracefully.
## Classes
    Task:
        Represents a single task in the to-do list.
        name – The name or description of the task.
        dueDate – Due date in YYYY-MM-DD format.
        isDone – Boolean flag indicating whether the task is completed.
        Methods:
        markDone() – Marks the task as completed.
        toString() – Returns a formatted string showing the task’s name, status, and due date.
    TaskManager:
        Manages a list of Task objects.
        Stores tasks in an ArrayList.
        Methods:
        addTask(name, dueDate) – Adds a new task.
        deleteTask(index) – Deletes a task by its index.
        markTaskDone(index) – Marks a task as complete.
        listTasks() – Displays all tasks.
        getTasks() – Returns the internal list of tasks.
    Main:
        The entry point of the application.
        Provides a console-based menu for users to interact with their task list.
        Loops until the user chooses to exit.
        Handles invalid inputs and task selection errors.
## Features
- Add a task with a name and due date
- View all current tasks
- Mark tasks as complete
- Delete tasks from the list
- Simple and clean user interface via the console

## Technologies
- Java
- Object-Oriented Programming (Classes & Objects)
- Arrays and ArrayLists
- Scanner (for user input)