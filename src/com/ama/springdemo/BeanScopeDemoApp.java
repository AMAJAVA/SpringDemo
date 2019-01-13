package com.ama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file (create spring Container)
		ClassPathXmlApplicationContext beanScopeContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach firstCoach = beanScopeContext.getBean("myCoach", Coach.class);
		Coach SecondCoach = beanScopeContext.getBean("myCoach", Coach.class);
		
		// check if the two bean are the same 
		boolean result = firstCoach.hashCode() == SecondCoach.hashCode();
		System.out.println("Point the same bean reference: " +result);
		System.out.println("Memory location of the firstCoach : " + firstCoach);
		System.out.println("Memory location of the SecondCoach : " + SecondCoach);
		
		// close spring container 
		beanScopeContext.close();
	}

}
