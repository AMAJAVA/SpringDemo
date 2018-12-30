package com.ama.springdemo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Hi! It's your lucky day";
	}

}
