package com.cts.Did1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Did1.services.GreetService;
import com.cts.Did1.services.GreetServiceEnhancedImpl;

public class DidApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		
		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("r2");
		System.out.println(gs2.greet("Yaswanth"));
		gs2.setGreeting("Vanakkam");
	
		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("r2");
		System.out.println(gs3.greet("Yaswanth"));
		
		GreetService gs4=(GreetService) context.getBean("g3");
		System.out.println(gs4.greet("Yaswanth"));
	}

}
