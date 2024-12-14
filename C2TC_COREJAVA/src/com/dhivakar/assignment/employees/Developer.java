package com.dhivakar.assignment.employees;

public class Developer extends Employee{
	 private String programmingLanguage;

	    // Constructor
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);  // Calling the superclass (Employee) constructor
	        this.programmingLanguage = programmingLanguage;
	    }

	    // Getter and Setter methods for programmingLanguage
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    /**
	     * Displays the details of the developer.
	     */
	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();  // Call the parent method to display common employee details
	        System.out.println("Programming Language: " + programmingLanguage);
	    }

}
