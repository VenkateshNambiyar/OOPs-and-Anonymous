package com.weekend;

import java.util.*;

public class WeekendPlans {
	private final Scanner scanner = new Scanner(System.in);
	
	private String location;
	private String hotel;
	private String show;
	private String size;
	private String color;
	private Integer store;
	private Integer firstCode;
	private Integer secondCode;
	
	private final void assignValue() {
		System.out.print("Enter your Location :\t "); 
		location = scanner.nextLine();
		
		System.out.print("Book your Resort :\t "); 
		hotel = scanner.nextLine();
	}
	
	private final void assignNumber() {
		System.out.println("Select Show Time : 1) Morning Show  \t  2) Afternoon Show \t 3)Evening Show  \t 4) Night Show :\t ");
		System.out.print("Enter Your Show Timing : \t");
		show = scanner.nextLine();
	}
	
	private final void assignData() {
		System.out.print("Enter Your Shoes size :\t");
		size = scanner.nextLine();
		
		System.out.print("Enter Your Color : \t");
		color = scanner.nextLine();
	}
	
	private final void trip() {
		assignValue();
		Purchase goods = new Purchase();
		
		goods.playGround();
		goods.tour(location);
		goods.restaurant(hotel);
	}
	
	private final void mall() {
		assignData();
		Purchase accessories = new Purchase();
		
		accessories.shop(size);
		accessories.shop(size,color);
	}
	
	private final void theatre() {
		assignNumber();
		Movie cinema = new Movie();
		
		cinema.showTime(show);
	}
	
	private final void cricket() {
		Holiday sports = new Holiday() {
			
			public void playGround() {
				System.out.println("Live that Moment");
			}
		};
		sports.playGround();
		firstCode = sports.hashCode();
		
		System.out.println("Anonymous Inner Class Hashcode :" + firstCode); 
		WeekendPlans party = new WeekendPlans();
		
		secondCode = party.hashCode();
		
		System.out.println("class Object  Hashcode :" + secondCode);
		
		if (firstCode.equals(secondCode)) {
			System.out.println("Anonymous inner class hashCode and class Object hashCode are SAME");
		} else {
			System.out.println("Anonymous inner class hashCode and class Object hashCode are !! NOT SAME!!");
		}
	}
	
	private final void plans() {
		System.out.println("Select Weekend Plans : 1)Trip   \t  2)Theatre \t 3)Mall  \t 4)Cricket :\t ");
		while (true) {
			
			try {
				selectPlans();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Selection.. So Select Valid Plan");
				scanner.nextLine();
			}
		}
	}
	
	private final void selectPlans() {
		WeekendPlans weekendObject = new WeekendPlans();
			
		store = scanner.nextInt();
		
		switch(store) {
		case 1:
			weekendObject.trip();
			break;
		case 2:
			weekendObject.theatre();
			break;
		case 3:
			weekendObject.mall();
			break;
		case 4:
			weekendObject.cricket();
			break;
		default:
			System.out.println("Invalid Selection so Kindly Retry");
		}
	}
	
	public static void main(String[] args) {
		WeekendPlans resort = new WeekendPlans();
		
		resort.plans();
	}
}