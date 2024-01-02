package com.SpringJDBC.Dao;

import java.util.List;

import com.SpringJDBC.enties.Student;

public interface StudentDao {
    public int insert(Student stu);
    public int update(Student stu);
    public int delete(Student stu);
    public Student getStudent(int student_id);
    public List<Student> getAllStudent();
}
