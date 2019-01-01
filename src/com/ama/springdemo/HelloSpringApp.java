package com.ama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file (create spring Container)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container 
        TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);
        
        // call methods on the bean 
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAdress());
        System.out.println(theCoach.getTeam());
        // close the context
        context.close();
    }
}
