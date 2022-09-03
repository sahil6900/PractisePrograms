package com.coding;

public class DuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 2, 1, 5, 6, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0 && count>1) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
