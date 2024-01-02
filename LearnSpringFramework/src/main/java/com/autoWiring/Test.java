package com.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("com/autoWiring/Config.xml");
	Emp em = (Emp) ap.getBean("emp1");
	System.out.println(em);
	}

}
