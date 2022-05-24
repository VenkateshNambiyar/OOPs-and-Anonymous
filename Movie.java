package com.weekend;

import java.util.Scanner;
import java.util.regex.*;

public class Movie extends Holiday {
	
	public void showTime(final String show) {
		Pattern checkShow = Pattern.compile("[1-4]{1}");
		
		Matcher matchTime = checkShow.matcher(show);
		
		if (matchTime.find() && matchTime.group().equals(show)) {
			Integer booking = Integer. parseInt(show);
			
			ticket(booking);
		} else {
			System.out.println("Invalid Selection so kindly Select valid Show Timing");
		}
	}

	private final void ticket (final Integer booking) {

		switch (booking) {
			case 1 -> System.out.println("Thankyou for Booking Morning Show.. Have a Great Fun!!!");
			case 2 -> System.out.println("Thankyou for Booking Afternoon Show.. Have a Great Fun!!!");
			case 3 -> System.out.println("Thankyou for Booking Evening Show.. Have a Great Fun!!!");
			case 4 -> System.out.println("Thankyou for Booking Night Show.. Have a Great Fun!!!");
			default -> System.out.println("Welcome to Java Cinemas");
		}
	}
}