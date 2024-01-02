package com.SpringJDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJDBC.enties.Student;

public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student stu) {
		// TODO Auto-generated method stub
		String q = "insert into Student (id, name, email, num) values (?, ?, ?,?)";
		int update = this.jdbcTemplate.update(q, stu.getId(), stu.getName(), stu.getEmail(), stu.getNum());
		
		return update;
	}

	@Override
	public int update(Student stu) {
		String q = "update Student set name = ? , email = ? , num = ?  where id = ?";
		int update = this.jdbcTemplate.update(q, stu.getName(), stu.getEmail(), stu.getNum(), stu.getId());
		return update;
	}

	@Override
	public int delete(Student stu) {
		String q = "delete from Student where id = ?";
		int r = this.jdbcTemplate.update(q, stu.getId());
		return r;
	}

	@Override
	public Student getStudent(int student_id) {
		String q = "select * from Student where id = ?";
		RowMapper<Student> rowMapper =  new RowMapperImp();
		Student stu = this.jdbcTemplate.queryForObject(q, rowMapper, student_id);
		return stu;
	}

	@Override
	public List<Student> getAllStudent() {
		String q = "select * from Student";
		RowMapper<Student> rowMapper =  new RowMapperImp();
		List<Student> students = this.jdbcTemplate.query(q, rowMapper);
		return students;
	}

}
