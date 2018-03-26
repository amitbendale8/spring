package com.amit.springdemo;

import javax.sound.midi.Soundbank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring configeration
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		
		//call fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
