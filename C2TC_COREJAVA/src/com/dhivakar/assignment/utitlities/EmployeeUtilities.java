package com.dhivakar.assignment.utitlities;
import com.dhivakar.assignment.employees.Employee;
import com.dhivakar.assignment.employees.Manager;
import com.dhivakar.assignment.employees.Developer;


public class EmployeeUtilities {
	public static double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }

    /**
     * Displays the details of an employee. 
     * This method works with any Employee, including Manager and Developer.
     * 
     * @param employee The employee whose details will be displayed.
     */
    public static void displayEmployeeDetails(Employee employee) {
        employee.displayEmployeeDetails();
    }

    /**
     * This method prints a specific message for Managers.
     * 
     * @param manager The manager to whom the message will be sent.
     */
    public static void sendManagerMessage(Manager manager) {
        System.out.println("Message for Manager: " + manager.getName() + ", responsible for the " + manager.getDepartment() + " department.");
    }

    /**
     * This method prints a specific message for Developers.
     * 
     * @param developer The developer to whom the message will be sent.
     */
    public static void sendDeveloperMessage(Developer developer) {
        System.out.println("Message for Developer: " + developer.getName() + ", proficient in " + developer.getProgrammingLanguage() + ".");
    }
}
