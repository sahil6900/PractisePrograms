package com.coding.Java8;

public class MathodReferrence {
	public static void main(String[] args) {
		Sahil s = new Sahil();
		
		Pankaj p = s::m1;
		p.m2();
		
		Sahil s1 = new Sahil();
		
		Pankaj p1 = ()->s1.m1();
		
		p1.m2();
		
		Jagdish j = Abhijeet::m3;
		j.m4();
		
		Jagdish j1 = () -> Abhijeet.m3();
		j1.m4();
		
	}
}
class Sahil{
	public void m1() {
		System.out.println("hi");
	}
}
interface Pankaj{
	void m2();
}
class Abhijeet{
	public static void m3() {
		System.out.println("hello");
	}
}
interface Jagdish{
	void m4();
}
