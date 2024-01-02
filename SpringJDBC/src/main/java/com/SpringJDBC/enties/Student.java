package com.SpringJDBC.enties;

public class Student {
	private int id;
	private String name;
	private String email;
	private String num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Student(int id, String name, String email, String num) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.num = num;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", num=" + num + "]";
	}

}
