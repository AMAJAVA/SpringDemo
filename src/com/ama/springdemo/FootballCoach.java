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
	
	// add an init method 
	public void doMyStartupStuff() {
		System.out.println("FootBallCoach: inside method doMyStartupStuff");		
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("FootballCoach: inside method doMyCleanupStuff");		
	}
}
