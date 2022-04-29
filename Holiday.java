package com.weekend;

import java.util.Scanner;

public class Holiday extends Weekend  {
	
	public void tour(final String location) {
		System.out.println("Thanking For Choosing" + location + "Location.." );
	}
	
	public void restaurant(final String hotel) {
		System.out.println("Welcome to Our Resort :" +  hotel);
		System.out.println("Thanking You!!!! Your Booking Done Successfully");
	}
	
	public void playGround() {
		System.out.println("Enjoy Your Life");
	}
}