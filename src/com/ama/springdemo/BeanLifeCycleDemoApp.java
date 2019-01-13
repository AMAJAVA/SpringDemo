package com.ama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file (create spring Container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		 // call methods on the bean 
        System.out.println(theCoach.getDailyWorkout());
		
		// close spring container 
		context.close();
		// When the scope of the bean = prototype than we need to call manually the destroy method
		((BaseballCoach)theCoach).doMyCleanupStuff();
	}
}
