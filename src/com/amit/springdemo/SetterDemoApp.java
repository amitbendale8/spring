package com.amit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve the bean
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call method
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
