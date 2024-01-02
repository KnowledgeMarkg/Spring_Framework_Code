package com.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ap  = new ClassPathXmlApplicationContext("com/Reference/RefConfig.xml");
		A classA = (A) ap.getBean("classA");
		System.out.println(classA.getX());
		System.out.println(classA.getOb().getY());
	}

}
