package com.springLearn.LearnSpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Collection.EmpInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con =   new ClassPathXmlApplicationContext("Config.xml");
        Student st = (Student) con.getBean("Student1");
        System.out.println(st.getStudentId());
        System.out.println(st.getStudentName());
        System.out.println(st.getStudentAdd());
        Student st2 = (Student) con.getBean("student2");
        System.out.println(st2);
        
        //.....................................................................
        
       
    }
}
