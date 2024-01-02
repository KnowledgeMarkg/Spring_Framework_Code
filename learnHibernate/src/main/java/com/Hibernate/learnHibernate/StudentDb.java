package com.Hibernate.learnHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StudentDb {
	@Id
	private int id;
	private String name;
	private String email;
	private String numb;

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


	public StudentDb(int id, String name, String email, String num) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.numb = num;
	}

	public StudentDb() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", num=" + numb + "]";
	}

	public String getNumb() {
		return numb;
	}

	public void setNumb(String numb) {
		this.numb = numb;
	}

}
