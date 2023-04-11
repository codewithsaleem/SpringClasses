package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	public static void main(String[] args) {
        //Load application context
		ClassPathXmlApplicationContext context = new 
		ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get Bean
		Car car = (Car)context.getBean("bmw");
		
		//Call getDetails()
		System.out.println(car.getCarDetails());
		
		//close context object
		context.close();
	}

}
