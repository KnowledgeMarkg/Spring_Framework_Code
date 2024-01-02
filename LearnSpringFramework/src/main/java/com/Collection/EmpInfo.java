package com.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmpInfo {
	private String name;
	private Set<String> phones;
	private List<String> address;
	private Map<String, String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public EmpInfo(String name, Set<String> phones, List<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmpInfo [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}

}
