package com.demo.beans;

public class Employee {
	private int empid;
	private String name;
	private String gender;
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
	}

	public Employee(int empid, String name, String gender) {
		super();
		this.empid = empid;
		this.name = name;
		this.gender = gender;
	}
	
	
}
