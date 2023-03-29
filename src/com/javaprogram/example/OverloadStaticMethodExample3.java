package com.javaprogram.example;

//Override 
public class OverloadStaticMethodExample3 {
	public static void display() {
		System.out.printf("display() method of the parent class.");
	}

	public static void display(int a) {
		System.out.printf("display() method  parent class.");
	}

	public static void main(String args[]) {
		OverloadStaticMethodExample3 pc = new OverloadStaticMethodExample3();

//calling display() method by parent class object  
		pc.display();
	}
}
