package com.coding;

public class PalindromeNumber {
	public static void main(String[] args) {
		int rem=0,sum=0,temp=0;
		
		int n = 500;
		temp=n;
		while (n>0) {
			rem=n%10;
			sum = (sum * 10) + rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Yes palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}
