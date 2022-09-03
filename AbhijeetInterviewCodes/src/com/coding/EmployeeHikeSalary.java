package com.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHikeSalary {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10000, "Sahil"));
		list.add(new Employee(15000, "Rushabh"));
		list.add(new Employee(20000, "Pankaj"));
		list.add(new Employee(25000, "Ankiet"));
		list.add(new Employee(30000, "Rahul"));
		list.add(new Employee(35000, "Saniket"));
		list.add(new Employee(40000, "Viru"));
		list.add(new Employee(45000, "Jay"));
		list.add(new Employee(50000, "Akshaj"));
		
		List<Employee> collect = list.stream().filter(s->s.getSalary()>10000).collect(Collectors.toList());
		
		List<Double> collect2 = collect.stream().map(s->s.getSalary()+s.getSalary()*1.1).collect(Collectors.toList());
		System.out.println(collect2);
		
	}
}
class Employee{
	private double salary;
	private String name;
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeHikeSalary [salary=" + salary + ", name=" + name + "]";
	}
	
}
