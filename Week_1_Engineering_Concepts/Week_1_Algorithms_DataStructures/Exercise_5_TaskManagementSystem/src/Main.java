
import list.TaskLinkedList;
import model.Task;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Write Tests", "Pending"));

      
        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

       
        System.out.println("\nSearching for Task with ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        
        System.out.println("\nDeleting Task with ID 2...");
        taskList.deleteTask(2);

        
        System.out.println("\nAll Tasks after deletion:");
        taskList.displayTasks();
    }
}
