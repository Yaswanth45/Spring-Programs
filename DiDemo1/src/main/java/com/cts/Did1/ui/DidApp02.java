package com.cts.Did1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Did1.services.GreetService;

public class DidApp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs=(GreetService) context.getBean("r1");
		System.out.println(gs.greet("Yaswanth"));
		GreetService gs2=(GreetService) context.getBean("r2");
		System.out.println(gs2.greet("Yaswanth"));
		GreetService gs3=(GreetService) context.getBean("r3");
		System.out.println(gs3.greet("Yaswanth"));
		GreetService gs4=(GreetService) context.getBean("r4");
		System.out.println(gs4.greet("Yaswanth"));
	}

}
