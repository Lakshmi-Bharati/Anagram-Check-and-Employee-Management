package com.example.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add Employee objects to the list
        employees.add(new Employee(101, "Alice Johnson", 50000));
        employees.add(new Employee(102, "Bob Smith", 60000));
        employees.add(new Employee(103, "Charlie Brown", 55000));

        // Display details of each employee
        System.out.println("Employee Details:\n");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
