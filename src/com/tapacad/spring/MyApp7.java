package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp7 {

	public static void main(String[] args) {
		//Load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		
		//Get Bean
		Car car = context.getBean("bmw", Car.class);
		
		//Call getCarDetails()
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());
		
		//close context
		context.close();
	}

}
