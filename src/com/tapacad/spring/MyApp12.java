package com.tapacad.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Load application context
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CarConfig1.class);
		
		//Get Bean
		Car car = context.getBean("bmw", Car.class);
		
		
		//Call getCarDetails()
		System.out.println(car);
		
		//close context
		context.close();
	}

}
