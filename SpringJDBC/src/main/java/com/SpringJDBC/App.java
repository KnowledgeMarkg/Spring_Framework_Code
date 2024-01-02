package com.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.Dao.StudentDao;
import com.SpringJDBC.Dao.StudentDaoImp;
import com.SpringJDBC.enties.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/SpringJDBC/Config.xml");
		StudentDao stuDao = (StudentDao) con.getBean("studentDao");
		Student student = new Student();
//		student.setId(4);
//		student.setName("Rohit");
//		student.setEmail("rohit@gmail.com");
//		student.setNum("877643534");
//		int insert = stuDao.insert(student);
//		System.out.println("Number Of Rows Inserted : " +insert);
		
//		student.setEmail("faizurrahman@gmail.com");
//		student.setName("Faizur Rahman");
//		student.setNum("9918198242");
//		student.setId(1);
//		int update = stuDao.update(student);
//		System.out.println("Update Success " + update);
		
//		student.setId(4);
//		int delete = stuDao.delete(student);
//		System.out.println("Delete Success "+delete);
//		Student student2 = stuDao.getStudent(1);
//		System.out.println(student2);
		
		List<Student> allStudent = stuDao.getAllStudent();
		
		for(Student st : allStudent) {
			System.out.println(st);
		}
		
	}
}
