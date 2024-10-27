package com.tns.ifet.dayone;

public class conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		if (x != 5)
		System.out.println("Value of x is not 5");
		int age=11;
		if(age>=18)
			System.out.println(" You are eligible for Voting");
		else
			System.out.println("Sorry! You need to wait more");
		System.out.println("if else demonstration");
		int a=10, b=20, c=5;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		}
			else {
				if (c > b)
					System.out.println(c);
				else
					System.out.println(b);
		}
	}

}
