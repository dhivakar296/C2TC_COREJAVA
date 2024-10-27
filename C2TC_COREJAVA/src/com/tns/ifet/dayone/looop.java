package com.tns.ifet.dayone;

public class looop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;

        System.out.println("Using while loop:");
        while (x <= 5) {
            System.out.println(x);
            x++;
        }

        System.out.println("Using do-while loop:");
        x = 6;
        do {
            System.out.println(x);
            x++;
        } while (x <= 5);
	}

}
