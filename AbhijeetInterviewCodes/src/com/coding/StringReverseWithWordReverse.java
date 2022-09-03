package com.coding;

public class StringReverseWithWordReverse {
	public static void main(String[] args) {
		String str = "Abhijeet M Patil";
		
		String lowerCase = str.toLowerCase();
		
		String[] split = lowerCase.split(" ");
		
		String string="";
		for (int i = split.length-1; i >=0; i--) {
			
			StringBuffer sb = new StringBuffer(split[i]);
			String string2 = sb.reverse().toString();
			string=string+string2+" ";
		}
		System.out.println(string);
		
		
	}
}
