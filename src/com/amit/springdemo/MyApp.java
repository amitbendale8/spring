package com.amit.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//creat the object
		Coach theCoach = new TrackCoach();
		
		
		//Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
