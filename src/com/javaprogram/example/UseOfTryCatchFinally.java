package com.javaprogram.example;

public class UseOfTryCatchFinally {
	public static void main(String[] args) {
		try {
			int i=1;
			int b=i/0;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			
			

		}
		finally {
			System.out.println("himanshu");
		}
	}
}
