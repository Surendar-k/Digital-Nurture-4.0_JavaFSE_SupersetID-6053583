package list;

import model.Task;

public class TaskLinkedList {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(" Task added.");
    }

   
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

 
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println(" Task list is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                System.out.println(" Task deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println(" Task ID not found.");
    }
}
