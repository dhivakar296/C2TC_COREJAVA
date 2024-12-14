package com.dhivakar.assignment.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter and Setter methods for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter methods for employeeId
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    // Getter and Setter methods for salary
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    /**
	     * Displays the details of the employee.
	     */
	    public void displayEmployeeDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	    }

}
