package com.coding.shallowcopy;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("Sangli",416416);
		
		Student s = new Student(1, "Sahil", addr);
		
		Student clone = (Student)s.clone();
		
		clone.getAddress().setCity("Pune");
		
		System.out.println(s);
		
		System.out.println(clone);
	}

}
