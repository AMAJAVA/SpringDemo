package com.ama.springdemo;

public class BaseballCoach implements Coach{
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
	}

	// Define a constructor for the dependency Injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
 	public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

	@Override
	public String getDailyFortune() {
		return "Just do it: " + this.fortuneService.getFortune();
	}

}
