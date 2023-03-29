package com.javaprogram.multithreading;

class Example extends Thread {
	public void run() {
		System.out.println("Thread Example ");

	}
}

public class ThreadExample {
	public static void main(String[] args) {
		Example ex = new Example();
		ex.start();
	}
}
