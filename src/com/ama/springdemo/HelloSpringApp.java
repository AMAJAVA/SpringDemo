package com.ama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file (create spring Container)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // retrieve bean from spring container 
        Coach theCoach = context.getBean("footballCoach", Coach.class);
        
        // call methods on the bean 
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
