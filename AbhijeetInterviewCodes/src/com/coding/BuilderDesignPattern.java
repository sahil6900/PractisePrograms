package com.coding;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		Employee11 e1 = new EmployeeBuillder().setId(1).getEmployee11();
		
		System.out.println(e1);
		
		Employee11 e2 = new EmployeeBuillder().setId(2).setName("sahil").getEmployee11();
		
		System.out.println(e2);
		
		
		
		
	}
}
class Employee11{
	private int id;
	private String name;
	public Employee11(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public Employee11() {
		
	}

	@Override
	public String toString() {
		return "Employee11 [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
class EmployeeBuillder{
	private int id;
	private String name;
	
	
	public EmployeeBuillder setId(int id) {
		this.id = id;
		return this;
	}
	public EmployeeBuillder setName(String name) {
		this.name = name;
		return this;
	}
	
	public Employee11 getEmployee11() {
		return new Employee11(id, name);
	}
	@Override
	public String toString() {
		return "EmployeeBuillder [id=" + id + ", name=" + name + "]";
	}
	
	
}
