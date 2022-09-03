package com.coding;

import java.util.Arrays;
import java.util.List;

public class FindingPrimeNumbersUsingStream {
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 2; j < arr.length; j++) {
				if(arr[i]%j==0) {
					count++;
					
				}
			}
			
			
			if(count==1 ) {
				
				
				System.out.println(arr[i]);
			}
		}
	}
}
