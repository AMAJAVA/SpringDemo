package com.ama.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//add new fields for email and team
	private String emailAdress;
	private String team;
	
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// our setter method called by spring when inject the dependecy
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		 return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
