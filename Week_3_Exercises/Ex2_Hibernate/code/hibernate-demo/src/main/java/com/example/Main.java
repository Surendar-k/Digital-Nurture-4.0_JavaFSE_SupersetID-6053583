package com.example;

import com.example.model.Employee;
import com.example.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Surendar");
        emp.setSalary(55000.0);

        EmployeeService service = new EmployeeService();
        Integer id = service.addEmployee(emp);

        System.out.println("Employee saved with ID: " + id);
    }
}
