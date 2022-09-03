package com.coding;

public class CreateThreadUsingRunnableInterface {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		
		Thread t = new Thread(t1);
		t.start();
		
	}
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Sahil "+i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
