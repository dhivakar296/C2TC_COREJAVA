// Program to demonstrate final Variable
package com.tns.ifet.day6.usingfinal;

public class FinalVariable {

	// final int x; // final instance variable must be initialized

	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		System.out.println("Value of Y: " + Y);
	}

}
