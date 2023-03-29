package com.all.sorting.programs.of.Array;

public class MaximunOfGivenArray {
	public static void main(String[] args) {
		 int a[]= {2,9,6,1,3,8};
	     int max=a[0];
	     for(int i =1;i<a.length;i++) {
	    	  if(a[i]>max) {
	    	     max=a[i];
	    	  }
	     }
	     System.out.println("Max Value of the given array is :- "+max);
	}
}
