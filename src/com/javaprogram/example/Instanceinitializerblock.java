package com.javaprogram.example;

public class Instanceinitializerblock {

	int speed;

	Instanceinitializerblock(){System.out.println("speed is "+speed);}

	{
		speed = 100;
	}

	public static void main(String args[]) {
		Instanceinitializerblock b1 = new Instanceinitializerblock();
		Instanceinitializerblock b2 = new Instanceinitializerblock();
	}
}
