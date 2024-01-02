package com.autoWiring.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("com/autoWiring/anotation/Config.xml");
	Emp em = (Emp) ap.getBean("emp1");
	System.out.println(em);
	}

}
