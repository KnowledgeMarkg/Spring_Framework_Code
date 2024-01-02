package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       StudentDao stdDao = context.getBean("studentDao", StudentDao.class);
       Student st = new Student(101, "Kausar", "Bangalore");
       int i = stdDao.insert(st);
       System.out.println("Done : "+i );
    }
}
