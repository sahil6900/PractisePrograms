package com.flatmap.demo;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int salary;
	private List<Integer> contacts;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public List<Integer> getContacts() {
		return contacts;
	}
	public void setContacts(List<Integer> contacts) {
		this.contacts = contacts;
	}
	
	public Employee(int id, String name, int age, String gender, String department, int salary,
			List<Integer> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.contacts = contacts;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", salary=" + salary + ", contacts=" + contacts + "]";
	}
	
	
	
	
	
	
	
}
