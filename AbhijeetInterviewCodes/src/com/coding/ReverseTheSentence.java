package com.coding;

public class ReverseTheSentence {
	public static void main(String[] args) {
		String str = "I love my country";
		
		String str1 = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			str1+=str.charAt(i);
		}
		System.out.println(str1);
		
		System.out.println("___________********__________");
		
		System.out.println(str);
		
		String[] split = str.split(" ");
		
		StringBuffer reverse2;
		for (int i = split.length-1; i >=0; i--) {
			StringBuffer sb = new StringBuffer(split[i]);
			 reverse2 = sb.reverse();
			 System.out.print(reverse2+" ");
		}
		
		
		
		
	}
}
