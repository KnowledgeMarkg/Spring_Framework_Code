package com.autoWiring;

public class Emp {
	private Address empAdd;

	public Address getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}

	public Emp(Address empAdd) {
		super();
		this.empAdd = empAdd;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [empAdd=" + empAdd + "]";
	}

}
