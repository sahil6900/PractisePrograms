package com.coding;

import java.util.Scanner;

public class GetPrimeNumbers {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 'n' upto which to find prime numbers");
		
		try {
			int nextInt = s.nextInt();
			//int read = br.read();
			for (int i = 2; i <= nextInt; i++) {
				int count=0;
				for (int j = 1; j <= i; j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(i+" ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
	}
}
