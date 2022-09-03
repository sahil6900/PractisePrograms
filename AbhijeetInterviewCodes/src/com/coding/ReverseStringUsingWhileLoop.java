package com.coding;

public class ReverseStringUsingWhileLoop {
	public static void main(String[] args) {
		String str = "Sahil";
		
		char[] charArray = str.toCharArray();
		
		int start=0;
		int end = charArray.length-1;
		
		char temp;
		while(start<end) {
			temp=charArray[start];
			charArray[start]=charArray[end];
			charArray[end]=temp;
			
			start++;
			end--;
		}
		
		String reverse = new String(charArray);
		
		System.out.println(reverse);
		
		System.out.println("--------********--------");
		
		//Using bubble sort
		char temp1;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i]<charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(charArray);
	}
}
