package com.coding;

import java.util.ArrayList;
import java.util.List;

public class SortingEmployeeAccordingToAgeAndSalary {
	public static void main(String[] args) {
		List<Employee1> li = new ArrayList<>();
		li.add(new Employee1("Sahil", 100000, 26));
		li.add(new Employee1("Prakash", 200000, 32));
		li.add(new Employee1("Abhijeet", 150000, 21));
		li.add(new Employee1("Ketan", 300000, 19));
		li.add(new Employee1("Chetan", 50000, 35));
		
		li.stream().filter(age->age.getAge()>25).map(salary->salary.getSalary()+1000).forEach(x->System.out.println(x));
		
	}
	
}
class Employee1{
	private String name;
	private long salary;
	private int age;
	public String getName() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee1(String name, long salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}

