package com.javaprogram.example;

public class PalindromeNumber {
	//1st way
//	 public static void main(String args[]){  
//		  int r,sum=0,temp;    
//		  int n=121; 
//		  temp=n;  
//		  
//		  while(n>0){    
//		   r=n%10;   
//		   sum=(sum*10)+r;    
//		   n=n/10;    
//		  }    
//		  if(temp==sum)    
//		   System.out.println("Palindrome Number ");    
//		  else    
//		   System.out.println("Not Palindrome Number");    
//		} 

	//2nd Way
	public static void main(String[] args) {
		String str = "racecar";
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		boolean isPalindrome = str.equalsIgnoreCase(reversed);
		System.out.println("Is palindrome: " + isPalindrome);
	}
}
