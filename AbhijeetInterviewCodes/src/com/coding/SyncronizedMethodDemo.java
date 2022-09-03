package com.coding;

public class SyncronizedMethodDemo {
	public static void main(String[] args) {
		
		A a = new A();
		
		A a1 = new A();
		
		B b = new B(a);
		b.start();
		C c = new C(a1);
		c.start();
	}
}
class A{
	 public void m1() {
		synchronized (A.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+i);
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread{

	A a;
	
	
	public B(A a) {
		
		this.a = a;
	}


	@Override
	public void run() {
		a.m1();
	}
	
}
class C extends Thread{
	
	A a;

	public C(A a) {
		
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
	
}