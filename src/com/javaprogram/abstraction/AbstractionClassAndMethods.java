package com.javaprogram.abstraction;

abstract class Test {
	abstract void run();
}

public class AbstractionClassAndMethods extends Test{

	void run() {
		System.out.println("Example of Abstrsact Method And Class");
	}

	public static void main(String[] args) {
		Test test = new  AbstractionClassAndMethods();
		test.run();
	}

}
