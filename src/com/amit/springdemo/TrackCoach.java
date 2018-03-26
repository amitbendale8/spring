package com.amit.springdemo;

public class TrackCoach implements Coach {
	
	//define private field for the dependency
	private FortuneService fortuneService;
	public TrackCoach(){
		
	}
	
	//define constructor
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		//User fortune service
		return "Just do it: "+fortuneService.getFortune();
	}

}
