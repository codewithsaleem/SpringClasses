package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp5 {
	public static void main(String[] args) {
		//Load application context
				ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
				
	    //Get Bean
				Car car1 = (Car)context.getBean("audi");
				Car car2 = (Car)context.getBean("audi");
				
		//Call getDetails()
				System.out.println(car1);
				System.out.println(car2);
				
		//close context object
				context.close();
	}
}
