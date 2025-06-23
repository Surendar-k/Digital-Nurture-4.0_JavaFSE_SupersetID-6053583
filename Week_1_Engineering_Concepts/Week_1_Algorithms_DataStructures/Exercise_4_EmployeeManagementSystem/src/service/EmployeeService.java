package service;

import model.Employee;

public class EmployeeService {
    private Employee[] employees;
    private int size;

    public EmployeeService(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

  
    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
            System.out.println("✅ Employee added.");
        } else {
            System.out.println("❌ Array is full. Cannot add employee.");
        }
    }

  
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

 
    public void displayAllEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }

   
    public void deleteEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                found = true;
                System.out.println("✅ Employee deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("❌ Employee ID not found.");
        }
    }
}
