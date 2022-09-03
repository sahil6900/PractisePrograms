package com.coding;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		FactoryClass fc = new FactoryClass();
		OS os = fc.getOs("sss");
		os.specs();
		
		
	}
}
interface OS{
	void specs();
}
class Android implements OS{

	@Override
	public void specs() {
		System.out.println("Open Source");
		
	}
	
}
class Ios implements OS{

	@Override
	public void specs() {
		System.out.println("Most secured");
		
	}
	
}
class Windows implements OS{

	@Override
	public void specs() {
		System.out.println("Depricated");
		
	}
	
}
class FactoryClass{
	public OS getOs(String str) {
		if(str.equals("Open"))
			return new Android();
		if(str.equals("Secured"))
			return new Ios();
		else
			return new Windows();
	}
}
