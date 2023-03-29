package com.javaprogram.oops.concept.example;

class Vehical {
	void run() {
		System.out.println("Vehical is running");
	}
}

public class MethodOverriding extends Vehical{

	void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
     methodOverriding.run();
	}
}	
