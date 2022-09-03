package com.coding;

public class SingleTonUsingThreadClass {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton1 obj1 = Singleton1.getInstance();

			}
		});

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton1 obj1 = Singleton1.getInstance();

			}
		});
		
		t.start();
		t1.start();
	}
}

class Singleton1 {
	private static Singleton1 singleton1 = null;

	String str;

	private Singleton1() {
		str = "sahil";

		System.out.println(str);
	}

	public synchronized static Singleton1 getInstance() {
		if (singleton1 == null) {
			return singleton1 = new Singleton1();
		} else {
			return singleton1;
		}
	}
}
