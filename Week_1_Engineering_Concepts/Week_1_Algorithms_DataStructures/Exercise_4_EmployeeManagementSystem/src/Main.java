

import model.Employee;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService(5); // Capacity of 5

        service.addEmployee(new Employee(1, "Alice", "Manager", 60000));
        service.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        service.addEmployee(new Employee(3, "Charlie", "Designer", 45000));

        
        System.out.println("\nAll Employees:");
        service.displayAllEmployees();

        System.out.println("\nSearch Employee with ID 2:");
        Employee found = service.searchEmployee(2);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found.");
        }

      
        System.out.println("\nDeleting Employee with ID 2...");
        service.deleteEmployee(2);

        System.out.println("\nAll Employees after deletion:");
        service.displayAllEmployees();
    }
}
