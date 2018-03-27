package com.amit.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService; 
	
	//Create a no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowloing for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		
		return "Cricket Coach: "+fortuneService.getFortune();
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter Method");
		this.fortuneService = fortuneService;
	}

}
