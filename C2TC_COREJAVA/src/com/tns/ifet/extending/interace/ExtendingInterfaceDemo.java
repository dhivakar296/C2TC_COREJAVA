package com.tns.ifet.extending.interace;

public class ExtendingInterfaceDemo implements ChildInterface  {
	public void print() { 
		System.out.println("print method");
	}

	// Override ChildInterface method
	public void show() {
		System.out.println("show Method");
	}

}
