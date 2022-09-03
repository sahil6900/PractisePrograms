package com.coding;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr1 = {1,10,0,6,40,33,21};
		int index=0;
		for (int i = 0; i < arr1.length; i++) {
			index=i;
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[j]<arr1[index]) {
					index=j;
				}
			}
			int temp = arr1[index];
			
			
			arr1[index]=arr1[i];
			
			arr1[i]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr1));
	}
}
