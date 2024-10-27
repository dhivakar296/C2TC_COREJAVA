package com.tns.ifet.dayone;

public class breaKContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example using break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Terminates the loop when i is 6
            }
            System.out.println("Number: " + i);
        }

        // Example using continue statement
        System.out.println("\nExample using continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue; // Skips the rest of the loop iteration when i is 6
            }
            System.out.println("Number: " + i);
        }
	}

}
