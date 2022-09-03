package com.coding;

import java.util.Arrays;

public class BubbleSortingDemo {
	public static void main(String[] args) {
		int[] arr = {204,101,7,40,2,1,25,33,100,90,105,36,50,43,29,62,50};
		
	boolean swapped = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
					swapped = true;
					System.out.println(Arrays.toString(arr));
					System.out.println(swapped);
				}
			}
		}
		
		
	}
}
