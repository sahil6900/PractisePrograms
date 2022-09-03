package com.coding;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void main (String[] args) {
	
		int[] arr = {10,9,6,36,2,56};
		
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp = arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
