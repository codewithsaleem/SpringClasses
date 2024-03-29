package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp3 {

	public static void main(String[] args) {
		//Load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get Bean
		Car car = (Car)context.getBean("nano");
		
		//Call getCarDetails()
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());
		
		//close context
		context.close();

	}

}
