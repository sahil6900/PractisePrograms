package com.coding;

public class FactoryDesignDemo {
	public static void main(String[] args) {
		Vehicle v = Factory.getInstance("volks");
		v.specs();
		
		
	}
}
interface Vehicle{
	void specs();
}
class Volkswagen implements Vehicle{

	@Override
	public void specs() {
		System.out.println("Most Reliable Cars");
		
	}
	
}
class Maruti implements Vehicle{

	@Override
	public void specs() {
		System.out.println("Light-Weight Cars");
		
	}
	
}
class Kia implements Vehicle{

	@Override
	public void specs() {
		System.out.println("Bigger in size");
		
	}
	
}
class Factory{
	public static Vehicle getInstance(String str) {
		if(str=="maruti") {
			return new Maruti();
		}
		if(str=="volkswagen") {
			return new Volkswagen();
		}
		else {
			return new Kia();
		}
	}
}
