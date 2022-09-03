package com.coding;

public class FactorialUsingNormalMethodAndRecurrsion {
	public static void main(String[] args) {
		
			System.out.println(factorial(4));
			m1();
	}

	public static long factorial(long n) {
		
		if(n==0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
		
	}
	public static void m1() {
		int n=4;
		
		int factorial = 1;
		
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
