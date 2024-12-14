package com.dhivakar.assignment;
import com.dhivakar.assignment.employees.Manager;
import com.dhivakar.assignment.employees.Developer;
import com.dhivakar.assignment.utitlities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Alice Johnson", 101, 75000.0, "HR");
        Developer developer = new Developer("Bob Smith", 102, 85000.0, "Java");

        // Use EmployeeUtilities to display details and send messages
        EmployeeUtilities.displayEmployeeDetails(manager);
        EmployeeUtilities.displayEmployeeDetails(developer);

        // Calculate annual salaries
        double managerAnnualSalary = EmployeeUtilities.calculateAnnualSalary(manager);
        double developerAnnualSalary = EmployeeUtilities.calculateAnnualSalary(developer);
        
        System.out.println("Annual Salary of Manager: " + managerAnnualSalary);
        System.out.println("Annual Salary of Developer: " + developerAnnualSalary);

        // Send specific messages
        EmployeeUtilities.sendManagerMessage(manager);
        EmployeeUtilities.sendDeveloperMessage(developer);
    }

}
