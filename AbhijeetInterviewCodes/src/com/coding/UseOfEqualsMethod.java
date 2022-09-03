package com.coding;

public class UseOfEqualsMethod {
	public static void main(String[] args) {
		Person p1 = new Person("Sahil");
		
		Person p2 = new Person("Sahil");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}
}
class Person{
	String name;

	public Person(String name) {
		
		this.name = name;
	}
	
	
}
