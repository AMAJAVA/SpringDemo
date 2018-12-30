package com.ama.springdemo;

public class FootballCoach implements Coach {
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	// Define a constructor for the dependency Injection
	public FootballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Essayer de marquer 3 coup francs direct!!!";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortune ==> a dependency=helper
		return this.fortuneService.getFortune();
	}

}
