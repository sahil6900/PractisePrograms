package com.coding;

public class SingletonDemo {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstance();
		
		SingleTon obj2 = SingleTon.getInstance();
		
		SingleTon obj3 = SingleTon.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj1);
		System.out.println(obj1);
		
		if(obj1==obj2 && obj2==obj3) {
			System.out.println("Same object");
		}else {
			System.out.println("Object is not same");
		}
	}
}
class SingleTon{
	private static SingleTon singleTon=null;
	
	String str;
	private SingleTon() {
		str = "Sahil";
		
		System.out.println(str);
	}
	
	public static SingleTon getInstance() {
		if(singleTon==null) {
			return singleTon= new SingleTon();
		}
		else {
			return singleTon;
		}
		
	}
}
