package com.javaprogram.example;

import java.util.Calendar;
import java.util.Date;

public class Testing {
public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
    System.out.println(calendar);
	Date firstDateofPreviousMonth = calendar.getTime();
	System.out.println(firstDateofPreviousMonth);
}
}
