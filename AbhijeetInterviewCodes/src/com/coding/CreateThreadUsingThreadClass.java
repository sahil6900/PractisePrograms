package com.coding;

public class CreateThreadUsingThreadClass {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
}
class Thread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				
				System.out.println("Hello Sahil");
				Thread.sleep(3000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
