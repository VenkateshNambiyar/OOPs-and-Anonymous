package com.weekend;

import java.util.Scanner;
import java.util.regex.*;

class Purchase extends Holiday {
	
	public void shop(final String size) {
		Pattern validateSize = Pattern.compile("[0-9]");
		
		Matcher shoes = validateSize.matcher(size);
		
		if (shoes.find() && shoes.group().equals(size)) {
			System.out.println("Your shoes size collections are avaiable");
		} else {
			System.out.println("Sorry! Your shoes size is current unavailable");
		}
	}

	public void shop(final String size, final String color) {
		Pattern pin = Pattern.compile("^[a-zA-Z]*$");
		
		Matcher dress = pin.matcher(color);
		
		if (dress.find() && dress.group().equals(color)) {
			System.out.println("Your Fav. Color collections are avaiable");
		} else {
			System.out.println("Sorry! Your selected color is current unavailable");
		}
	}
}

