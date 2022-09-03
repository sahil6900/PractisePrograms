package com.coding.shallowcopy;

public class Student implements Cloneable {
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		 Student student = (Student) super.clone();
		 
		 student.setAddress((Address)address.clone());
		 
		 return student;
	}
	
	
	
}
