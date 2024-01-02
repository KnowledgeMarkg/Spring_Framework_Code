package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ap =	new ClassPathXmlApplicationContext("com/Collection/CollectionConfig.xml");
     EmpInfo  emp1 = (EmpInfo) ap.getBean("empInfo");
     System.out.println(emp1);
	}

}
