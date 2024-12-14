package com.dhivakar.assignment.employees;

public class Manager extends Employee {
	
	 private String department;

	    // Constructor
	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);  // Calling the superclass (Employee) constructor
	        this.department = department;
	    }

	    // Getter and Setter methods for department
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();  // Call the parent method to display common employee details
	        System.out.println("Department: " + department);
	    }
}
