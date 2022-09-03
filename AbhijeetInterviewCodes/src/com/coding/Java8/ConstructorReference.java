package com.coding.Java8;

public class ConstructorReference {
	public static void main(String[] args) {
		Pankaj1 p = Sahil1::new;
		p.m1();
		
		Pankaj1 p2 = ()->new Sahil1();
		p2.m1();
		
		Sahil1 s = new Sahil1();
		Pankaj1 p3 = s::m2;
		p3.m1();
		
		
		Sahil1 s1 = new Sahil1();
		Pankaj1 p4 = ()->s1.m2();
		p4.m1();
		
		Pankaj1 p5 = Sahil1::m3;
		p5.m1();
		
		Pankaj1 p6 = ()->Sahil1.m3();
		p6.m1();
		
	}
}
class Sahil1{
	public Sahil1() {
		System.out.println("hi");
	}
	
	public void m2() {
		System.out.println("sahil");
	}
	
	public static void m3() {
		System.out.println("Coder");
	}
}
interface Pankaj1{
	void m1();
}
