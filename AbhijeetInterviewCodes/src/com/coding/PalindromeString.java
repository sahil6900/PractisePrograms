package com.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String or Number");
		
		String original = br.readLine();
		
		String lowerCase = original.toLowerCase();
		
		String reverse = "";
		
		for (int i = lowerCase.length()-1; i >= 0; i--) {
			
			reverse = reverse + lowerCase.charAt(i);
			
		}
		if (lowerCase.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}
